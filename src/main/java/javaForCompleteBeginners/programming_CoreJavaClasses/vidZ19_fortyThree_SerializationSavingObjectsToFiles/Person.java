package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ19_fortyThree_SerializationSavingObjectsToFiles;

import java.io.Serializable;

// Must implement the Serializable interface to make an object serializable
public class Person implements Serializable{
    // need to generate this if theres a random warning
    //   this is the ID for the class if its changed it wont read
    //   helps make sure your reading the same file you wrote with
    private static final long serialVersionUID = 4801633306273802062L;

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}
