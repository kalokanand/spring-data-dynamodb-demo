package com.kalokanand.springdatadynamodbdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalokanand.springdatadynamodbdemo.model.MovieDetail;
import com.kalokanand.springdatadynamodbdemo.repositories.MovieDetailRepository;
import com.kalokanand.springdatadynamodbdemo.service.MovieService;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

  @Autowired
  private MovieDetailRepository movieDetailsRepository;

  @Override
  public MovieDetail addMovieInfo(MovieDetail movieDetail) {
    return movieDetailsRepository.save(movieDetail);
  }

  @Override
  public List<MovieDetail> fetchAllMovieDetails() {
    return (List<MovieDetail>) movieDetailsRepository.findAll();
  }

  @Override
  public void deleteOneMovie(String id) {
    movieDetailsRepository.deleteById(id);
  }
}