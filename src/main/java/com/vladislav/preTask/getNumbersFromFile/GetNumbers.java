package com.vladislav.preTask.getNumbersFromFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetNumbers {

    List<Double> doubles = new ArrayList<>();

    public List<Double> getNumbersFromFile(File file) {

        try (Scanner scanner = new Scanner(file)) {

            int count = 0;
            while (scanner.hasNextLine()) {
                if (scanner.hasNextDouble()&count<2) {
                    count++;
                    doubles.add(scanner.nextDouble());
                } else {
                    scanner.nextLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doubles;
    }
}
