package com.jovisco.tutorial.patterns.abstractfactory.assignment;

public class MovieFactoryClient {

    public static void main(String[] args) {

        // create Hollywood movies
        AbstractMovieFactory movieFactory = new HollywoodMovieFactory();
        movieFactory.createComedy().play();
        movieFactory.createActionMovie().play();

        // create Bollywood movies
        movieFactory = new BollywoodMovieFactory();
        movieFactory.createComedy().play();
        movieFactory.createActionMovie().play();
    }
}
