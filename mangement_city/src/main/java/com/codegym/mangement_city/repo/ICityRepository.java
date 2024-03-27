package com.codegym.mangement_city.repo;

import com.codegym.mangement_city.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityRepository extends JpaRepository<City, Long> {
}
