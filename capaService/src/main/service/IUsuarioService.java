package com.example.demo;

import java.util.List;

import com.crud.h2.dto.Usuario;

public interface IUsuarioService {

	// Metodos del CRUD
	public List<Usuario> listarUsuarios(); // Listar All

	public Usuario guardarUsuario(Usuario usuario); // Guarda un empleado CREATE

	public Usuario usuarioXID(Long id); // Leer datos de un empleado READ

	public List<Usuario> listarUsuarioUsername(String username);// Listar usuario por campo username

	public List<Usuario> listarUsuarioEmail(String email);// Listar usuario por campo email

	public List<Usuario> listarUsuario(String steamUser);// Listar usuario por campo steamUser

	public Usuario actualizarUsuario(Usuario usuario); // Actualiza datos del usuario UPDATE

	public void eliminarUsuario(Long id);// Elimina el empleado DELETE
}
