package com.yamakisuo.bnoru.citiesapi.countries.repositories;

import com.yamakisuo.bnoru.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
