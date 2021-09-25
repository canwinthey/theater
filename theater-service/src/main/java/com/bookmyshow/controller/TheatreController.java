package com.bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.model.Screen;
import com.bookmyshow.model.Theater;
import com.bookmyshow.service.TheatreService;

@RestController
public class TheatreController {
    
	@Autowired
	private TheatreService theatreService;
	
    
    @GetMapping("/moviebycity")
    public ResponseEntity<String> getMovieByCity() {
    	return new ResponseEntity<String>("", HttpStatus.OK);
    }
    
    @GetMapping("/getTheater")
    public ResponseEntity<Theater> getTheater() {
    	return new ResponseEntity<Theater>(t1, HttpStatus.OK);
    }
    
    public String createTheatre(Theater theater) {
        return theatreService.createTheatre(theater);
    }

    public String createScreenInTheatre(@NonNull final String screenName, @NonNull final String theatreId) throws Exception {
        final Theater theatre = theatreService.getTheatre(theatreId);
        return theatreService.createScreenInTheatre(screenName, theatre).getId();
    }

    public String createSeatInScreen(@NonNull final Integer rowNo, @NonNull final Integer seatNo, @NonNull final String screenId) throws Exception {
        final Screen screen = theatreService.getScreen(screenId);
        return theatreService.createSeatInScreen(rowNo, seatNo, screen).getId();
    }
}
