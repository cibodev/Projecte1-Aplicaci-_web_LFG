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
import com.crud.h2.dto.Empleados;
import com.crud.h2.service.EmpleadosServiceImpl;

@RestController
		@RequestMapping("/api")
		public class EmpleadosController {
			
			@Autowired
			EmpleadosServiceImpl EmpleadosServideImpl;
			
			@GetMapping("/Empleado")
			public List<Empleados> listarEmpleado(){
				return EmpleadosServideImpl.listarEmpleado();
			}
			
			@PostMapping("/Empleado")
			public Empleados salvarEmpleados(@RequestBody Empleados Empleados) {
				
				return EmpleadosServideImpl.guardarEmpleados(Empleados);
			}
			
			@GetMapping("/empleado/{id}")
			public Empleados EmpleadosXID(@PathVariable(name="id") Long id) {
				
				Empleados Empleados_xid= new Empleados();
				
				Empleados_xid=EmpleadosServideImpl.EmpleadosXID(id);
				
				System.out.println("Empleados XID: "+Empleados_xid);
				
				return Empleados_xid;
			}
			
			@PutMapping("/Empleado/{id}")
			public Empleados actualizarEmpleados(@PathVariable(name="id")Long id,@RequestBody Empleados Empleados) {
				
				Empleados Empleados_seleccionado= new Empleados();
				Empleados Empleados_actualizado= new Empleados();
				
				Empleados_seleccionado= EmpleadosServideImpl.EmpleadosXID(id);
				
				Empleados_seleccionado.setCodigo(Empleados.getDNI());
				Empleados_seleccionado.setNombre(Empleados.getNombre());
				Empleados_seleccionado.setPresupuesto(Empleados.getPresupuesto());
				Empleados_seleccionado.setDepartamento(Empleados.getDepartamento());

				
				Empleados_actualizado = EmpleadosServideImpl.actualizarEmpleados(Empleados_seleccionado);
				
				System.out.println("El empleado actualizado es: "+ Empleados_actualizado);
				
				return Empleados_actualizado;
			}
			
			@DeleteMapping("/Empleado/{id}")
			public void eliminarEmpleados(@PathVariable(name="id")Long id) {
				EmpleadosServideImpl.eliminarEmpleados(id);
			}
			
			
		}

}

}

}
