package com.tatsat.boothmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tatsat.boothmanagement.domain.User;


@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
