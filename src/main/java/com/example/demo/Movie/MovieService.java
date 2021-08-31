package com.example.demo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepo movieRepo;

    @Autowired
    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }


    public List<Movie> getMovies(){
        return movieRepo.findAll();
    }


    public void addNewMovie(Movie movie) {
        movieRepo.save(movie);
    }

    public void deleteMovie(Long movieId) {
        boolean exists=movieRepo.existsById(movieId);

        if(!exists){
            throw new IllegalStateException("movie with"+ movieId+" doesnt exist");
        }

        movieRepo.deleteById(movieId);
    }
}
