package javaForCompleteBeginners.programming_CoreJavaClasses.vidY_twentyFive_PublicPrivateProtected.world;

public class Flower {

    public String breedName;
    public String petalCount;

    // doesnt need to go in constructor cuz you already made it here
    //  is initialized the word?
    public final static boolean hasStem = true;
    public final static boolean hasNectar = true;

    protected String widthSize;
    protected String color;

    public Flower() {
    }

    @Override
    public String toString() {
        return String.valueOf(System.out.printf("This flower is a %s breed and has %s petals,\n%s is also %s inches wide.\nIt is %s colour and very beautiful",
                breedName, petalCount, breedName, widthSize, color));
    }

}
