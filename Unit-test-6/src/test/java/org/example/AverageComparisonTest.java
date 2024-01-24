package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class AverageComparisonTest {

    private List<Integer> list1;
    private List<Integer> list2;

    @BeforeEach
    public void setup() {
        list1 = new ArrayList<>();

        list2 = new ArrayList<>();

    }

    @Test
    void testEqualAverages() {
        list1.add(10);
        list1.add(20);
        list1.add(30);

        list2.add(15);
        list2.add(20);
        list2.add(25);
        double average1 = AverageComparison.calculateAverage(list1);
        double average2 = AverageComparison.calculateAverage(list2);

        String expectedMessage = "Средние значения равны";
        String actualMessage = AverageComparison.compareAverages(average1, average2);

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testFirstListHasGreaterAverage() {
        list1.add(15);
        list1.add(25);
        list1.add(35);

         list2.add(10);
        list2.add(20);
        list2.add(30);

        double average1 = AverageComparison.calculateAverage(list1);
        double average2 = AverageComparison.calculateAverage(list2);

        String expectedMessage = "Первый список имеет большее среднее значение";
        String actualMessage = AverageComparison.compareAverages(average1, average2);

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testSecondListHasGreaterAverage() {
        list1.add(10);
        list1.add(20);
        list1.add(30);

        list2.add(15);
        list2.add(25);
        list2.add(35);

        double average1 = AverageComparison.calculateAverage(list1);
        double average2 = AverageComparison.calculateAverage(list2);

        String expectedMessage = "Второй список имеет большее среднее значение";
        String actualMessage = AverageComparison.compareAverages(average1, average2);

        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}