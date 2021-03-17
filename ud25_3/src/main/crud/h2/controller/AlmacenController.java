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
import com.crud.h2.dto.Almacen;
import com.crud.h2.service.AlmacenServideImpl;

@RestController
		@RequestMapping("/api")
		public class AlmacenController {
			
			@Autowired
			AlmacenServiceImpl AlmacenServideImpl;
			
			@GetMapping("/Almacenes")
			public List<Almacen> listarAlmacenes(){
				return AlmacenServideImpl.listarAlmacenes();
			}
			
			@PostMapping("/Almacen")
			public Almacen salvarAlmacen(@RequestBody Almacen Almacenes) {
				
				return AlmacenServideImpl.guardarAlmacen(Almacen);
			}
			
			@GetMapping("/almacenes/{id}")
			public Almacen AlmacenXID(@PathVariable(name="id") Long id) {
				
				Almacen Almacen_xid= new Almacen();
				
				Almacen_xid=AlmacenServideImpl.AlmacenXID(id);
				
				System.out.println("Almacen XID: "+Almacen_xid);
				
				return Almacen_xid;
			}
			
			@PutMapping("/Almacenes/{id}")
			public Almacen actualizarAlmacen(@PathVariable(name="id")Long id,@RequestBody Almacen Almacen) {
				
				Almacen Almacen_seleccionado= new Almacen();
				Almacen Almacen_actualizado= new Almacen();
				
				Almacen_seleccionado= AlmacenServideImpl.AlmacenXID(id);
				
				Almacen_seleccionado.setCodigo(Almacen.getCodigo());
				Almacen_seleccionado.setLugar(Almacen.getLugar());
				Almacen_seleccionado.setCapacidad(Almacen.getCapacidad());
				
				Almacen_actualizado = AlmacenServideImpl.actualizarAlmacen(Almacen_seleccionado);
				
				System.out.println("El almacen actualizado es: "+ Almacen_actualizado);
				
				return Almacen_actualizado;
			}
			
			@DeleteMapping("/Almacenes/{id}")
			public void eliminarAlmacen(@PathVariable(name="id")Long id) {
				AlmacenServideImpl.eliminarAlmacen(id);
			}
			
			
		}

}

}
