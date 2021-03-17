
	package com.example.demo;
	import java.util.List;

	/**
	 * @author Emma
	 *
	 */
	import com.crud.h2.dto.Almacen;

	public class IAlmacenService {


		//Metodos del CRUD
		public List<Almacen> listarAlmacen(); //Listar All 
		
		public Almacen guardarAlmacen(Almacen almacen);	//Guarda un almacen CREATE
		
		public Almacen almacenXID(Long id); //Leer datos de un almacen READ
		
		public Almacen actualizarAlmacen(Almacen almacen); //Actualiza datos del almacen UPDATE
		
		public void eliminarAlmacen(Long id);// Elimina el almacen DELETE
		
		
	}

	
	
	
}

	
	
	
	
	
	
	
}
