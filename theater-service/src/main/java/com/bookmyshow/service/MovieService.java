package com.bookmyshow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.bookmyshow.model.City;
import com.bookmyshow.model.Movie;
import com.bookmyshow.model.Theater;
import com.bookmyshow.repository.CityRepository;
import com.bookmyshow.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
    public List<Movie> getMovieByCity(String cityName) {
    	List<Movie> movieList = null;
    	City city = cityRepository.findByCityName(cityName);
    	if(city != null && !CollectionUtils.isEmpty(city.getTheaterList())) {
    		List<Theater> theaterList = city.getTheaterList();
    		if(!CollectionUtils.isEmpty(city.getTheaterList())){}
    	}
    	return movieList;
    }
}
