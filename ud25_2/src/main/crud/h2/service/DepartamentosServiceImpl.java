	package com.example.demo;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.crud.h2.dao.IDepartamentosDAO;
	import com.crud.h2.dto.Departamentos;

	@Service
	public class DepartamentosServiceImpl implements IDepartamentosService{
		
		//Utilizamos los metodos de la interface IDepartamentosDAO, es como si instaciaramos.
		@Autowired
		IDepartamentosDAO iDepartamentosDAO;
		
		@Override
		public List<Departamentos> listarDepartamentos() {
			
			return iDepartamentosDAO.findAll();
		}

		@Override
		public Departamentos guardarDepartamentos(Departamentos departamentos) {
			
			return iDepartamentosDAO.save(departamentos);
		}

		@Override
		public Departamentos departamentos(Long id) {
			
			return iDepartamentosDAO.findById(id).get();
		}

		@Override
		public Departamentos actualizarDepartamentos(Departamentos departamentos) {
			
			return iDepartamentosDAO.save(departamentos);
		}

		@Override
		public void eliminarDepartamentos(Long id) {
			
			iDepartamentosDAO.deleteById(id);
			
		}

	}

	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
}
