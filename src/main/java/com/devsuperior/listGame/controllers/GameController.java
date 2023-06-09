package com.devsuperior.listGame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.listGame.dto.GameDTO;
import com.devsuperior.listGame.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService service;
	
	@GetMapping
	public List<GameDTO> findAll(){
		List<GameDTO> obj = service.findAll();
		return obj;
	}
	
	
	
}
