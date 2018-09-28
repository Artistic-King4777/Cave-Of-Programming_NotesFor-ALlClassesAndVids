package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ16_fortyOne_InnerClasses;

public class WinterSpirit {

    private String name = "Snowflake";

    private class WimterSuzerain {
        public void work() {
            System.out.println(name + " is working.");
        }

        public void crown() {
            System.out.println("Suzerain " + name + " is in charge now");
        }
    }


    public static class Wind {
        public void help(String txt) {
            System.out.println(txt);
        }

        public void fly(boolean picksUp) {
            if (picksUp == true) {
                System.out.println("*carries Jack off*");
            }
        }
    }

    public WinterSpirit(String name) {
        this.name = name;
    }

    public void info() {
        WimterSuzerain winter = new WimterSuzerain();
        winter.crown();
        winter.work();
    }

    public void snowStorm() {
        System.out.println("Starting storm " + name);

        // Use Brain. We don't have an instance of brain
        // until we create one. Instances of brain are
        // always associated with instances of Robot (the
        // enclosing class).
        Wind wind = new Wind();
        wind.help("*gathers cold air and storm clouds*");


        class Snowflakes {
            public void flurry() {
                System.out.println("*storm winds down to soft fluffy flakes*");
            }
        }

        class Staff extends Wind {
            public void speakToWind() {
                System.out.println(" All done Wind!! Take us home please!");
            }
        }
            Snowflakes snow = new Snowflakes();
            snow.flurry();

            Staff staff = new Staff();
            staff.speakToWind();
            wind.fly(true);


    } // end pf snowStorm method

}
