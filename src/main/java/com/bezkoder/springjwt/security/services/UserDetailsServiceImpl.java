package com.bezkoder.springjwt.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.springjwt.models.Usuario;
import com.bezkoder.springjwt.repository.IUsuarioDAO;

@Service
public class UserDetailsServiceImpl implements UserDetailsService,IUsuarioService {
	@Autowired
	IUsuarioDAO userRepository;

	
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

		return UserDetailsImpl.build(user);
	}
	
	@Override
	public Usuario usuarioXID(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return userRepository.save(usuario);
	}

	@Override
	public void eliminarUsuario(int id) {
		userRepository.deleteById(id);
	}

}
