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
import com.crud.h2.dto.Caja;
import com.crud.h2.service.CajaServideImpl;

@RestController
		@RequestMapping("/api")
		public class CajaController {
			
			@Autowired
			CajaServiceImpl CajaServideImpl;
			
			@GetMapping("/Cajas")
			public List<Caja> listarCajas(){
				return CajaServideImpl.listarCajas();
			}
			
			@PostMapping("/Caja")
			public Caja salvarCaja(@RequestBody Caja Cajas) {
				
				return CajaServideImpl.guardarCaja(Caja);
			}
			
			@GetMapping("/cajas/{id}")
			public Caja CajaXID(@PathVariable(name="id") Long id) {
				
				Caja Caja_xid= new Caja();
				
				Caja_xid=CajaServideImpl.CajaXID(id);
				
				System.out.println("Caja XID: "+Caja_xid);
				
				return Caja_xid;
			}
			
			@PutMapping("/Cajas/{id}")
			public Caja actualizarCaja(@PathVariable(name="id")Long id,@RequestBody Caja Caja) {
				
				Caja Caja_seleccionado= new Caja();
				Caja Caja_actualizado= new Caja();
				
				Caja_seleccionado= CajaServideImpl.CajaXID(id);
				
				Caja_seleccionado.setNumReferencia(Caja.getNumReferencia());
				Caja_seleccionado.setContenido(Caja.getContenido());
				Caja_seleccionado.setValor(Caja.getValor());
				Caja_seleccionado.setAlmacen(Caja.getAlmacen());
				
				Caja_actualizado = CajaServideImpl.actualizarCaja(Caja_seleccionado);
				
				System.out.println("La caja actualizada es: "+ Caja_actualizado);
				
				return Caja_actualizado;
			}
			
			@DeleteMapping("/Cajas/{id}")
			public void eliminarCaja(@PathVariable(name="id")Long id) {
				CajaServideImpl.eliminarCaja(id);
			}
			
			
		}

}

}
