package com.github.brunajs.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.brunajs.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
