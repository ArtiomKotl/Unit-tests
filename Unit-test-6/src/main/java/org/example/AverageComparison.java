package org.example;


import java.util.List;

public class AverageComparison {
    private AverageComparison() {
        throw new IllegalStateException("Utility class");
    }


    public static double calculateAverage(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

    public static String compareAverages(double average1, double average2) {
        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}