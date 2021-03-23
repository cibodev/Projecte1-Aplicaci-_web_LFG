package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Friendship;

public interface IFriendshipDAO extends JpaRepository<Friendship, Integer> {


}