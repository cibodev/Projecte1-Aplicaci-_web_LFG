package //falta poner//;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IUsuarioDAO;
import com.crud.h2.dto.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	//Utilizamos los metodos de la interface IUsuarioDAO, es como si instaciaramos.

	@Autowired
	IUsuarioDAO iUsuarioDAO;

	@Override
	public List<Usuario> listarUsuarios() {
		return iUsuarioDAO.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public Usuario usuarioXID(String id) {
		return iUsuarioDAO.findById(id).get();
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public void eliminarUsuario(String id) {
		iUsuarioDAO.deleteById(id);
	}

}

}
