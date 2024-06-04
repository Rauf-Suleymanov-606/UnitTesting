package com.example.unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicTester {
    @Test
    public void compare() {
        BasicTest basicTests = new BasicTest();
        int result = basicTests.compare(15, 9);
        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("First number is less than the second")
    public void compare2() {
        BasicTest basicTest = new BasicTest();
        int result = basicTest.compare2(2, 3);
        Assertions.assertEquals(-1, result);
    }

    @Test
    @DisplayName("Values are equal")
    public void compare3() {
        BasicTest basicTest = new BasicTest();
        int result = basicTest.compare2(2, 2);
        Assertions.assertEquals(0, result);
    }
    @Test
    @DisplayName("Array sorted")
    public void sortArray(){
        BasicTest basicTest= new BasicTest();
        int [] array={8,9,100,5,2,4,1};
        basicTest.sortArray(array);
        Assertions.assertArrayEquals(new int[]{1,2,4,5,8,9,100},array);
    }
    @Test
    @DisplayName("String successfully reversed..")
    public void reverseString(){
        BasicTest basicTest= new BasicTest();
        String word=basicTest.reverseString("Rauf");
        Assertions.assertEquals("fuar",word);
    }

}
