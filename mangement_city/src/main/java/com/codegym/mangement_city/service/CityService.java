package com.codegym.mangement_city.service;

import com.codegym.mangement_city.model.City;
import com.codegym.mangement_city.repo.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private ICityRepository iCityRepository;

    public List<City> findAll(){
        return iCityRepository.findAll();
    }

    public City findById(Long id){
        return iCityRepository.findById(id).get();
    }

    public void add(City city){
        iCityRepository.save(city);
    }
    public void delete(Long id){
        iCityRepository.deleteById(id);
    }
    public void update(City city){
        iCityRepository.save(city);
    }
}
