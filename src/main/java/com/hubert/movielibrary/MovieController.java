package com.hubert.movielibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieRepository movieRepository;
    @GetMapping("/test")
    public int test(){
        return 2;
    }

    @GetMapping("/movies")
    public List<Movie> getAll(){
        return movieRepository.getAll();
    }
}
