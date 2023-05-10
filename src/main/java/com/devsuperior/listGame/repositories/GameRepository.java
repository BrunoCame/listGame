package com.devsuperior.listGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.listGame.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
