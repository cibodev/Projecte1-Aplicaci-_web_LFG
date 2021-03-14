
package com.example.demo;

import java.util.List;

/**
 * @author Emma
 *
 */
import com.crud.h2.dto.Empleados;

public class IEmpleadosService {


		//Metodos del CRUD
		public List<Empleados> listarEmpleados(); //Listar All 
		
		public Empleados guardarEmpleados(Empleados empleados);	//Guarda un empleados CREATE
		
		public Empleados empleadosXID(Long id); //Leer datos de un empleados READ
		
		public Empleados actualizarEmpleados(Empleados empleados); //Actualiza datos del empleado UPDATE
		
		public void eliminarEmpleados(Long id);// Elimina el empleado DELETE
		
		
	}

}

}
