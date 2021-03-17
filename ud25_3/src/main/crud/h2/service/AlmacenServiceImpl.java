package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAlmacenDAO;
import com.crud.h2.dto.Almacen;

@Service
	public class AlmacenServiceImpl implements IAlmacenService{
		
		//Utilizamos los metodos de la interface IDepartamentosDAO, es como si instaciaramos.
		@Autowired
		IAlmacenDAO iAlmacenDAO;
		
		@Override
		public List<Almacen> listarAlmacenes() {
			
			return iAlmacenDAO.findAll();
		}

		@Override
		public Almacen guardarAlmacen(Almacen almacen) {
			
			return iAlmacenDAO.save(almacen);
		}

		@Override
		public Almacen almacen(Long id) {
			
			return iAlmacenDAO.findById(id).get();
		}

		@Override
		public Almacen actualizarAlmacen(Almacen almacen) {
			
			return iAlmacenDAO.save(almacen);
		}

		@Override
		public void eliminarAlmacen(Long id) {
			
			iAlmacenDAO.deleteById(id);
			
		}

	}

}

}
