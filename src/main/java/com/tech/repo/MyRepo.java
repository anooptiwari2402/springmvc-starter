package com.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.model.MyModel;

public interface MyRepo extends JpaRepository<MyModel, Integer>{

}
