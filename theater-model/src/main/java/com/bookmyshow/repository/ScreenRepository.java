/**
 * 
 */
package com.bookmyshow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.model.Screen;

/**
 * @author LSPL392
 * @param <Movie>
 *
 */
@Repository
public interface ScreenRepository extends CrudRepository<Screen, Long> {


}
