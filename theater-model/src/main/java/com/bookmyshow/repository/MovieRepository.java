/**
 * 
 */
package com.bookmyshow.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.model.Movie;

/**
 * @author LSPL392
 * @param <Movie>
 *
 */
@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

	public List<Movie> getMovieByCity();


}
