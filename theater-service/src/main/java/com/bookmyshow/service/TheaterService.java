package com.bookmyshow.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bookmyshow.model.Screen;
import com.bookmyshow.model.Theater;
import com.bookmyshow.repository.TheaterRepository;

@Service
public class TheaterService {

	@Autowired
	private TheaterRepository theaterRepository;
	
	public Theater getTheatreById(Long id) {
		return theaterRepository.findById(id).get();
	}

	public void deleteTheatre(Long id) {
		theaterRepository.deleteById(id);
	}

	public Theater updateTheatre(Theater theater) {
		return theaterRepository.save(theater);
	}

	public Theater createTheatre(Theater theater) {
		return theaterRepository.save(theater);
	}

}
