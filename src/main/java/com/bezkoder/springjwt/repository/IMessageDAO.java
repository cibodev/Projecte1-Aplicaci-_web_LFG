package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Message;

public interface IMessageDAO extends JpaRepository<Message, Integer> {

}