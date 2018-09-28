package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ17_fortyTwo_EnumTypesBasicAndAdvancedUsage;

public class vidZ17_NotesAndMain {
    public static void main(String[] args) {

        //the jojoTestCode package is mine made from before
        Animal animal = Animal.DOG;

        switch(animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                break;
            default:
                break;

        }

        System.out.println(Animal.DOG);
        System.out.println("Enum name as a string: " + Animal.DOG.name());

        System.out.println(Animal.DOG.getClass());

        System.out.println(Animal.DOG instanceof Enum);

        System.out.println(Animal.MOUSE.getName());

        Animal animal2 = Animal.valueOf("CAT");

        System.out.println(animal2);
    }


/**
 * "enum" is a special data type that enables variables to be a set of predefined constants
 * the variable must be equal to one of the values that have been predefined for it.
 * common examples include compass directions (Values of NORTH, SOUTH, EAST, and WEST)
 * and days of the week
 *
 * Because they are constants the names of an enum type's fields are in uppercase letters
 *
 * see Enum Day class for example of day of the week enum
 *  -- You use enums when you need to represent a "fixed set of constants" (private static final "variable/mthod etc")
 *  -- This includes natural enum types such as the planets in our solar system and data sets where you
 *  know all possible values like: choices on a menu, command line flags etc
 * SEE EnumDayTest Class for how to use the enum Day Class
 *
 * Java programming language enums are much more powerful then the enum types in other languages
 * "public enum 'NameOfClass'{} " is how you define an enum class
 * This class CAN include methods and other fields as well
 * The compiler auto-adds some special methods when you create an enum class
 * Such as: they have a static "values" method that returns an array containing all of the values of the enum in the order they are declared
 *   ---  This methods commonly used in combination with the for each construct to iterate over the values of an enum type
 *   ---  For example look at the code with the TODO single line comment: "Here's the values example"
 *
 *
 * ALL enums extend "java.lang.enums" and since classes can only extend one parent, and Java does not support multiple inheritance,
 *   --  that means an "enum" class CANNOT extend any other classes
 *
 *
 *
 * In the next example "public enum Planets" is an enum type that obviously represents the planets in our "Solar System"
 *  -- They are defined with constant mass and radius properties (since those don't just SUDDENLY CHANGE)
 *  -- Each num constant is declared with values (there's that method name) for the mass and radius parameters
 *  -- These values are passed into your constructor when the constant is created
 *  -- TODO Java also REQUIRES the constants be defined FIRST, before any fields or methods!!!!
 *  -- Also when there ARE fields or methods, the list of "enum constants" must end with a semicolon
 *
 *
 * TODO: NOTE:: The constructor for an enum type must be package private or private access.
 * TODO: NOTE::  - It automatically creates the constants that are defined at the beginning of the enum body
 * TODO: NOTE::  - You cannot invoke an enum constructor yourself
 *
 *
 * Also! In addition to properties and constructor, "public enum Planets" has methods that all you to
 * -- retrieve the surface gravity and weight of an object on each planet!
 * -- The sample is in the class TODO: "public enum Planets"
 * -- It will take your weight on earth (in any unit) and then "calculates and prints"
 *    -- your weight on ALL of the planets (in the same unit you provided)
 *
 *
 *
 */


}
