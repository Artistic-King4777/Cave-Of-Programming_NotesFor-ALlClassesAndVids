package javaForCompleteBeginners.programming_CoreJavaClasses.vidY_twentyFive_PublicPrivateProtected;

import javaForCompleteBeginners.programming_CoreJavaClasses.vidY_twentyFive_PublicPrivateProtected.world.Flower;

public class Bee extends Flower{

    protected static int id = 0;


    public Bee() {

        System.out.println("Bee " + id ++);
    }


    public String pollen() {
        return "Pollen stuck";
    }

    public String nectar() {
        return "Nectar collected, Honey will be made" ;
    }

    public String spreadPollen(String color) {
        String spreading = "";
        if (color.equalsIgnoreCase("bright yellow") || color.equalsIgnoreCase("red")) {
             spreading += "Pollen is spread";
        }
        return spreading;
    }

}
