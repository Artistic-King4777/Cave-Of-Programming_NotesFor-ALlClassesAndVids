package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ0_twentysix_polymorphism;

public class Beez extends Flowersz{

    protected static int id = 0;


    public Beez() {

        System.out.println("Bee " + id ++);
    }


    public String pollen() {
        return "Pollen stuck";
    }

    public String nectar() {
        return "Nectar collected, Honey will be made" ;
    }

    public String spreadPollen(String color) {
        String spreading = "";
        if (color.equalsIgnoreCase("bright yellow") || color.equalsIgnoreCase("red")) {
            spreading += "Pollen is spread";
        }
        return spreading;
    }


}
