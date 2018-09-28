package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ17_fortyTwo_EnumTypesBasicAndAdvancedUsage.jojoTestCode;

public class EnumDayTest {
    Day day;

    public EnumDayTest(Day day) {
        this.day =  day;
    }

    public void tellItLikeItIs() {
        switch(day) {
            case MONDAY:
                System.out.println("Mondays friggin suck");
                break;

            case FRIDAY:
                System.out.println("TGIF: Thank Glob Its Friday!!");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends = Sleep + Fanfiction + SLEEEP");
                break;

            case THURSDAY:
                System.out.println("Did you know today is named after Thor?");
                break;

            default:
                System.out.println("HumpDAAAAY, weekend is so close!!");
                break;
        }
    }


    public static void main(String[] args) {

        EnumDayTest dayOne = new EnumDayTest(Day.MONDAY);
        dayOne.tellItLikeItIs();

        EnumDayTest dayThree = new EnumDayTest(Day.WEDNESDAY);
        dayThree.tellItLikeItIs();

        EnumDayTest dayFour = new EnumDayTest(Day.THURSDAY);
        dayFour.tellItLikeItIs();

        EnumDayTest dayFive = new EnumDayTest(Day.FRIDAY);
        dayFive.tellItLikeItIs();

        EnumDayTest daySix = new EnumDayTest(Day.SATURDAY);
        daySix.tellItLikeItIs();

        EnumDayTest daySeven = new EnumDayTest(Day.SUNDAY);
        daySeven.tellItLikeItIs();

    }
}
