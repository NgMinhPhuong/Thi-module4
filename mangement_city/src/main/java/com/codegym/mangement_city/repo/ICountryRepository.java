package com.codegym.mangement_city.repo;

import com.codegym.mangement_city.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country, Long> {
}
