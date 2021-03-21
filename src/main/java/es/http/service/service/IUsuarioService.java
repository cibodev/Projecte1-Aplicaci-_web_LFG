package es.http.service.service;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import es.http.service.dto.Usuario;

public interface IUsuarioService {

	// Metodos del CRUD
	public Usuario usuarioXID(int id); // Leer datos de un empleado READ

	public Usuario actualizarUsuario(Usuario usuario); // Actualiza datos del usuario UPDATE

	public void eliminarUsuario(int id);// Elimina el empleado DELETE

	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}