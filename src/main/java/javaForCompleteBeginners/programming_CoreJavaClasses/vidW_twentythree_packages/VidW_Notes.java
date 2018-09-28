package javaForCompleteBeginners.programming_CoreJavaClasses.vidW_twentythree_packages;

// import statements
import javaForCompleteBeginners.programming_CoreJavaClasses.vidW_twentythree_packages.ocean.Dolphins;
import javaForCompleteBeginners.programming_CoreJavaClasses.vidW_twentythree_packages.ocean.Fish;
import javaForCompleteBeginners.programming_CoreJavaClasses.vidW_twentythree_packages.ocean.Sharks;
import javaForCompleteBeginners.programming_CoreJavaClasses.vidW_twentythree_packages.ocean.plants.Anemone;
import javaForCompleteBeginners.programming_CoreJavaClasses.vidW_twentythree_packages.ocean.plants.Coral;
import javaForCompleteBeginners.programming_CoreJavaClasses.vidW_twentythree_packages.ocean.plants.Seaweed;

public class VidW_Notes {
    public static void main(String[] args) {
        /**
         *
         * SOOOOOOO APPARENTLY PACKAGES SHOULDNT DO CAMELCASE OR HAVE UNDERSCORES......WHOOOPS
         * and be SIMPLE
         *
         * package statements should be at the very top
         *
         * had trouble making a com.caveofprogramming folder cuz the . makes a class
         * and i couldnt add a third package but it jus goes all together
         */

        Fish fish = new Fish();

        Seaweed weed = new Seaweed();

        // I ADDED THESE CLASSES BELOW AND LOOK INSIDE THE AQUARIUM
        //    FOR EXAMPLE
        //    I wont add more since its pretty basic??
        //      If more package example is needed I could show my
        //      whole multi package ........excuse me "THING" I
        //      have going on in this entire project of videos :3


        Dolphins dol = new Dolphins();
        Sharks shark = new Sharks();

        Anemone clownFish = new Anemone();
        Coral reef = new Coral();
    }
}
