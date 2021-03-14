
	package com.example.demo;
	import java.util.List;

	/**
	 * @author Emma
	 *
	 */
	import com.crud.h2.dto.Departamentos;

	public class IDepartamentosService {


		//Metodos del CRUD
		public List<Departamentos> listarDepartamentos(); //Listar All 
		
		public Departamentos guardarDepartamentos(Departamentos departamentos);	//Guarda un departamento CREATE
		
		public Departamentos departamentosXID(Long id); //Leer datos de un departamento READ
		
		public Departamentos actualizarDepartamentos(Departamentos departamentos); //Actualiza datos del departamento UPDATE
		
		public void eliminarDepartamentos(Long id);// Elimina el departamento DELETE
		
		
	}

	
	
	
}

	
	
	
	
	
	
	
}
