package com.markus.dslist.repositories;

import com.markus.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long>{

}
