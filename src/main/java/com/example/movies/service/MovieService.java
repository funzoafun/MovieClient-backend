package com.example.movies.service;

import com.example.movies.model.Movie;
import com.example.movies.repo.MovieRepositories;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepositories movierepo;

    public List<Movie> allMovies() {
        return movierepo.findAll();
    }

    public Optional<Movie> movie(String imdbId){
        return movierepo.findMovieByImdbId(imdbId);
    }
}
