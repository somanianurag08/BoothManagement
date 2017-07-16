/*package com.tatsat.boothmanagement.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tatsat.boothmanagement.domain.User;
import com.tatsat.boothmanagement.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserRepository repository;

	@Override
	@Transactional
	public void save(User user) {
		repository.save(user);

	}

	@Override
	@Transactional
	public void delete(User user) {
		repository.delete(user);
	}

	@Override
	@Transactional
	public List<User> findAll() {
		return (List<User>) repository.findAll();
	}

}
*/