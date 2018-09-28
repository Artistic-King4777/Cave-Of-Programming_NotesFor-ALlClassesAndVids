package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "Static (and Final)"
 */


class Thing {
    public final static int LUCKY_NUMBER = 7;

    // Instance variables
    public String name;

    /**
     * Static
     *
     * each object does not get its own copy
     *
     * static variables/methods are Class variables so
     *    there is one copy because there is only one class
     *
     * It doesnt belong to the new Object you make when you do
     *    Thing variable1 = new Thing()
     *    Thing variable 2 = new Thing()
     *
     *  If you make a static int count then tht count variable is the same
     *     no matter how many "new Thing();" Objects you make
     *     meaning you ca use it to count how many Objects you made
     *
     *
      */

    public static String description;

    public static int count = 0;


    // TODO -- MY CODE BELOW  ---

    public static String type;
    // TODO -- MY CODE ABOVE ----

    // id will have unique values
    public int id;


    // TODO - CONSTRUCTOR
    public Thing() {
        // Assigning id to be equal to count
        id = count;
        // Auto increments count with each new Thing() made
        count++;
    }

    // Instance methods can access static variables
    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }

    // Static methods can call Static variables
    public static void showInfo() {
        System.out.println(description);
        // Won't work: System.out.println(name);
        // Cant call "normal" instance variables
        //   it cant make a static reference to a non static
        //   Static comes before you've made a new Object
    }

    // TODO -- MY CODE BELOW  ---

    public static void showSpecies() {
        System.out.println(type);
    }
    // TODO -- MY CODE ABOVE ----

}// end of thing class




public class VidS_Nineteen_StaticAndFinal {
    public static void main(String[] args) {


        Thing.description = "I am a thing";

        Thing.showInfo();

        System.out.println("Before creating objects, count is: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects, count is: " + Thing.count);

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        // Final and constant meaning its unchangeable
        System.out.println(Math.PI);

        // ALL CAPS
        System.out.println(Thing.LUCKY_NUMBER);

        // TODO ------------- MY CODE ---------------------

        // Make Object
        Thing thing3 = new Thing();

        // Set your variable (if its not private and already set)
        Thing.type = "Shadow King";
        // Call mmethod (dont need sout bcuz its void
        // dont need ref variable bcuz its static
        Thing.showSpecies();
    }
}
