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
import com.crud.h2.dto.Departamentos;
import com.crud.h2.service.DepartamentosServiceImpl;

@RestController
	@RequestMapping("/api")
	public class DepartamentosController {
		
		@Autowired
		DepartamentosServiceImpl DepartamentosServideImpl;
		
		@GetMapping("/Departamento")
		public List<Departamentos> listarDepartamento(){
			return DepartamentosServideImpl.listarDepartamento();
		}
		
		@PostMapping("/Departamento")
		public Departamentos salvarDepartamentos(@RequestBody Departamentos Departamentos) {
			
			return DepartamentosServideImpl.guardarDepartamentos(Departamentos);
		}
		
		@GetMapping("/departamento/{id}")
		public Departamentos DepartamentosXID(@PathVariable(name="id") Long id) {
			
			Departamentos Departamentos_xid= new Departamentos();
			
			Departamentos_xid=DepartamentosServideImpl.DepartamentosXID(id);
			
			System.out.println("Departamentos XID: "+Departamentos_xid);
			
			return Departamentos_xid;
		}
		
		@PutMapping("/Departamento/{id}")
		public Departamentos actualizarDepartamentos(@PathVariable(name="id")Long id,@RequestBody Departamentos Departamentos) {
			
			Departamentos Departamentos_seleccionado= new Departamentos();
			Departamentos Departamentos_actualizado= new Departamentos();
			
			Departamentos_seleccionado= DepartamentosServideImpl.DepartamentosXID(id);
			
			Departamentos_seleccionado.setCodigo(Departamentos.getCodigo());
			Departamentos_seleccionado.setNombre(Departamentos.getNombre());
			Departamentos_seleccionado.setPresupuesto(Departamentos.getPresupuesto());
			
			Departamentos_actualizado = DepartamentosServideImpl.actualizarDepartamentos(Departamentos_seleccionado);
			
			System.out.println("El departamento actualizado es: "+ Departamentos_actualizado);
			
			return Departamentos_actualizado;
		}
		
		@DeleteMapping("/Departamento/{id}")
		public void eliminarDepartamentos(@PathVariable(name="id")Long id) {
			DepartamentosServideImpl.eliminarDepartamentos(id);
		}
		
		
	}

}

}
