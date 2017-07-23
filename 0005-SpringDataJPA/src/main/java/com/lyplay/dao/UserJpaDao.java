package com.lyplay.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyplay.po.User;

public interface UserJpaDao extends JpaRepository<User, Long>  {

	User findByName(String name);
	
}
