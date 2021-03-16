package //falta poner//;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IGameDAO;
import com.crud.h2.dto.Game;

@Service
public class GameServiceImpl implements IGameService {

	//Utilizamos los metodos de la interface IGameDAO, es como si instaciaramos.

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
	public Game gameXID(String id) {
		return iGameDAO.findById(id).get();
	}

	@Override
	public Game actualizarGame(Game game) {
		return iGameDAO.save(game);
	}

	@Override
	public void eliminarGame(String id) {
		iGameDAO.deleteById(id);
	}

}

}
