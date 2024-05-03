package com.kalokanand.springdatadynamodbdemo.service;

import java.util.List;

import com.kalokanand.springdatadynamodbdemo.model.MovieDetail;

public interface MovieService {

	MovieDetail addMovieInfo(MovieDetail movieDetail);

	List<MovieDetail> fetchAllMovieDetails();

	void deleteOneMovie(String id);

}
