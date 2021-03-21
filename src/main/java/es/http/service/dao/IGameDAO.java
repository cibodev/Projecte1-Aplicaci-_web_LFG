package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Game;

public interface IGameDAO extends JpaRepository<Game, Integer> {

	//Game findByGame(String nombre);
}