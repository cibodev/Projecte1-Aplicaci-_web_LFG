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
		IEmpleadosDAO iEmpleadosDAO;
		
		@Override
		public List<Empleados> listarEmpleado() {
			
			return iEmpleadosDAO.findAll();
		}

		@Override
		public Empleados guardarEmpleados(Cliente empleados) {
			
			return iEmpleadosDAO.save(empleados);
		}

		@Override
		public Empleados empleadosXID(Long id) {
			
			return iEmpleadosDAO.findById(id).get();
		}
		

		@Override
		public Empleados actualizarEmpleados(Empleados empleados) {
			
			return iEmpleadosDAO.save(empleado);
		}

		@Override
		public void eliminarEmpleados(Long id) {
			
			iEmpleadosDAO.deleteById(id);
			
		}


		@Override
		public List<Empleados> listarEmpleadosNomApels(String nomApels) {
			
			return iEmpleadosDAO.findByNomApels(nomApels);
		}

		@Override
		public List<Empleados> listarEmpleadosSalario(int salario) {
			
			return iEmpleadosDAO.findBySalario(salario);
		}
		@Override
		public List<Empleados> listarEmpleadosTrabajo(String trabajo) {
			
			return iEmpleadosDAO.findByTrabajo(trabajo);
		}
	}

	
	
	
	
}
