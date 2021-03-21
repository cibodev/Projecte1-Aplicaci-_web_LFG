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

import es.http.service.dao.IUsuarioDAO;
import es.http.service.dto.Usuario;
import es.http.service.service.UsuarioServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class UsuarioController {

	@Autowired
	UsuarioServiceImpl usuarioDetailsServiceImpl;

	private IUsuarioDAO iUsuarioDAO;

	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UsuarioController(IUsuarioDAO iUsuarioDAO, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.iUsuarioDAO = iUsuarioDAO;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@GetMapping("/users")
	public List<Usuario> getAllUsuarios() {
		return iUsuarioDAO.findAll();
	}

	@GetMapping("/users/{id}")
	public Usuario UsuarioXID(@PathVariable(name = "id") int id) {

		Usuario Usuario_xid = new Usuario();

		Usuario_xid = usuarioDetailsServiceImpl.usuarioXID(id);

		return Usuario_xid;
	}

	@GetMapping("/users/username/{username}")
	public Usuario UsuarioXID(@PathVariable(name = "username") String username) {

		Usuario Usuario_xid = new Usuario();

		Usuario_xid = iUsuarioDAO.findByUsername(username);


		return Usuario_xid;
	}

	@PostMapping("/users")
	public void saveUsuario(@RequestBody Usuario user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		iUsuarioDAO.save(user);
	}

	@PutMapping("/users/{id}")
	public Usuario actualizarUsuario(@PathVariable(name = "id") int id, @RequestBody Usuario user) {

		Usuario Usuario_seleccionado = new Usuario();
		Usuario Usuario_actualizado = new Usuario();

		Usuario_seleccionado = usuarioDetailsServiceImpl.usuarioXID(id);

		Usuario_seleccionado.setUsername(user.getUsername());
		Usuario_seleccionado.setEmail(user.getEmail());
		Usuario_seleccionado.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		Usuario_seleccionado.setBirthdate(user.getBirthdate());
		Usuario_seleccionado.setImagen(user.getImagen());
		Usuario_seleccionado.setSteamuser(user.getSteamuser());

		Usuario_actualizado = usuarioDetailsServiceImpl.actualizarUsuario(Usuario_seleccionado);

		return Usuario_actualizado;
	}

	@DeleteMapping("/users/{id}")
	public void eleiminarUsuario(@PathVariable(name = "id") int id) {
		usuarioDetailsServiceImpl.eliminarUsuario(id);
	}
}