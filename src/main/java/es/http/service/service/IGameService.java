package es.http.service.service;

import java.util.List;

import es.http.service.dto.Game;

public interface IGameService {

	//Metodos del CRUD
		public List<Game> listarGames(); //Listar All 
		
		public Game guardarGame(Game game);	//Guarda un Game CREATE
		
		public Game gameXID(int id); //Leer datos de un Game READ
		
		public Game actualizarGame(Game game); //Actualiza datos del game UPDATE
		
		public void eliminarGame(int id);// Elimina el game DELETE
	
}


