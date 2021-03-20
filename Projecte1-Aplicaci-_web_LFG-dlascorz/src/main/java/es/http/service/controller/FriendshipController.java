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

import es.http.service.dao.IFriendshipDAO;
import es.http.service.dto.Friendship;
import es.http.service.service.FriendshipServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class FriendshipController {

	@Autowired
	FriendshipServiceImpl friendshipServiceImpl;

	// End-points //
	@GetMapping("/friendships")
	public List<Friendship> listarFriendship() {
		return friendshipServiceImpl.listarFriendship();
	}

	@PostMapping("/friendships")
	public Friendship salvarFriendship(@RequestBody Friendship friendship) {

		return friendshipServiceImpl.guardarFriendship(friendship);
	}

	@GetMapping("/friendships/{id}")
	public Friendship FriendshipXID(@PathVariable(name = "id") String id) {

		Friendship Friendship_xid = new Friendship();

		Friendship_xid = friendshipServiceImpl.friendshipXID(id);

		// System.out.println("Friendship XID: "+Friendship_xid);

		return Friendship_xid;
	}

	@PutMapping("/friendships/{id}")
	public Friendship actualizarFriendship(@PathVariable(name = "id") String id, @RequestBody Friendship Friendship) {

		// Creación de 2 friendships //
		Friendship Friendship_seleccionado = new Friendship(); // Friendship seleccionado //
		Friendship Friendship_actualizado = new Friendship(); // Friendship actualizado //

		Friendship_seleccionado = friendshipServiceImpl.friendshipXID(id);
		
		// La friendship seleccionada copia los datos del usuario //
		Friendship_seleccionado.setId_usuario2(Friendship.getId_usuario2());
		Friendship_seleccionado.setId_usuario(Friendship.getId_usuario());

		Friendship_actualizado = friendshipServiceImpl.actualizarFriendship(Friendship_seleccionado);

		// System.out.println("El Friendship actualizado es: "+ Friendship_actualizado);

		return Friendship_actualizado;
	}

	@DeleteMapping("/friendships/{id}")
	public void eleiminarFriendship(@PathVariable(name = "id") String id) {
		friendshipServiceImpl.eliminarFriendship(id);
	}
}