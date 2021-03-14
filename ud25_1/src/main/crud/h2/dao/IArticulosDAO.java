package com.example.demo;

	
	import org.springframework.data.jpa.repository.JpaRepository;
	import com.crud.h2.dto.Cliente;

	/**
	 * @author Emma
	 *
	 */
	public interface IArticulosDAO extends JpaRepository<Articulos, Long>{

	}

}
