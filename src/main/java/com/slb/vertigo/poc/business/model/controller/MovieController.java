package com.slb.vertigo.poc.business.model.controller;

import com.slb.vertigo.poc.business.domain.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface MovieController {

    @GetMapping(path = "/{id}")
    Movie getMovieById(@PathVariable(name = "id") Long id);
}
