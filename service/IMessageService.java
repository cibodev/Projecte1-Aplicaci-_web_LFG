package com.example.demo;

import java.util.List;

import com.crud.h2.dto.Message;

public interface IMessageService {

	// Metodos del CRUD
	public List<Message> listarMessages(); // Listar All

	public Message guardarMessage(Message message); // Guarda un message CREATE

	public Message messageXID(Long id); // Leer datos de un message READ

	public List<Message> listarMessageFrom(String from);// Listar message por campo from

	public List<Message> listarMessageId_party(String id_party);// Listar message por campo id_party

	public Message actualizarMessage(Message message); // Actualiza datos del message UPDATE

	public void eliminarMessage(Long id);// Elimina el message DELETE
}
