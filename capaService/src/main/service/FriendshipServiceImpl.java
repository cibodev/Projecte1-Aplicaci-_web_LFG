
package //falta poner//;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.crud.h2.dao.IFriendshipDAO;
import com.crud.h2.dto.Friendship;

@Service
public class FriendshipServiceImpl implements IFriendshipService {

	//Utilizamos los metodos de la interface IFriendshipDAO, es como si instaciaramos.

	@Autowired
	IUsuarioDAO iFriendshipDAO;

	@Override
	public List<Friendship> listarFriendships() {
		return iFriendshipDAO.findAll();
	}

	@Override
	public Friendship guardarFriendship(Friendship friendship) {
		return iFriendshipDAO.save(freindship);
	}

	@Override
	public Friendship friendshipXID(String id) {
		return iFriendshipDAO.findById(id).get();
	}

	@Override
	public Friendship actualizarFriendship(Friendship friendship) {
		return iFriendshipDAO.save(friendship);
	}

	@Override
		public void eliminarFriendship(String id) {
			iFriendshipDAO.deleteById(id);
		}

}

}

}
