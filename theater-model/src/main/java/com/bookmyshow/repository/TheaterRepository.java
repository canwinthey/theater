/**
 * 
 */
package com.bookmyshow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.model.Theater;

/**
 * @author LSPL392
 * @param <Movie>
 *
 */
@Repository
public interface TheaterRepository extends CrudRepository<Theater, Long> {


}
