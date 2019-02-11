package com.stackroute.login.repository;

import com.stackroute.login.domain.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserCredentials,String> {
//    @Query("SELECT userCredentials from UserCredentials userCredentials WHERE userCredentials.userName=?0")      //add customizable query
//    List<UserCredentials> findTrackByName(String name);


}
