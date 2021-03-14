package com.example.demo;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.crud.h2.dao.IArticulosDAO;
	import com.crud.h2.dto.Articulos;

	@Service
	public class ArticulosServiceImpl implements IArticulosService{
		
		//Utilizamos los metodos de la interface IArticulosDAO, es como si instaciaramos.
		@Autowired
		IArticulosDAO iArticulosDAO;
		
		@Override
		public List<Articulos> listarArticulos() {
			
			return iArticulosDAO.findAll();
		}

		@Override
		public Articulos guardarArticulos(Articulos articulos) {
			
			return iArticulosDAO.save(articulos);
		}

		@Override
		public Articulos articulos(Long id) {
			
			return iArticulosDAO.findById(id).get();
		}

		@Override
		public Articulos actualizarArticulos(Articulos articulos) {
			
			return iArticulosDAO.save(articulos);
		}

		@Override
		public void eliminarArticulos(Long id) {
			
			iArticulosDAO.deleteById(id);
			
		}

	}

	
	
	
	
	
	
	
	
	
}
