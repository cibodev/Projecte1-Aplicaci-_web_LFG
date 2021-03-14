
package com.example.demo;

	
	import org.springframework.data.jpa.repository.JpaRepository;
	import com.crud.h2.dto.Empleados;

	/**
	 * @author Emma
	 *
	 */
	public interface IEmpleadosDAO extends JpaRepository<Empleados, Long>{

	}

}

	
	
	
}
