package com.jovisco.tutorial.patterns.templatemethod;

public abstract class AbstractGameLoaderTemplate {

    // template method
    public void load() {
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTemporaryFiles();
        initializeProfiles();
    }

    abstract byte[] loadLocalData();

    abstract void createObjects(byte[] data);

    abstract void downloadAdditionalFiles();

    abstract void initializeProfiles();

    protected void cleanTemporaryFiles() {
        System.out.println("Cleaning temporary files ...");
    }
}
