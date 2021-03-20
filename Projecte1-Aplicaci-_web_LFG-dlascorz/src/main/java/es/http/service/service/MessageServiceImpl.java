package //falta poner//;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IMessageDAO;
import com.crud.h2.dto.Message;

@Service
public class MessageServiceImpl implements IMessageService {

	//Utilizamos los metodos de la interface IMessageDAO, es como si instaciaramos.

	@Autowired
	IMessageDAO iMessageDAO;

	@Override
	public List<Message> listarMessages() {
		return iMessageDAO.findAll();
	}

	@Override
	public Message guardarMessage(Message message) {
		return iMessageDAO.save(message);
	}

	@Override
	public Message messageXID(String id) {
		return iMessageDAO.findById(id).get();
	}

	@Override
	public Message actualizarMessage(Message message) {
		return iMessageDAO.save(message);
	}

	@Override
	public void eliminarMessage(String id) {
		iMessageDAO.deleteById(id);
	}

}

}