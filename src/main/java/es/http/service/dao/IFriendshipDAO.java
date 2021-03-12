package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Friendship;

public interface IFriendshipDAO extends JpaRepository<Friendship, Integer> {

	Friendship findByUsername(String username);
}