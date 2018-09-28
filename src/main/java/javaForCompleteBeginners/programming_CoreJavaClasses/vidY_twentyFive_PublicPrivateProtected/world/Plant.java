package javaForCompleteBeginners.programming_CoreJavaClasses.vidY_twentyFive_PublicPrivateProtected.world;

class Something {

}

public class Plant {

    // Bad practice shouldn't make it public should be
    // Final or static or private
    //  can call anywhere and change anywhere
    public String name;

    // Acceptable practice --- it's final.
    // final: unchangeable
    // static: only one instance of it in class
    // so its okay to make public
    public final static int ID = 8;

    // inaccessible without getters (shouldnt use setters
    //  cuz that would nullify the whole private reason
    private String type;

    // Protected accessible within all classes in the same package
    //   and within subclasses in other packages
    protected String size;

    int height;

    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
        this.height = 8;
    }
}
