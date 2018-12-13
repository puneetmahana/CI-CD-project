package com.Puneet.Docker.DockerSpringboot.repository;

import com.Puneet.Docker.DockerSpringboot.model.Movie;

import java.util.Map;

public interface RedisRepository {

    /**
     * Return all movies
     */
    Map<Object, Object> findAllMovies();

    /**
     * Add key-value pair to Redis.
     */
    void add(Movie movie);

    /**
     * Delete a key-value pair in Redis.
     */
    void delete(String id);

    /**
     * find a movie
     */
    Movie findMovieById(String id);

}
