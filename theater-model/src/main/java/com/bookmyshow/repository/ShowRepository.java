/**
 * 
 */
package com.bookmyshow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.model.Show;

/**
 * @author LSPL392
 * @param <Movie>
 *
 */
@Repository
public interface ShowRepository extends CrudRepository<Show, Long> {


}
