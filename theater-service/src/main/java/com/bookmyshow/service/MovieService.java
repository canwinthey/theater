package com.bookmyshow.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.bookmyshow.model.City;
import com.bookmyshow.model.Movie;
import com.bookmyshow.model.Screen;
import com.bookmyshow.model.Seat;
import com.bookmyshow.model.Theater;
import com.bookmyshow.repository.CityRepository;
import com.bookmyshow.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	private final Map<String, Theater> theatres;
    private final Map<String, Screen> screens;
    private final Map<String, Seat> seats;

    public MovieService() {
        this.theatres = new HashMap<>();
        this.screens = new HashMap<>();
        this.seats = new HashMap<>();
    }

    public List<Movie> getMovieByCity(String cityName) {
    	List<Movie> movieList = null;
    	City city = cityRepository.findByCityName(cityName);
    	if(city != null && !CollectionUtils.isEmpty(city.getTheaterList())) {
    		List<Theater> theaterList = city.getTheaterList();
    		if(!CollectionUtils.isEmpty(city.getTheaterList())){
    		}
    	}
    	return movieList;
    }
    
    public Seat getSeat(@NonNull final String seatId) throws Exception {
        if (!seats.containsKey(seatId)) {
            throw new Exception(seatId);
        }
        return seats.get(seatId);
    }

    public Theater getTheatre(@NonNull final String theatreId) throws Exception {
        if (!theatres.containsKey(theatreId)) {
            throw new Exception(theatreId);
        }
        return theatres.get(theatreId);
    }

    public Screen getScreen(@NonNull final String screenId) throws Exception {
        if (!screens.containsKey(screenId)) {
            throw new Exception(screenId);
        }
        return screens.get(screenId);
    }

}
