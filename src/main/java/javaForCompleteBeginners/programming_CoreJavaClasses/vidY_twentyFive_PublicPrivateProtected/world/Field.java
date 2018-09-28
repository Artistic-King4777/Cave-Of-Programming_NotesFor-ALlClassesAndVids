package javaForCompleteBeginners.programming_CoreJavaClasses.vidY_twentyFive_PublicPrivateProtected.world;

public class Field {

    private Plant plant = new Plant();

    public Field() {

        // size is protected; Field is in the same package as Plant.
        //  it is accessible even tho Field doesn't extend Plant class
        System.out.println(plant.size);
    }


}
