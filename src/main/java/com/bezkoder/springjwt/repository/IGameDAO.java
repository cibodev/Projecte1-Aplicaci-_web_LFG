package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Game;

public interface IGameDAO extends JpaRepository<Game, Integer> {

	//Game findByGame(String nombre);
}