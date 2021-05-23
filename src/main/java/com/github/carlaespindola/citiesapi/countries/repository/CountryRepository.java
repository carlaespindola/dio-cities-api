package com.github.carlaespindola.citiesapi.countries.repository;

import com.github.carlaespindola.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
