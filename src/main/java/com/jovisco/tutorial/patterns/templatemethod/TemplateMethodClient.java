package com.jovisco.tutorial.patterns.templatemethod;

public class TemplateMethodClient {

    public static void main(String[] args) {

        // perform game loading for Diablo
        AbstractGameLoaderTemplate loader = new DiabloLoader();
        loader.load();

        System.out.println("==========================================");

        // perform game loading for WoW
        loader = new WorldOfWarcraftLoader();
        loader.load();
    }
}
