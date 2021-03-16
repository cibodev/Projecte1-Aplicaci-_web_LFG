package com.example.demo;

import java.util.List;

import com.crud.h2.dto.Friendship;

public interface IFriendshipService {

	// Metodos del CRUD
	public List<Friendship> listarFriendships(); // Listar All

	public Friendship guardarFriendship(Friendship friendship); // Guarda un friendship CREATE

	public Friendship friendshipXID(Long id); // Leer datos de un friendship READ

	public List<Friendship> listarFriendshipId_usuario(String id_usuario);// Listar friendship por campo id_usuario

	public List<Friendship> listarFriendshipId_usuario2(String id_usuario2);// Listar friendship por campo id_usuario2

	public Friendship actualizarFriendship(Friendship friendship); // Actualiza datos de friendship UPDATE

	public void eliminarFriendship(Long id);// Elimina el friendship DELETE
}
