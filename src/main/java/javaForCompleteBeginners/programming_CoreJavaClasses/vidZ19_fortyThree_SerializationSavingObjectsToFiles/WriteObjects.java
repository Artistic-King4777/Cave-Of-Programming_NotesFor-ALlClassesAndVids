package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ19_fortyThree_SerializationSavingObjectsToFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Person mike = new Person(543, "Mike");
        Person sue = new Person(123, "Sue");

        System.out.println(mike);
        System.out.println(sue);

        // FileOutputStream -- lets you stream data to a file
        //   needs a name to send files to
        //   dont forget a close method later
        // the file was written dow below the orange target folder
        try(FileOutputStream fs = new FileOutputStream("people.bin")) {

            ObjectOutputStream os = new ObjectOutputStream(fs);

            // methods for writing all kinds of data inside the
            //   ObjectOutputStream
            // using writeObject since we used out own Object
            os.writeObject(mike);
            os.writeObject(sue);

            os.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
