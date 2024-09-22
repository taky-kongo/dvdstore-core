package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

    private GoLiveMovieRepository movieService = new GoLiveMovieRepository();

    public void addUsingConsole() {

        System.out.println("What's the name of the film ?");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println("What is the film's genre ?");
        String genre = sc.nextLine();

        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);

        movieService.add(movie);
    }
}
