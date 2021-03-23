package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Friendship;
import com.bezkoder.springjwt.repository.IFriendshipDAO;


@Service
public class FriendshipServiceImpl implements IFriendshipService {
	
	@Autowired
	IFriendshipDAO iFriendshipDAO;

	@Override
	public List<Friendship> listarFriendships() {
		return iFriendshipDAO.findAll();
	}

	@Override
	public Friendship guardarFriendship(Friendship friendship) {
		return iFriendshipDAO.save(friendship);
	}

	@Override
	public Friendship friendshipXID(int id) {
		return iFriendshipDAO.findById(id).get();
	}

	@Override
	public Friendship actualizarFriendship(Friendship friendship) {
		return iFriendshipDAO.save(friendship);
	}

	@Override
	public void eliminarFriendship(int id) {
		iFriendshipDAO.deleteById(id);
	}

}
