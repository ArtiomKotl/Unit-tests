package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.example.AverageComparison.calculateAverage;
import static org.example.AverageComparison.compareAverages;

public class Main {
    static Logger logger = Logger.getLogger( "org.example.AverageComparison" );

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<> ();
        List<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        list2.add(15);
        list2.add(25);
        list2.add(35);

        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        logger.log ( Level.SEVERE, () ->"Среднее значение первого списка: " + average1);
        logger.log (Level.SEVERE, () ->"Среднее значение второго списка: " + average2);

        String comparisonResult = compareAverages(average1, average2);
        logger.info(comparisonResult);
    }
}
