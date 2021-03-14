package com.example.demo;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.crud.h2.dao.IFabricantesDAO;
	import com.crud.h2.dto.Fabricantes;

	@Service
	public class FabricantesServiceImpl implements IFabricantesService{
		
		//Utilizamos los metodos de la interface IFabricantesDAO, es como si instaciaramos.
		@Autowired
		IFabricantesDAO iFabricantesDAO;
		
		@Override
		public List<Fabricantes> listarFabricantes() {
			
			return iFabricantesDAO.findAll();
		}

		@Override
		public Fabricantes guardarFabricantes(Fabricantes Fabricantes) {
			
			return iFabricantesDAO.save(Fabricantes);
		}

		@Override
		public Fabricantes Fabricantes(Long id) {
			
			return iFabricantesDAO.findById(id).get();
		}

		@Override
		public Fabricantes actualizarFabricantes(Fabricantes Fabricantes) {
			
			return iFabricantesDAO.save(Fabricantes);
		}

		@Override
		public void eliminarFabricantes(Long id) {
			
			iFabricantesDAO.deleteById(id);
			
		}

	}

	
	
	
	
	
	
	
	
	
}
