package com.vladislav.preTask.actions;

import java.util.List;

public class Minus {

    List<Double> doubles;

    public Minus(List<Double> doubles) {
        this.doubles = doubles;
    }

    public double result(){
        double result = doubles.get(0)-doubles.get(1);
        return result;
    }
}
