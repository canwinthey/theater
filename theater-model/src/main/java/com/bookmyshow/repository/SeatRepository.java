/**
 * 
 */
package com.bookmyshow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.model.Seat;

/**
 * @author LSPL392
 * @param <Movie>
 *
 */
@Repository
public interface SeatRepository extends CrudRepository<Seat, Long> {


}
