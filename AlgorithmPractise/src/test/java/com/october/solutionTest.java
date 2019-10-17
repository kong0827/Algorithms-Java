package com.october;

import org.junit.Assert;
import org.junit.Test;


public class solutionTest {

    private Solution p = new Solution();

    @Test
    public void test1() {
        int[] guess = new int[]{1,2,3};
        int[] answer = new int[]{1,2,3};
        int number = p.game(guess, answer);
        Assert.assertEquals(3, number);
    }

    @Test
    public void test2() {
        int[] guess = new int[]{2,2,3};
        int[] answer = new int[]{3,2,1};
        int number = p.game(guess, answer);
        Assert.assertEquals(1, number);
        Assert.assertNotEquals(2, number);
    }

    @Test
    public void test3() {
        int[] guess = new int[]{1,2,3};
        int[] answer = new int[]{3,1,1};
        int number = p.game(guess, answer);
        Assert.assertEquals(0, number);
    }

}
