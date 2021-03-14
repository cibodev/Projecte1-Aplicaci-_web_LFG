package com.example.demo;


	import java.util.List;

	/**
	 * @author Emma
	 *
	 */
	import com.crud.h2.dto.Cliente;

	public interface IEmpleadosService {

		//Metodos del CRUD
		public List<Empleados> listarEmpleado(); //Listar All 
		
		public Empleados guardarEmpleados(Empleados empleados);	//Guarda un empleado CREATE
		
		public Empleados empleadosXID(Long id); //Leer datos de un empleado READ
		
		public List<Empleados> listarEmpleadosNomApels(String nomApels);//Listar empleados por campo nombre
		
		public List<Empleados> listarEmpleadosSalario(int salario);//Listar empleados por campo salario
		
		public List<Empleados> listarEmpleadosTrabajo(String trabajo);//Listar empleados por campo trabajo
		
		public Empleados actualizarEmpleados(Empleados empleado); //Actualiza datos del empleado UPDATE
		
		public void eliminarEmpleados(Long id);// Elimina el empleado DELETE
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
