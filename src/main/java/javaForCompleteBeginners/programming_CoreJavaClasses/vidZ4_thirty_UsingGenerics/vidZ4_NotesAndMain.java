package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ4_thirty_UsingGenerics;

import java.util.ArrayList;
import java.util.HashMap;

class Animal {

}


public class vidZ4_NotesAndMain {
    public static void main(String[] args) {

        /////////////////// Before Java 5 ////////////////////////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1);

        System.out.println(fruit);

        /////////////// Modern style //////////////////////////////

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);

        System.out.println(animal);


        ///////////// There can be more than one type argument ////////////////////

        HashMap<Integer, String> map = new HashMap<Integer, String>();


        //////////// Java 7 style /////////////////////////////////

        ArrayList<Animal> someList = new ArrayList<>();
        ///////////////////////////////////////////////

        System.out.println("//////////////// MY CODE ///////////////////");

        ArrayList<Integer> array = new ArrayList<>();
        array.add(4);
        array.add(5);
        array.add(2);
        array.add(0);

        System.out.println(array);
        System.out.println(array.get(2));


        System.out.println("////////////////////////////");
        HashMap<Integer, String > map2 = new HashMap<>();

        map.put(1, "Hi");
        map.put(2, " How ");
        map.put(3, " Are ");
        map.put(4, " You?");

        System.out.println(map2);





    }
}
