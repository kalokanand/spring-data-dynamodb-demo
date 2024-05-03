package com.kalokanand.springdatadynamodbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.kalokanand.springdatadynamodbdemo.repositories.MovieDetailRepository;

@SpringBootApplication
@EnableJpaRepositories(excludeFilters =
@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = MovieDetailRepository.class))
public class SpringDataDynamodbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDynamodbDemoApplication.class, args);
	}

}
