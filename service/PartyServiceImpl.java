package //falta poner//;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IPartyDAO;
import com.crud.h2.dto.Party;

@Service
public class PartyServiceImpl implements IPartyService {

	//Utilizamos los metodos de la interface IpartyDAO, es como si instaciaramos.

	@Autowired
	IPartyDAO iPartyDAO;

	@Override
	public List<Party> listarParties() {
		return iPartyDAO.findAll();
	}

	@Override
	public Party guardarParty(Party party) {
		return iPartyDAO.save(party);
	}

	@Override
	public Party partyXID(String id) {
		return iPartyDAO.findById(id).get();
	}

	@Override
	public Party actualizarParty(Party party) {
		return iPartyDAO.save(party);
	}

	@Override
	public void eliminarParty(String id) {
		iPartyDAO.deleteById(id);
	}

}

}
