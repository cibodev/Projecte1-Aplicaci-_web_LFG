package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ICajaDAO;
import com.crud.h2.dto.Caja;

@Service
	public class CajaServiceImpl implements ICajaService{
		
		//Utilizamos los metodos de la interface IDepartamentosDAO, es como si instaciaramos.
		@Autowired
		ICajaDAO iCajaDAO;
		
		@Override
		public List<Caja> listarCajas() {
			
			return iCajaDAO.findAll();
		}

		@Override
		public Caja guardarCaja(Caja caja) {
			
			return iCajaDAO.save(caja);
		}

		@Override
		public Caja caja(Long id) {
			
			return iCajaDAO.findById(id).get();
		}

		@Override
		public Caja actualizarCaja(Caja caja) {
			
			return iCajaDAO.save(caja);
		}

		@Override
		public void eliminarCaja(Long id) {
			
			iCajaDAO.deleteById(id);
			
		}

	}

}

}
