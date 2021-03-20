package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dao.IMessageDAO;
import es.http.service.dto.Message;
import es.http.service.service.MessageServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MessageController {

	@Autowired
	MessageServiceImpl messageServiceImpl;

	// End-points //
	@GetMapping("/messages")
	public List<Message> listarMessage() {
		return messageServiceImpl.listarMessage();
	}

	@PostMapping("/messages")
	public Message salvarMessage(@RequestBody Message message) {

		return messageServiceImpl.guardarMessage(message);
	}

	@GetMapping("/messages/{id}")
	public Message MessageXID(@PathVariable(name = "id") String id) {

		Message Message_xid = new Message();

		Message_xid = messageServiceImpl.messageXID(id);

		// System.out.println("Message XID: "+Message_xid);

		return Message_xid;
	}

	@PutMapping("/messages/{id}")
	public Message actualizarMessage(@PathVariable(name = "id") String id, @RequestBody Message Message) {

		Message Message_seleccionado = new Message();
		Message Message_actualizado = new Message();

		Message_seleccionado = messageServiceImpl.messageXID(id);

		Message_seleccionado.setFrom(Message.getFrom());
		Message_seleccionado.setMessage(Message.getMessage());
		Message_seleccionado.setDate(Message.getDate());
		Message_seleccionado.setId_party(Message.getId_party());

		Message_actualizado = messageServiceImpl.actualizarMessage(Message_seleccionado);

		// System.out.println("El Message actualizado es: "+ Message_actualizado);

		return Message_actualizado;
	}

	@DeleteMapping("/messages/{id}")
	public void eleiminarMessage(@PathVariable(name = "id") String id) {
		messageServiceImpl.eliminarMessage(id);
	}
}