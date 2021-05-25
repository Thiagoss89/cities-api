package com.github.thiagoss89.citiesapi.countries.repository;


import com.github.thiagoss89.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
