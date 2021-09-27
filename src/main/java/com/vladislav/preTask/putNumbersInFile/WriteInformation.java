package com.vladislav.preTask.putNumbersInFile;

import com.vladislav.preTask.actions.Division;
import com.vladislav.preTask.actions.Minus;
import com.vladislav.preTask.actions.Multiplication;
import com.vladislav.preTask.actions.Plus;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class WriteInformation {

    File file;

    public WriteInformation(File file) {
        this.file = file;
    }

    public void writeInform(List<Double>numbers){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            Division division = new Division(numbers);
            Plus plus = new Plus(numbers);
            Minus minus = new Minus(numbers);
            Multiplication multiplication = new Multiplication(numbers);
            writer.write( numbers.get(0)+" + " +
                            numbers.get(1)+ " = " +
                            plus.result());
            writer.newLine();
            writer.write(numbers.get(0)+" - " +
                            numbers.get(1)+ " = " +
                            minus.result());
            writer.newLine();
            writer.write( numbers.get(0)+" * " +
                            numbers.get(1)+ " = " +
                            multiplication.result());
            writer.newLine();
            writer.write(numbers.get(0)+" / " +
                            numbers.get(1)+ " = " +
                            division.result());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("!!!file do not have enough valid numbers :( !!!");
        }
    }
}
