package com.myspace.booksonkart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.myspace.booksonkart.dao.HomeDAO;
import com.myspace.booksonkart.entities.HomePageEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HomeService  {
	
	@Autowired
	private HomeDAO homeDAO;
	
	public List<HomePageEntity> getHomePageContent(){
		log.info(this.getClass()+" Method Name : getHomePageContent");
		return this.homeDAO.findAll();
		
	}

}
