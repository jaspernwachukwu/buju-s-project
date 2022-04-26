package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {
    @Test
    public void testDriller() {
        Kata sheet = new Kata();
        int result = sheet.mult(2);
        assertEquals(4000, result);

    }

    @Test
    public void testDriller5_9() {
        Kata sheet = new Kata();
        int result = sheet.mult(6);
        assertEquals(10800, result);
    }

    @Test
    public void testDriller10_29() {
        Kata sheet = new Kata();
        int result = sheet.mult(15);
        assertEquals(15 * 1600, result);
    }

    @Test
    public void testDriller30_49() {
        Kata sheet = new Kata();
        int result = sheet.mult(35);
        assertEquals(35 * 1500, result);
    }

    @Test
    public void testDriller50_99() {
        Kata sheet = new Kata();
        int result = sheet.mult(60);
        assertEquals(60 * 1300, result);
    }

    @Test
    public void testDriller100_199() {
        Kata sheet = new Kata();
        int result = sheet.mult(110);
        assertEquals(110 * 1200, result);
    }

    @Test
    public void testDriller200_499() {
        Kata sheet = new Kata();
        int result = sheet.mult(220);
        assertEquals(220 * 1100, result);
            }
    @Test
    public void testDriller500() {
        Kata sheet = new Kata();
        int result = sheet.mult(550);
        assertEquals(550 * 1000, result);
    }

}