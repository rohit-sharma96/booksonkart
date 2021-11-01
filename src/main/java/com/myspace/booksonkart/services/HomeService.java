package com.myspace.booksonkart.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myspace.booksonkart.entities.HomePageEntity;

public interface HomeService extends JpaRepository<HomePageEntity, Integer> {

}
