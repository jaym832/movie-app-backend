package com.example.demo.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@CrossOrigin(origins="http://localhost:3000/")
@CrossOrigin(origins={"*"})

@RestController
@RequestMapping (path = "/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService=movieService;
    }

    @GetMapping
    public List<Movie>getMovies(){
        return movieService.getMovies();
    }

    @PostMapping
    public void registerNewMovie(@RequestBody Movie movie){
        System.out.println(movie);
        movieService.addNewMovie(movie);
    }


    @DeleteMapping(path="{movieId}")
    public void deleteMovie(@PathVariable("movieId")Long movieId){
        movieService.deleteMovie(movieId);
    }

//    @GetMapping("/mytest")
//    public String getInfo(){
//        return "hello";
//    }
}
