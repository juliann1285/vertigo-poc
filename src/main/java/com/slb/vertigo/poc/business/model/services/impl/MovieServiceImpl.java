package com.slb.vertigo.poc.business.model.services.impl;

import com.slb.vertigo.poc.business.dao.MovieDAO;
import com.slb.vertigo.poc.business.domain.Movie;
import com.slb.vertigo.poc.business.model.services.MovieService;
import io.vertigo.commons.transaction.Transactional;
import io.vertigo.core.lang.Assertion;
import io.vertigo.core.node.component.Component;
import io.vertigo.datamodel.criteria.Criterions;
import io.vertigo.datamodel.structure.model.DtList;
import io.vertigo.datamodel.structure.model.DtListState;

import javax.inject.Inject;

@Transactional
public class MovieServiceImpl implements MovieService, Component {

    @Inject
    private MovieDAO movieDAO;

    @Override
    public Movie getMovieById(Long id) {
        Assertion.check().isNotNull(id);
        return movieDAO.get(id);
    }

    @Override
    public DtList<Movie> getAll() {
        return movieDAO.findAll(Criterions.alwaysTrue(), DtListState.of(100));
    }

    @Override
    public Movie save(Movie movie) {
        Assertion.check().isNotNull(movie);
        return movieDAO.save(movie);
    }
}
