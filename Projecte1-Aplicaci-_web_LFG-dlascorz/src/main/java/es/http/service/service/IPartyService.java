package com.example.demo;

import java.util.List;

import com.crud.h2.dto.Party;

public interface IPartyService {

	// Metodos del CRUD
	public List<Party> listarParties(); // Listar All

	public Party guardarParty(Party party); // Guarda una party CREATE

	public Party partyXID(Long id); // Leer datos de una party READ

	public List<Party> listarPartyName(String name);// Listar party por campo name

	public List<Party> listarPartyId_usuario(String id_usuario);// Listar party por campo id_usuario

	public List<Party> listarPartyId_game(String id_game);// Listar party por campo id_game

	public Party actualizarParty(Party party); // Actualiza datos de la party UPDATE

	public void eliminarParty(Long id);// Elimina la party DELETE
}
