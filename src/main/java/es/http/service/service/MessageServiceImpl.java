package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IMessageDAO;
import es.http.service.dto.Message;

@Service
public class MessageServiceImpl implements IMessageService {
	
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
	public Message messageXID(int id) {
		return iMessageDAO.findById(id).get();
	}

	@Override
	public Message actualizarMessage(Message message) {
		return iMessageDAO.save(message);
	}

	@Override
	public void eliminarMessage(int id) {
		iMessageDAO.deleteById(id);
	}

}
