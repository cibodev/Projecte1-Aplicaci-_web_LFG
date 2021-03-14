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
	import com.crud.h2.dto.Cliente;
	import com.crud.h2.service.ClienteServiceImpl;

	@RestController
	@RequestMapping("/api")
	public class EmpleadosController {
		
		@Autowired
		EmpleadosServiceImpl empleadosServideImpl;
		
		@GetMapping("/empleados")
		public List<Empleados> listarEmpleado(){
			return empleadosServideImpl.listarEmpleado();
		}
		
		//listar Empleados por campo nombre
		@GetMapping("/empleado/trabajo/{trabajo}")
		public List<Empleados> listarEmpleadoTrabajo(@PathVariable(name="trabajo") String trabajo) {
		    return empleadosServideImpl.listarEmpleadosTrabajo(trabajo);
		}
		
		
		@PostMapping("/empleado")
		public Empleados salvarEmpleados(@RequestBody Empleados empleado) {
			
			return empleadosServideImpl.guardarEmpleados(empleados);
		}
		
		
		@GetMapping("/empleado/{id}")
		public Empleados empleadosXID(@PathVariable(name="id") Long id) {
			
			Empleadsos empleado_xid= new Empleados();
			
			empleados_xid=empleadosServideImpl.empleadosXID(id);
			
			System.out.println("Empleados XID: "+empleados_xid);
			
			return empleados_xid;
		}
		
		@PutMapping("/empleados/{id}")
		public Empleados actualizarEmpleados(@PathVariable(name="id")Long id,@RequestBody Empleados empleados) {
			
			Empleados empleados_seleccionado= new Empleados();
			Empleados empleados_actualizado= new Empleados();
			
			Empleados_seleccionado= empleadosServideImpl.empleadosXID(id);
			
			empleados_seleccionado.setNomApels(empleados.getNomApels());
			empleados_seleccionado.setSalario(empleados.getSalario());
			empleados_seleccionado.setTrabajo(empleados.getTrabajo());
			
			empleados_actualizado = empleadosServideImpl.actualizarEmpleados(empleados_seleccionado);
			
			System.out.println("El empleado actualizado es: "+ empleados_actualizado);
			
			return empleados_actualizado;
		}
		
		@DeleteMapping("/empleado/{id}")
		public void eliminarEmpleados(@PathVariable(name="id")Long id) {
			empleadosServideImpl.eliminarEmpleados(id);
		}
		
		
	}

	
	
	
	
	
}
