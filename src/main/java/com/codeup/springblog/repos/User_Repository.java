package com.codeup.springblog.repos;

import com.codeup.springblog.models.User_Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_Repository extends JpaRepository<User_Model, Long> {
}
