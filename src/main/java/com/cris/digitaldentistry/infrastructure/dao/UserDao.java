package com.cris.digitaldentistry.infrastructure.dao;

import com.cris.digitaldentistry.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
