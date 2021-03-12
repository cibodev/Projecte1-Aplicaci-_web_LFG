package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Party;

public interface IPartyDAO extends JpaRepository<Party, Integer> {

}