package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Friendship;

@Repository
public interface IFriendshipDAO extends JpaRepository<Friendship, Integer> {


}