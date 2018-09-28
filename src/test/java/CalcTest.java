import org.junit.Assert;
import org.junit.Test;
import javaForCompleteBeginners.Calculator;
import javaForCompleteBeginners.PhoneBook;

public class CalcTest {

    @Test
    public void multiplyTest() {
        // Given (I have a calculator)
        Calculator calc = new Calculator();
        int one = 2,
            two = 2;

        // When I try to multiply
        int number = 4;
        int expected = calc.multiply(one, two);


        // Then I expect it to do the calculation
        Assert.assertEquals(expected, number, 0.01);

    }

    @Test
    public void exponentsTest() {
        // Given (I have a calculator)
        Calculator calc = new Calculator();
        double one = 2,
               two = 3;

        // When (I try to calc exponents)
        double number = 8;
        double expected = calc.exponents(one, two);

        // Then (I expect it to calculate)
        Assert.assertEquals(number, expected, 0.01);

    }

    @Test
    public void divisionTest() {
        // Given (I have a calculator)
        // When (I try to divide)
        // Then (I expect it calculate the division)
    }

    @Test
    public void addTest() {
        // Given (I have a phonebook)
        PhoneBook book = new PhoneBook();
        String id = "1";
        String number = "3022669889";

        // When (I try to add to it)
        book.add(id, number);
        String expected = book.lookup(id);


        // Then (I expect the number to be added)
        Assert.assertEquals(number, expected);
    }

    @Test
    public void removeTest() {
        // Given (I have a phonebook)
        PhoneBook book = new PhoneBook();
        String id = "1";
        String number = "3022669889";
        book.add(id, number);

        // When (I try to remove from it)
        String actual = null;
        book.remove(id);
        String expected = book.lookup(number);

        // Then (I expect the number to be added)
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void scoreTest() {
        // Given (I have a word)
        PhoneBook scrabbble = new PhoneBook();

        // When (we score the letters)
        int expected = 8;
        int actual = PhoneBook.score("hello");

        // Then (we expect a score to be given)
        Assert.assertEquals(expected, actual, 0);
        System.out.println(expected + " " + actual);
    }

    // check if i used expected and actual backwards
}
