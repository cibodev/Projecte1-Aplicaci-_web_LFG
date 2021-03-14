package com.example.demo;
	import java.util.List;

	/**
	 * @author Emma
	 *
	 */
	import com.crud.h2.dto.Fabricantes;

	public class IfabricantesService {


		//Metodos del CRUD
		public List<Fabricantes> listarFabricantes(); //Listar All 
		
		public Fabricantes guardarFabricantes(Fabricantes fabricantes);	//Guarda un fabricante CREATE
		
		public Fabricantes fabricantesXID(Long id); //Leer datos de un fabricante READ
		
		public Fabricantes actualizarFabricantes(Fabricantes fabricantes); //Actualiza datos del fabricante UPDATE
		
		public void eliminarFabricantes(Long id);// Elimina el fabricante DELETE
		
		
	}

	
	
	
}
