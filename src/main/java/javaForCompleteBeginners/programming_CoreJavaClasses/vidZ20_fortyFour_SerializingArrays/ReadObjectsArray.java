package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ20_fortyFour_SerializingArrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadObjectsArray {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try (FileInputStream fi = new FileInputStream("test.ser"); ObjectInputStream os = new ObjectInputStream(fi)) {

            // Read entire array
            PersonArray[] people = (PersonArray[])os.readObject();

            // Read entire arraylist
            //  suppresses warnings about this
            @SuppressWarnings("unchecked")
            ArrayList<PersonArray> peopleList = (ArrayList<PersonArray>)os.readObject();

            for(PersonArray person : people) {
                System.out.println(person);
            }

            for(PersonArray person : peopleList) {
                System.out.println(person);
            }

            // Read objects one by one.
            int num = os.readInt();

            // reead objects one by and added a ninth person
            for(int i=0; i<num; i++) {
                PersonArray person = (PersonArray)os.readObject();
                System.out.println(person);
            }

            // dont need this when using the Try With Resources blocks
            //  it apparently closes it automatically
            // os.close

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
