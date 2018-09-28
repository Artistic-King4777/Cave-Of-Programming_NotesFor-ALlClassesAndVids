package javaForCompleteBeginners.programming_CoreJavaClasses.vidY_twentyFive_PublicPrivateProtected.world;

public class Oak extends Plant{

    // Consstructor
    public Oak() {

        // Won't work -- type is private
        // so means can only be accessed within the Plant Class
        // type = "tree";

        // This works --- size is protected, Oak is a subclass of plant. and
        //   Protected is still un callable from the outside like a
        //   private but its accessible within the class, any sub class
        //   and the same package
        this.size = "large";

        // No access specifier; works because Oak and Plant in same package
        this.height = 10;
    }

}
