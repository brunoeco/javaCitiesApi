package com.yamakisuo.bnoru.citiesapi.staties.repositories;

import com.yamakisuo.bnoru.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
