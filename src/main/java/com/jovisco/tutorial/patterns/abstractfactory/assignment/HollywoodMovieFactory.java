package com.jovisco.tutorial.patterns.abstractfactory.assignment;

public class HollywoodMovieFactory extends AbstractMovieFactory {

    @Override
    Comedy createComedy() {
        return new HollywoodComedy();
    }

    @Override
    ActionMovie createActionMovie() {
        return new HollywoodActionMovie();
    }
}
