package javaForCompleteBeginners.programming_CoreJavaClasses;

import java.util.Scanner;

/**
 * Title:
 *
 * "Setters and "this" "
 */


//class Frog {
//    private String name;
//    private int age;
//
//    // this.name is the global instance variable that belongs
//    //    to the main class
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setInfo(String name, int age) {
//        setName(name);
//        setAge(age);
//    }
//    ////////////////////////
//}

///////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////



class ArtificialIntelligence{
    // MY CODE:

    private String name;
    private int age;
    private String operatingSystem;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setAllParameters(String name, int age, String operatingSystem){
        setName(name);
        setAge(age);
        setOperatingSystem(operatingSystem);
    }

    public void coffeeON(boolean question) {
        System.out.println("Would you like some coffee sir?");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if(input.equals("yes")) {
            System.out.println("Coffee is already on sir. It shall be ready shortly.");
        } else if ( input.equals("no")){
            System.out.println("Sorry sir I will be turning it on now.");
        } else {
            System.out.println("I do not understand your input sir");
        }

    }


    public void introduction() {
        System.out.println("Hello my name is J.A.R.V.I.S. and I am Just A Rather Very Intelligent System. It is a pleasure to meet you");
    }

}



public class VidQ_Seventeen_SettersAndThis {
    public static void main(String[] args) {

//        Frog frog1 = new Frog();
//
//        //frog1.name = "Bertie";
//        //frog1.age = 1;
//
//        frog1.setName("Bertie");
//        frog1.setAge(1);
//
//        System.out.println(frog1.getName());

        System.out.println("============== MY CODE =====================");

        ArtificialIntelligence jarvis= new ArtificialIntelligence();

        jarvis.setName("Jarvis");
        jarvis.setAge(11);
        jarvis.setOperatingSystem("Stark Ions");
        jarvis.getName();
        jarvis.getAge();
        jarvis.introduction();
        jarvis.coffeeON(true);




    }
}
