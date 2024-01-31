package com.slb.vertigo.poc.business.model.controller.impl;

import com.slb.vertigo.poc.business.domain.Movie;
import com.slb.vertigo.poc.business.model.controller.MovieController;
import com.slb.vertigo.poc.business.model.services.MovieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/movie")
public class MovieControllerImpl implements MovieController {

    @Inject
    private MovieService movieService;

    @Override
    public Movie getMovieById(Long id) {
        return movieService.getMovieById(id);
    }
}
