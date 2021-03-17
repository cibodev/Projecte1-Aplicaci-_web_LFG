
	package com.example.demo;
	import java.util.List;

	/**
	 * @author Emma
	 *
	 */
	import com.crud.h2.dto.Caja;

	public class ICajaService {


		//Metodos del CRUD
		public List<Caja> listarCaja(); //Listar All 
		
		public Caja guardarCaja(Caja caja);	//Guarda una caja CREATE
		
		public Caja cajaXID(Long id); //Leer datos de una caja READ
		
		public Caja actualizarCaja(Caja caja); //Actualiza datos de la caja UPDATE
		
		public void eliminarCaja(Long id);// Elimina la caja DELETE
		
		
	}

	
	
	
}

	
	
	
	
	
	
	
}
