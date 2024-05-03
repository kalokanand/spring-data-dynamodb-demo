package com.kalokanand.springdatadynamodbdemo.repositories;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.kalokanand.springdatadynamodbdemo.model.MovieDetail;

@EnableScan
public interface MovieDetailRepository extends CrudRepository<MovieDetail, String>{

}
