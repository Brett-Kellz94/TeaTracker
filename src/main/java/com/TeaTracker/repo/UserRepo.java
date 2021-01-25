package com.TeaTracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TeaTracker.pojos.User;


/**
 * 
 * JpaRepository for interacting with {@link User}
 *
 */

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
