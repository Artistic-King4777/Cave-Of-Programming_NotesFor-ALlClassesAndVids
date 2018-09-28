package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ2_twentyEight_CastingNumericalValues;

public class vidZ2_Notes {
    public static void main(String[] args) {


        // -128 to +127 = 256 values including 0
        byte byteValue = 20;


        // 16 bits
        short shortValue = 55;

        // 32 bits
        int intValue = 888;

        //
        long longValue = 23355;

        // need the f after a decimal to make it
        //   read as a float
        float floatValue = 8834.8f;
        float floatValue2 = (float)99.3;

        // greater precision then float
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);


        intValue = (int)longValue;

        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        // chopped off the end so the point 8 is gone
        // not rounded either -- need Math.Rnd for for tht
        intValue = (int)floatValue;
        System.out.println(intValue);



        // The following won't work as we expect it to!!
        // 128 is too big for a byte.
        // Make sure your casting something into in
        //   a vslue it will fit in!! Or else
        //   you got weird results
        byteValue = (byte)128;
        System.out.println(byteValue);


        // You cant convert a String to an int or back again
        /// these videos are old though and from Java 7
        // I kknw aboout String.valueOf() would convert just about
        //   anything I knw there are Double.valueOf()
        //   or parseDouble()?? not sure which its called or
        //   if its both but ill add them later


        System.out.println("////////// MY CODE //////////////////////");

        System.out.println("\nByte min value: " + Byte.MIN_VALUE +
                "\nByte max value: " + Byte.MAX_VALUE);


        System.out.println("\nShort min value: " + Short.MIN_VALUE +
                "\nShort max value: " + Short.MAX_VALUE);


        System.out.println("\nInt min value: " + Integer.MIN_VALUE +
                "\nInt max value: " + Integer.MAX_VALUE);


        System.out.println("\nLong min value: " + Long.MIN_VALUE +
                "\nLong max value: " + Long.MAX_VALUE);


        System.out.println("\nFloat min value: " + Float.MIN_VALUE +
                "\nFloat max value: " + Float.MAX_VALUE);

        System.out.println("\nDouble min value: " + Double.MIN_VALUE +
                "\nDouble max value: " + Double.MAX_VALUE);






    }
}
