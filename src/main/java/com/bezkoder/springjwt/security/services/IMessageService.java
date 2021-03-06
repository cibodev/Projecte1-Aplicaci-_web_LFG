package com.bezkoder.springjwt.security.services;

import java.util.List;

import com.bezkoder.springjwt.models.Message;


public interface IMessageService {

	//Metodos del CRUD
		public List<Message> listarMessages(); //Listar All 
		
		public Message guardarMessage(Message message);	//Guarda un Message CREATE
		
		public Message messageXID(int id); //Leer datos de un Message READ
		
		public Message actualizarMessage(Message message); //Actualiza datos del message UPDATE
		
		public void eliminarMessage(int id);// Elimina el message DELETE
	
}


