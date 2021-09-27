package com.vladislav.preTask;


import com.vladislav.preTask.getNumbersFromFile.GetNumbers;
import com.vladislav.preTask.putNumbersInFile.WriteInformation;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> doubles;
        File fileInput = new File("src\\main\\resources\\numbers.txt");
        File fileOutput = new File("result.txt");
        GetNumbers getNumbers = new GetNumbers();
        doubles = getNumbers.getNumbersFromFile(fileInput);
        WriteInformation writeInformation = new WriteInformation(fileOutput);
        writeInformation.writeInform(doubles);
    }
}
