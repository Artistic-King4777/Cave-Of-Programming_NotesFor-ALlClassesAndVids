package javaForCompleteBeginners.programming_CoreJavaClasses.vid_v_twentytwo_inheritance;

public class Dog {

    public int age = 700;
    public String names = "Pitch";
    public boolean adult = true;

    public String description() {
        StringBuilder dog = new StringBuilder();

        dog.append("My name is ").append(names).append("I am ")
                .append(age).append("yrs old and i am an adult ")
                .append(adult);
        return dog.toString();
    }
}
