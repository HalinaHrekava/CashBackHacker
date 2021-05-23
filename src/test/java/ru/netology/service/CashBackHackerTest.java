package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert. assertEquals;

public class CashBackHackerTest {
    CashBackHacker service = new CashBackHacker();

    @Test
   public void shouldCalculateHowMuchLeftForBonus1() {
        int sum = 999;
        int actual = service.remain(sum);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
   public void shouldCalculateHowMuchLeftForBonus2() {
        int sum = 1001;
        int actual = service.remain(sum);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
   public void shouldCalculateHowMuchLeftForBonus3() {
        int sum = 11;
        int actual = service.remain(sum);
        int expected = 989;
        assertEquals(actual, expected);
    }


    @Test
   public void shouldGiveMistakeInTest() {
        int sum = 1000;
        int actual = service.remain(sum);
        int expected = 0;
        assertEquals(actual, expected);
    }
}

