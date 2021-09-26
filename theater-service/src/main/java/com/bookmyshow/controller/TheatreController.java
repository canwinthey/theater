package com.bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.model.Theater;
import com.bookmyshow.service.TheaterService;

@RestController
@RequestMapping("/theater")
public class TheatreController {
    
	@Autowired
	private TheaterService theaterService;
	
    @PostMapping("/create")
    public ResponseEntity<Theater> createTheatre(Theater theater) {
    	return new ResponseEntity<Theater>(theaterService.createTheatre(theater), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Theater> updateTheatre(Theater theater) {
    	return new ResponseEntity<Theater>(theaterService.updateTheatre(theater), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete")
    public void deleteTheatre(@RequestParam(name = "id") Long id) {
        theaterService.deleteTheatre(id);
    }

    @GetMapping("/getTheater")
    public ResponseEntity<Theater> getTheaterById(@RequestParam(name = "id") Long id) {
    	return new ResponseEntity<Theater>(theaterService.getTheatreById(id), HttpStatus.OK);
    }

}
