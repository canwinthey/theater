package com.bookmyshow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.model.Movie;
import com.bookmyshow.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
    
	@Autowired
	private MovieService movieService;
	
    @GetMapping("/bycity")
    public ResponseEntity<List<Movie>> getMovieByCity(String cityName) {
    	return new ResponseEntity<List<Movie>>(movieService.getMovieByCity(cityName), HttpStatus.OK);
    }
    
}
