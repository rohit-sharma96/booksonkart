package com.myspace.booksonkart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myspace.booksonkart.entities.HomePageEntity;

public interface HomeDAO extends JpaRepository<HomePageEntity, Integer> {

}
