package com.kindson.fleetApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindson.fleetApp.models.Country;
import com.kindson.fleetApp.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	//Get All Countrys
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}	
	
	//Get Country By Id
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}	
	
	//Delete Country
	public void delete(int id) {
		countryRepository.deleteById(id);
	}
	
	//Update Country
	public void save( Country country) {
		countryRepository.save(country);
	}

}
