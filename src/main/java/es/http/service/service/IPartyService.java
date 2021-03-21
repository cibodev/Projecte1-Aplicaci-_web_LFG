package es.http.service.service;

import java.util.List;

import es.http.service.dto.Party;

public interface IPartyService {

	//Metodos del CRUD
		public List<Party> listarPartys(); //Listar All 
		
		public Party guardarParty(Party party);	//Guarda un Party CREATE
		
		public Party partyXID(int id); //Leer datos de un Party READ
		
		public Party actualizarParty(Party party); //Actualiza datos del party UPDATE
		
		public void eliminarParty(int id);// Elimina el party DELETE
	
}


