package com.sparta.ps.eventswebsite.repositories;

import com.sparta.ps.eventswebsite.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
