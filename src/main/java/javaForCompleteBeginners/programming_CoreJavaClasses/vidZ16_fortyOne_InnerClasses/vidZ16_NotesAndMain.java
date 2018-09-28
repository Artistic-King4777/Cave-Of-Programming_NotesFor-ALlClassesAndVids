package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ16_fortyOne_InnerClasses;

public class vidZ16_NotesAndMain {
    public static void main(String[] args) {

        Robot robot = new Robot(7);
        robot.start();

        // The syntax below will only work if Brain is
        // declared public. It is quite unusual to do this.
        // Robot.Brain brain = robot.new Brain();
        // brain.think();

        // This is very typical Java syntax, using
        // a static inner class.
        Robot.Battery battery = new Robot.Battery();
        battery.charge();
        System.out.println("////////// MY CODE ///////////////");

        WinterSpirit jack = new WinterSpirit("Jack");
        jack.info();
        jack.snowStorm();


    }
}
