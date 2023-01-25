package com.example.movies.repo;

import com.example.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepositories extends MongoRepository<Movie, ObjectId> {

    public Optional<Movie> findMovieByImdbId(String ImdbId);
}
