package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Party;
import com.bezkoder.springjwt.repository.IPartyDAO;


@Service
public class PartyServiceImpl implements IPartyService {
	
	@Autowired
	IPartyDAO iPartyDAO;

	@Override
	public List<Party> listarPartys() {
		return iPartyDAO.findAll();
	}

	@Override
	public Party guardarParty(Party party) {
		return iPartyDAO.save(party);
	}

	@Override
	public Party partyXID(int id) {
		return iPartyDAO.findById(id).get();
	}

	@Override
	public Party actualizarParty(Party party) {
		return iPartyDAO.save(party);
	}

	@Override
	public void eliminarParty(int id) {
		iPartyDAO.deleteById(id);
	}









}
