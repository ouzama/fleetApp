package com.kindson.fleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindson.fleetApp.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
