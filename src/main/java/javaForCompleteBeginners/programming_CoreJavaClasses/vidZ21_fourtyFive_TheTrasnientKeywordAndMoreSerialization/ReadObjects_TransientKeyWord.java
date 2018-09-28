package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ21_fourtyFive_TheTrasnientKeywordAndMoreSerialization;

import javaForCompleteBeginners.programming_CoreJavaClasses.vidZ20_fortyFour_SerializingArrays.PersonArray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects_TransientKeyWord {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        // Try with resources auto closes your files
        //  if it implemets the AutoClosable interface which this does
        //  automatically in java 7 and above
//        try (FileInputStream fi = new FileInputStream("text.ser"); ObjectInputStream os = new ObjectInputStream(fi)) {
//            PersonTransient persons = (PersonTransient)os.readObject();
//            System.out.println(persons);
//
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }


        ////////////TIDIER VERSION -- TODO made the try() part neater
        //// TODO is still odd and very nested and can be hard to debug so ill go with
        //// TODO   the first one
        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("text.ser"))) {
            PersonTransient persons = (PersonTransient)os.readObject();
            System.out.println(persons);

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
