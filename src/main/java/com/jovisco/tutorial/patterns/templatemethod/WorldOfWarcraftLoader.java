package com.jovisco.tutorial.patterns.templatemethod;

public class WorldOfWarcraftLoader extends AbstractGameLoaderTemplate {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading local WoW data ...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Wow objects from local data ...");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading additional Wow files ...");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Initializing Wow profiles ...");
    }
}
