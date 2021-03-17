
package com.example.demo;

	
	import org.springframework.data.jpa.repository.JpaRepository;
	import com.crud.h2.dto.Almacen;

	/**
	 * @author Emma
	 *
	 */
	public interface IAlmacenDAO extends JpaRepository<Almacen, Long>{

	}

}

	
	
	
}
