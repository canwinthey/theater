package com.bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.service.TheatreService;

@RestController
public class MovieController {
    
	@Autowired
	private TheatreService theatreService;
	
    @GetMapping("/moviebycity")
    public ResponseEntity<String> getMovieByCity() {
    	return new ResponseEntity<String>("Welcome Prasanna", HttpStatus.OK);
    }
    
}
