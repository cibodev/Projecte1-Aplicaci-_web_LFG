package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bezkoder.springjwt.models.Party;

public interface IPartyDAO extends JpaRepository<Party, Integer> {


}