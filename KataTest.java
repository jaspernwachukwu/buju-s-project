package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int result = calculator.add(2,6);
        assertEquals( 8,result);
        assertEquals(66,calculator.add(54,12));
    }

    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(2,4);
        assertEquals(2,result);

    }

    @Test
    public void absoluteSubtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(2,4);
        assertEquals(2,result);
    }

    @Test
    public void productTest(){
        Kata calculator = new Kata ();
        int product = calculator.product(7,9);
        assertEquals(63,product);
    }

    @Test
    public void quotientTest(){
        Kata calculator = new Kata();
        int quotient = calculator.quotient(5,0);
        assertEquals(0,quotient);
    }


}

