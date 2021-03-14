	package com.example.demo;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.crud.h2.dao.IEmpleadosDAO;
	import com.crud.h2.dto.Empleados;

	@Service
	public class EmpleadosServiceImpl implements IEmpleadosService{
		
		//Utilizamos los metodos de la interface IEmpleadosDAO, es como si instaciaramos.
		@Autowired
		IEmpleadossDAO iEmpleadosDAO;
		
		@Override
		public List<Empleados> listarEmpleados() {
			
			return iEmpleadosDAO.findAll();
		}

		@Override
		public Empleados guardarEmpleados(Empleados empleados) {
			
			return iEmpleadosDAO.save(empleados);
		}

		@Override
		public Empleados empleados(Long id) {
			
			return iEmpleadosDAO.findById(id).get();
		}

		@Override
		public Empleados actualizarEmpleados(Empleados empleados) {
			
			return iEmpleadosDAO.save(empleados);
		}

		@Override
		public void eliminarEmpleados(Long id) {
			
			iEmpleadosDAO.deleteById(id);
			
		}

	}

	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
}
