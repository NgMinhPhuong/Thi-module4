package com.codegym.mangement_city.service;

import com.codegym.mangement_city.model.Country;
import com.codegym.mangement_city.repo.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoutryService {
    @Autowired
    private ICountryRepository iCountryRepository;

    public List<Country> findAll(){
        return iCountryRepository.findAll();
    }
}
