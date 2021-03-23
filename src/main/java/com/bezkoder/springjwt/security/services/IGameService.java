package com.bezkoder.springjwt.security.services;

import java.util.List;

import com.bezkoder.springjwt.models.Game;


public interface IGameService {

	//Metodos del CRUD
		public List<Game> listarGames(); //Listar All 
		
		public Game guardarGame(Game game);	//Guarda un Game CREATE
		
		public Game gameXID(int id); //Leer datos de un Game READ
		
		public Game actualizarGame(Game game); //Actualiza datos del game UPDATE
		
		public void eliminarGame(int id);// Elimina el game DELETE
	
}


