package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.h2.dto.Fabricantes;
import com.crud.h2.service.FabricantesServiceImpl;

@RestController
	@RequestMapping("/api")
	public class FabricantesController {
		
		@Autowired
		FabricantesServiceImpl FabricantesServideImpl;
		
		@GetMapping("/Fabricante")
		public List<Fabricantes> listarFabricante(){
			return FabricantesServideImpl.listarFabricante();
		}
		
		@PostMapping("/Fabricante")
		public Fabricantes salvarFabricantes(@RequestBody Fabricantes fabricantes) {
			
			return FabricantesServideImpl.guardarFabricantes(fabricantes);
		}
		
		@GetMapping("/Fabricante/{id}")
		public Fabricantes FabricantesXID(@PathVariable(name="id") Long id) {
			
			Fabricantes Fabricantes_xid= new Fabricantes();
			
			Fabricantes_xid=FabricantesServideImpl.FabricantesXID(id);
			
			System.out.println("Fabricantes XID: "+Fabricantes_xid);
			
			return Fabricantes_xid;
		}
		
		@PutMapping("/Fabricante/{id}")
		public Fabricantes actualizarFabricantes(@PathVariable(name="id")Long id,@RequestBody Fabricantes Fabricantes) {
			
			Fabricantes Fabricantes_seleccionado= new Fabricantes();
			Fabricantes Fabricantes_actualizado= new Fabricantes();
			
			Fabricantes_seleccionado= FabricantesServideImpl.FabricantesXID(id);
			
			Fabricantes_seleccionado.setCodigo(Fabricantes.getCodigo());
			Fabricantes_seleccionado.setNombre(Fabricantes.getNombre());
			
			Fabricantes_actualizado = FabricantesServideImpl.actualizarFabricantes(Fabricantes_seleccionado);
			
			System.out.println("El fabricantes actualizado es: "+ Fabricantes_actualizado);
			
			return Fabricantes_actualizado;
		}
		
		@DeleteMapping("/Fabricante/{id}")
		public void eliminarFabricantes(@PathVariable(name="id")Long id) {
			FabricantesServideImpl.eliminarFabricantes(id);
		}
		
		
	}

}

}
