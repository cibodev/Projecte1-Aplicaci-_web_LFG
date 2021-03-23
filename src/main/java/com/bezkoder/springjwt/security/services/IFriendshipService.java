package com.bezkoder.springjwt.security.services;

import java.util.List;

import com.bezkoder.springjwt.models.Friendship;


public interface IFriendshipService {

	//Metodos del CRUD
		public List<Friendship> listarFriendships(); //Listar All 
		
		public Friendship guardarFriendship(Friendship friendship);	//Guarda un Friendship CREATE
		
		public Friendship friendshipXID(int id); //Leer datos de un Friendship READ
		
		public Friendship actualizarFriendship(Friendship friendship); //Actualiza datos del friendship UPDATE
		
		public void eliminarFriendship(int id);// Elimina el friendship DELETE
	
}


