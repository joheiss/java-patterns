package com.jovisco.tutorial.patterns.abstractfactory.assignment;

public class BollywoodMovieFactory extends AbstractMovieFactory{
    @Override
    Comedy createComedy() {
        return new BollywoodComedy();
    }

    @Override
    ActionMovie createActionMovie() {
        return new BollywoodActionMovie();
    }
}
