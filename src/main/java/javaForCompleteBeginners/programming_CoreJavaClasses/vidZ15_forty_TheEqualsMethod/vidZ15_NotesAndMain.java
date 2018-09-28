package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ15_forty_TheEqualsMethod;


class Person {

    // INSTANCE VARIABLES
    private int id;
    private String name;

    // CONSTRUCTOR
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }


    // AHHHH ITS THIS HASHCODE AND EQUALS WE SAW
    //   IN THE COLLECTIONS
    //   IM ECITED TO HEAR MORE ABOUT IT
    //   thought it was going to be
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


}



public class vidZ15_NotesAndMain {
    public static void main(String[] args) {
        /**
         *
         * TODO - ON EXAMS AND INTERVIEWS THE QUESTION COMES UP
         * TODO - WHAT IS THE .equals() METHOD?
         * TODO - WHAT DOES IT DO?
         * TODO - WHAT DO YOU USE IT FOR
         *
         * == just checking if two references are pointing at the
         *   same objects ONLY not really checking if they have the
         *   same value
         *
         * while .equals() checks if what your checking is
         *   equal in term of value
         *
         *
         * never compare two strings with == always use
         *  the .equals()
         *
         * Dont compare non primitive numbers with ==
         *
         * HashCode is a unique id that each object has (looks a lot like a
         *   memory address
         *
         *
         *
         *   if you generate a equals and hashcode
         *    you can wire the .equals method however you need (selecting what
         *      you want to compare to show that something is equals) like
         *      same ids or names or both
         *
         * HashCode comes up in collections and is good for when your using
         *   two objects to compare for when you use collections to prevent duplicates
         */

        // prints a hashcode
        System.out.println(new Object());

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(5, "Bob");


        System.out.println(person1.equals(person2));



        Double value1 = 7.2;
        Double value2 = 7.2;
        // false
        System.out.println(value1.equals(value2));


        Integer number1 = 6;
        Integer number2 = 6;

        // true
        System.out.println(number1.equals(number2));


        // these two will print out hello (the substring cutting off the end of
        //  text two
        // if u use == it will print false even though bpth print hello because
        //    they are two different objects
        String text1 = "Hello";
        String text2 = "Hellodfadf".substring(0, 5);

        System.out.println(text2);

        System.out.println(text1.equals(text2));
    }
}
