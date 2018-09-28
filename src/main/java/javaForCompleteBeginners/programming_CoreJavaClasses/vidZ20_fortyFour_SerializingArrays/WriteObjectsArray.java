package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ20_fortyFour_SerializingArrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteObjectsArray {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        // Arrays are a serializable object
        //  as long as the aobject is serializable you can read and write
        //  as you wish
        PersonArray[] people = {new PersonArray(1, "Sue"), new PersonArray(99, "Mike"), new PersonArray(7, "Bob")};

        //
        ArrayList<PersonArray> peopleList = new ArrayList<PersonArray>(Arrays.asList(people));

        try (FileOutputStream fs = new FileOutputStream("test.ser"); ObjectOutputStream os = new ObjectOutputStream(fs)) {

            // Write entire array
            os.writeObject(people);

            // Write arraylist
            os.writeObject(peopleList);

            // Write objects one by one
            os.writeInt(peopleList.size());

            // for each loop

            for(PersonArray person: peopleList) {
                os.writeObject(person);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
