package javaForCompleteBeginners.programming_CoreJavaClasses.vid_v_twentytwo_inheritance;

public class Puppy extends Dog{

    public String play = "I LOVE BALL";
    public boolean nobath = true;
    public String car = "*chases after it*";

    public String familyDescrip() {
       StringBuilder pup = new StringBuilder();

       pup.append("\nBut My name is Jack! Pitch is my dad! ").append(play)
               .append("Baths are terrible").append(nobath).append(car)
               .append("This is my dad!").append(description())
               .append("Isn't he awesome?!");

        return pup.toString();
    }
}
