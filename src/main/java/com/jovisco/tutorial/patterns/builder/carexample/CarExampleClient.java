package com.jovisco.tutorial.patterns.builder.carexample;

public class CarExampleClient {
    public static void main(String[] args) {

        CarDirector director = new CarDirector();
        CarBuilderImpl builder = new CarBuilderImpl();
        director.buildBugatti(builder);
        builder.model("Chiron");
        System.out.println(builder.build());

        CarSchemaBuilderImpl schemaBuilder = new CarSchemaBuilderImpl();
        director.buildLambo(schemaBuilder);
        schemaBuilder.engine("90").nbrOfDoors(3);
        System.out.println(schemaBuilder.build());
    }
}
