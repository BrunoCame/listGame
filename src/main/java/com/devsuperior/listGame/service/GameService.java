package com.devsuperior.listGame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.listGame.dto.GameDTO;
import com.devsuperior.listGame.entities.Game;
import com.devsuperior.listGame.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repositorio;
	
	public List<GameDTO> findAll(){
		List<Game> obj = repositorio.findAll();
		return obj.stream().map(x -> new GameDTO(x)).toList();
	}
	
}
