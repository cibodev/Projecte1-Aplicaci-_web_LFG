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
	import com.crud.h2.dto.Articulos;
	import com.crud.h2.service.ArticulosServiceImpl;

	@RestController
	@RequestMapping("/api")
	public class ArticulosController {
		
		@Autowired
		ArticulosServiceImpl ArticulosServideImpl;
		
		@GetMapping("/Articulo")
		public List<Articulos> listarArticulo(){
			return ArticulosServideImpl.listarArticulo();
		}
		
		@PostMapping("/Articulo")
		public Articulos salvarArticulos(@RequestBody Articulos Articulos) {
			
			return ArticulosServideImpl.guardarArticulos(Articulos);
		}
		
		@GetMapping("/Articulo/{id}")
		public Articulos ArticulosXID(@PathVariable(name="id") Long id) {
			
			Articulos Articulos_xid= new Articulos();
			
			Articulos_xid=ArticulosServideImpl.ArticulosXID(id);
			
			System.out.println("Articulos XID: "+Articulos_xid);
			
			return Articulos_xid;
		}
		
		@PutMapping("/Articulo/{id}")
		public Articulos actualizarArticulos(@PathVariable(name="id")Long id,@RequestBody Articulos Articulos) {
			
			Articulos Articulos_seleccionado= new Articulos();
			Articulos Articulos_actualizado= new Articulos();
			
			Articulos_seleccionado= ArticulosServideImpl.ArticulosXID(id);
			
			Articulos_seleccionado.setCodigo(Articulos.getCodigo());
			Articulos_seleccionado.setNombre(Articulos.getNombre());
			Articulos_seleccionado.setPrecio(Articulos.getPrecio());
			Articulos_seleccionado.setFabricante(Articulos.getFabricante());
			
			Articulos_actualizado = ArticulosServideImpl.actualizarArticulos(Articulos_seleccionado);
			
			System.out.println("El articulo actualizado es: "+ Articulos_actualizado);
			
			return Articulos_actualizado;
		}
		
		@DeleteMapping("/Articulo/{id}")
		public void eliminarArticulos(@PathVariable(name="id")Long id) {
			ArticulosServideImpl.eliminarArticulos(id);
		}
		
		
	}

	
	
	
	
	
	
}
