package com.sunglowsys.repositories;

import com.sunglowsys.enties.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
