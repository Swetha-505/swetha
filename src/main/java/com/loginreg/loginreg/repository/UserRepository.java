package com.loginreg.loginreg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loginreg.loginreg.model.User;
@Repository

public interface UserRepository extends JpaRepository<User,Long>{

	User findByUsername(String username);
	

}
