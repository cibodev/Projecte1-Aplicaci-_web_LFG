package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Message;

public interface IMessageDAO extends JpaRepository<Message, Integer> {

}