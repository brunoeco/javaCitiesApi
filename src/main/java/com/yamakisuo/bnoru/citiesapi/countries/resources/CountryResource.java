package com.yamakisuo.bnoru.citiesapi.countries.resources;

import java.util.List;

import com.yamakisuo.bnoru.citiesapi.countries.entities.Country;
import com.yamakisuo.bnoru.citiesapi.countries.repositories.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryResource {

  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/countries")
  public List<Country> cities() {

    return repository.findAll();
  }
}
