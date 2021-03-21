package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Party;
import es.http.service.service.PartyServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class PartyController {

	@Autowired
	PartyServiceImpl partyServiceImpl;

	@GetMapping("/partys")
	public List<Party> listarParty() {
		return partyServiceImpl.listarPartys();
	}

	@PostMapping("/partys")
	public Party salvarParty(@RequestBody Party party) {

		return partyServiceImpl.guardarParty(party);
	}

	@GetMapping("/partys/{id}")
	public Party PartyXID(@PathVariable(name = "id") int id) {

		Party Party_xid = new Party();

		Party_xid = partyServiceImpl.partyXID(id);

		// System.out.println("Party XID: "+Party_xid);

		return Party_xid;
	}

	@PutMapping("/partys/{id}")
	public Party actualizarParty(@PathVariable(name = "id") int id, @RequestBody Party Party) {

		Party Party_seleccionado = new Party();
		Party Party_actualizado = new Party();

		Party_seleccionado = partyServiceImpl.partyXID(id);

		Party_seleccionado.setNombre(Party.getNombre());
		Party_seleccionado.setId_game(Party.getId_game());
		Party_seleccionado.setId_usuario(Party.getId_usuario());

		Party_actualizado = partyServiceImpl.actualizarParty(Party_seleccionado);

		// System.out.println("El Party actualizado es: "+ Party_actualizado);

		return Party_actualizado;
	}

	@DeleteMapping("/partys/{id}")
	public void eleiminarParty(@PathVariable(name = "id") int id) {
		partyServiceImpl.eliminarParty(id);
	}
}