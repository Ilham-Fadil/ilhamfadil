package com.cigma.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.cigma.demo.Models.Client;

public interface ClientDAO extends CrudRepository<Client, Long>{
}
