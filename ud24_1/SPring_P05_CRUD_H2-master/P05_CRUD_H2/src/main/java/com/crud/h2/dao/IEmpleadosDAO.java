package com.example.demo;
	
	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;
	import com.crud.h2.dto.Empleados;

	/**
	 * @author Emma
	 *
	 */
	public interface IEmpleadosDAO extends JpaRepository<Empleados, Long>{
		
		//Listar empleados por campo nombre
		public List<Empleados> findByNombre(String nombre);
		
		//Listar empleados por campo salario
		public List<Empleados> findBySalario(int salario);
				
		//Listar empleados por campo trabajo
		public List<Empleados> findByTrabajo(String trabajo);
		
	}

	
	
}
