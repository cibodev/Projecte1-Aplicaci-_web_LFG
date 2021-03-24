package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Game;

@Repository
public interface IGameDAO extends JpaRepository<Game, Integer> {
	
	public List<Game> findByNombreContaining(String nombre);
}