package com.kalokanand.springdatadynamodbdemo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalokanand.springdatadynamodbdemo.model.MovieDetail;
import com.kalokanand.springdatadynamodbdemo.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

  @Autowired
  private MovieService movieService;

  @PostMapping
  public ResponseEntity addMovieDetails(@RequestBody MovieDetail movieDetail) {
    movieDetail = movieService.addMovieInfo(movieDetail);
    return ResponseEntity.created(URI.create("/" + movieDetail.getId())).build();
  }

  @GetMapping
  public List<MovieDetail> getAllMovieDetails() {
    return movieService.fetchAllMovieDetails();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity deleteOneMovie(@PathVariable("id") String id) {
    movieService.deleteOneMovie(id);
    return ResponseEntity.accepted().build();
  }

}