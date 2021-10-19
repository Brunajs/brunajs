package com.github.brunajs.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.brunajs.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
