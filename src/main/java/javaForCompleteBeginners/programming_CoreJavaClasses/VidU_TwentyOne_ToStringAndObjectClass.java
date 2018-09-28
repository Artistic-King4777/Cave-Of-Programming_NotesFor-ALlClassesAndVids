package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "toString() and the Object Class"
 */

class Frog {

    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {

        // formatted string
        return String.format("%-4d: %s", id, name);

        /*
        // more efficient way of doing it!
        //  when you use a plus it makes a whole new string
        //   not important in a small program but for a larger one it is

        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);

        return sb.toString();
        */
    }
}

class Shadow {

    private String name;
    private int id;
    private String ability;


    public Shadow (int id, String name, String ability) {
        this.id = id;
        this.name = name;
        this.ability = ability;
    }

    public String toString() {
        StringBuilder a = new StringBuilder();
        a.append(id).append(name).append(ability);

        return a.toString();
    }

}


public class VidU_TwentyOne_ToStringAndObjectClass {
    public static void main(String[] args) {

        // Without a toString() it prints out the HashCode which is similar to memory but
        //   its specifically for Objects or classes
        Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(5, "Roger");

        System.out.println(frog1);
        System.out.println(frog2);

        Shadow onyx = new Shadow(1, "Onyx", "Leader and first mate to king");
        Shadow yami = new Shadow(0, "Yami", "King of the Shadows and Master of fear");

        System.out.printf("\n\n%s%s", onyx, yami);
    }
}
