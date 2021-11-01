package com.myspace.booksonkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspace.booksonkart.entities.HomePageEntity;
import com.myspace.booksonkart.services.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	/***
	 * To get all details about the content shown in homepage.
	 * Including the title and Image path
	 * @return
	 * Returns list of genres with image path for books
	 */
	@CrossOrigin(origins = {"http://localhost:3000"})
	@GetMapping(path = "/")
	public List<HomePageEntity> getHomePageData(){
		return this.homeService.getHomePageContent();
 
	}
	
}
