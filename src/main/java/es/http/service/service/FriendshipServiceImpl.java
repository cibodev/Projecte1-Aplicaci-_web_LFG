package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IFriendshipDAO;
import es.http.service.dto.Friendship;

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
