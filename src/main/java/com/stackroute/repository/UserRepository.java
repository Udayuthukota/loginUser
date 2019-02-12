package com.stackroute.repository;

import com.stackroute.domain.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserCredentials,String> {

}
