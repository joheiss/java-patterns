package com.jovisco.tutorial.patterns.templatemethod;

public class DiabloLoader extends AbstractGameLoaderTemplate {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading local Diablo data ...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Diablo objects from local data ...");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading additional Diablo files ...");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Initializing Diablo profiles ...");
    }
}
