package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ21_fourtyFive_TheTrasnientKeywordAndMoreSerialization;

import javaForCompleteBeginners.programming_CoreJavaClasses.vidZ19_fortyThree_SerializationSavingObjectsToFiles.Person;
import javaForCompleteBeginners.programming_CoreJavaClasses.vidZ20_fortyFour_SerializingArrays.PersonArray;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects_TransientKeyword {
    public static void main(String[] args) {
        System.out.println("Writing objects...");


        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("text.ser"))) {

            PersonTransient person = new PersonTransient(7, "Bob");
            PersonTransient.setCount(88);
            // Write object
            os.writeObject(person);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
