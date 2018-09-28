package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ17_fortyTwo_EnumTypesBasicAndAdvancedUsage.jojoTestCode;

public class CreatureMain {
    public static void main(String[] args) {
        Creatures creatures = Creatures.BASILISK;

        switch(creatures) {
            case BASILISK:
                System.out.println("Basilisks, so amazing!!!");
                break;
            case MERMAN:
                System.out.println("Mermen, so mysterious!");
                break;
            case DRAGON:
                System.out.println("Dragons, so fierce!!");
                break;
        }

        // This is the one that prints out with the toString()
        System.out.println("\n" + Creatures.BASILISK);
        // This is a name method that comes with the enum class
        // it allows you to get the constant variable rather then what you assigned to it
        // Which is what you usually want as a developer
        System.out.println("Enum name as a string: " + Creatures.BASILISK.name());

        System.out.println("\n" + Creatures.BASILISK.getClass() + "\n");

        System.out.println(Creatures.BASILISK instanceof Enum);

        System.out.println("\n" + Creatures.BASILISK.getName());


        // Does not work am getting sn error i dont understand
//        caveOfProgramming.Creatures creature2 = caveOfProgramming.Creatures.valueOf("BASLISK");
//        System.out.println("\n" + creature2);





    } // END OF PSVM

    /**
     * Enum stands for Enumerated
     *
     * If you enumerate something
     * You can count through it like 1 2 3
     *
     * The enum type represents a fixed set that has
     * particular certain fixed values
     * Although actually not in any particular order
     */


}
