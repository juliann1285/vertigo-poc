package com.slb.vertigo.poc.business.model.services;

import com.slb.vertigo.poc.business.domain.Movie;
import io.vertigo.datamodel.structure.model.DtList;

public interface MovieService {

    Movie getMovieById(final Long id);
    DtList<Movie> getAll();
    Movie save(Movie m);
}
