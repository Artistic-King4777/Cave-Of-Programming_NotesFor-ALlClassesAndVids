package javaForCompleteBeginners.programming_CoreJavaClasses.vidY_twentyFive_PublicPrivateProtected;

import javaForCompleteBeginners.programming_CoreJavaClasses.vidY_twentyFive_PublicPrivateProtected.world.Flower;
import javaForCompleteBeginners.programming_CoreJavaClasses.vidY_twentyFive_PublicPrivateProtected.world.Plant;

public class VidY_MainAndNotes {


    /*
     * private --- only within same class
     * public --- from anywhere
     * protected -- same class, subclass, and same package
     * no modifier -- same package only
     */

    /*
    Classes I made:

    in world package:
      "Flower" & "Bee"
     */

    public static void main(String[] args) {

        Flower flow = new Flower();
        flow.breedName = "Rose";
        flow.petalCount = "40";
        // CANT BE ACCESSED flow.widthSize same with COLOR!!
        System.out.println("Flower has nectar = " + Flower.hasNectar);
        System.out.println("Flower has a stem = " + Flower.hasStem);

        Bee bee = new Bee();
        System.out.println("Bee-" + Bee.id + " " + bee.pollen());
        System.out.println("Bee-" + Bee.id + " " + bee.spreadPollen("RED"));
        System.out.println("Bee-" + Bee.id + " " + bee.nectar());
        ///////////////////////////////////////////
        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(plant.ID);

        // Won't work --- type is private cant be accessed
        //System.out.println(plant.type);

        // size is protected; App is not in the same package as Plant.
        //    so it Won't work
        // System.out.println(plant.size);

        // This Won't work; App and Plant are in different packages,
        //    height has package-level visibility.
        //System.out.println(plant.height);


    }
}
