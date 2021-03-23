package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Game;
import com.bezkoder.springjwt.repository.IGameDAO;


@Service
public class GameServiceImpl implements IGameService {
	
	@Autowired
	IGameDAO iGameDAO;

	@Override
	public List<Game> listarGames() {
		return iGameDAO.findAll();
	}

	@Override
	public Game guardarGame(Game game) {
		return iGameDAO.save(game);
	}

	@Override
	public Game gameXID(int id) {
		return iGameDAO.findById(id).get();
	}

	@Override
	public Game actualizarGame(Game game) {
		return iGameDAO.save(game);
	}

	@Override
	public void eliminarGame(int id) {
		iGameDAO.deleteById(id);
	}

}
