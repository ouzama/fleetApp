package com.kindson.fleetApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kindson.fleetApp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
