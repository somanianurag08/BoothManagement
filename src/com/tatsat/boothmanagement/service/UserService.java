package com.tatsat.boothmanagement.service;

import java.util.List;

import com.tatsat.boothmanagement.domain.User;

public interface UserService {

	public void save(User user);

	public void delete(User user);

	public List<User> findAll();

}
