package com.yamakisuo.bnoru.citiesapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {
    @GetMapping
    public List<Country> countries() {
        return
    }
}
