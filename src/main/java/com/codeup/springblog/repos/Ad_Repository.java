package com.codeup.springblog.repos;

import com.codeup.springblog.models.Ad_Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Ad_Repository extends JpaRepository<Ad_Model, Long> {


}
