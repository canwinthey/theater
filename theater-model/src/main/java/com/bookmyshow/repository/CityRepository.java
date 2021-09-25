/**
 * 
 */
package com.bookmyshow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.model.City;

/**
 * @author LSPL392
 * @param <Movie>
 *
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {

	public City findByCityName(String city);
}
