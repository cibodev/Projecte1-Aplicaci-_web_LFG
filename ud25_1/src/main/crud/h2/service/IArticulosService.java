package com.example.demo;
	import java.util.List;

	/**
	 * @author Emma
	 *
	 */
	import com.crud.h2.dto.Articulos;

	public class IArticulosService {


		//Metodos del CRUD
		public List<Articulos> listarArticulos(); //Listar All 
		
		public Articulos guardarArticulos(Articulos articulos);	//Guarda un articulo CREATE
		
		public Articulos articulosXID(Long id); //Leer datos de un articulo READ
		
		public Articulos actualizarArticulos(Articulos articulos); //Actualiza datos del articulos UPDATE
		
		public void eliminarArticulos(Long id);// Elimina el articulo DELETE
		
		
	}

	
	
	
}
