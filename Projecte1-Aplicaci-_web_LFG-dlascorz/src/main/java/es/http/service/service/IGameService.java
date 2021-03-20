package com.example.demo;

import java.util.List;

import com.crud.h2.dto.Game;

public interface IGameService {

	// Metodos del CRUD
	public List<Game> listarGames(); // Listar All

	public Game guardarGame(Game game); // Guarda un game CREATE

	public Game gameXID(Long id); // Leer datos de un game READ

	public List<Game> listarGameName(String name);// Listar game por campo name

	public Game actualizarGame(Game game); // Actualiza datos del game UPDATE

	public void eliminarGame(Long id);// Elimina el game DELETE
}
