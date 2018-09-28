package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "Getters and Return Values"
 */


class People {
    String name;
    int age;
    String address;

    void speak() {
        System.out.println("My name is: " + name);
    }

    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        System.out.println(yearsLeft);

        return yearsLeft;
    }


    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }


    int clacYearstillDeath() {
        int deathCounter = 110 - age;

        return deathCounter;
    }

    String getAddress() {
        return address;
    }

}


public class VidO_Fifteen_GettersAndReturnValues {
    public static void main(String[] args) {

        People person1 = new People();
        person1.name = "Joe";
        person1.age = 25;
        person1.speak();

        int years = person1.calculateYearsToRetirement();

        System.out.println("Years till retirement: " + years);


        People people1 = new People();
        people1.name ="Tony Stark";
        people1.age = 35;
        people1.getAddress();

        int death = people1.clacYearstillDeath();
        System.out.println(death);
    }// end of psvm
}// end of class
