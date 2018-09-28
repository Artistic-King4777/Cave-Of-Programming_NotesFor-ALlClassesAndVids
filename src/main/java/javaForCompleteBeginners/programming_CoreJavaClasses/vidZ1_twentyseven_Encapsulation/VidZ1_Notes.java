package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ1_twentyseven_Encapsulation;


import javaForCompleteBeginners.programming_CoreJavaClasses.vidY_twentyFive_PublicPrivateProtected.world.Flower;

class Plant {


    // Usually only static final members are public
    public static final int ID = 7;

    // Instance variables should be declared private,
    // or at least protected.
    private String name;

    // Only methods intended for use outside the class
    // should be public. These methods should be documented
    // carefully if you distribute your code.
    public String getData () {
        String data = "some stuff" + calculateGrowthForecast();

        return data;
    }

    // Methods only used by the the class itself should
    // be private or protected.
    private int calculateGrowthForecast () {
        return 9;
    }


    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }
}


class Flowerz {
    public String breedName;
    public String petalCount;

    // doesnt need to go in constructor cuz you already made it here
    //  is initialized the word?
    public final static boolean hasStem = true;
    public final static boolean hasNectar = true;

    protected String widthSize;
    protected String color;

    public Flowerz() {
    }

    // Days
    private int timeTillBloom() {
        return 10;
    }


    // Setters are pretty dangerous for the same reason you need
    //   private or final or static or protected right?
    public String getBreedName() {
        return breedName;
    }

    public String getPetalCount() {
        return petalCount;
    }

    public static boolean isHasStem() {
        return hasStem;
    }

    public static boolean isHasNectar() {
        return hasNectar;
    }

    public String getWidthSize() {
        return widthSize;
    }

    public String getColor() {
        return color;
    }

    // TRIED SOME SOUF
    @Override
    public String toString() {
        return String.valueOf(System.out.printf("This flower is a %s breed and has %s petals,\nThe %s is also %s inches wide.\nIt is %s in colour and very beautiful",
                breedName, petalCount, breedName, widthSize, color));
    }
}

// class is named plant in thr video
public class VidZ1_Notes {
    public static void main(String[] args) {

        Flowerz flower = new Flowerz();
        flower.breedName = "Tiger Lily";
        flower.color = "Orange and deep Green";
        flower.widthSize = "5";
        flower.petalCount = "40";
        flower.toString();


    }
}

