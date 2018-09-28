package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ21_fourtyFive_TheTrasnientKeywordAndMoreSerialization;

import java.io.Serializable;

public class PersonTransient implements Serializable {


    // commented out cuz worried itll get in the way of the other
    //  person class with same uid
    // also everything works fine without it and im not
    // gettin a warning in java 8
    // private static final long serialVersionUID = 4801633306273802062L;

    /**
     * UID
     * -- If you  write with one id and read with another you get an
     *  error
     *
     *  its just a check to make sure you desrializing the same object
     *  you serialized
     */



    // You use the transient keyword to prevent things from being serialized
    //   id was 7 during writing but reads out 0
    private transient int id;
    private String name;

    // Dont need to serialize
    private static int count;

    PersonTransient() {
        System.out.println("Default Constructor");
    }

    public PersonTransient(int id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("Two-Argument Constructor");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PersonTransient.count = count;
    }

    @Override
    public String toString() {
        return "PersonTransient{" +
                "id=" + id +
                ", name='" + name + "} Count is: " + count + '\'' +
                '}';
    }
}
