package com.opas350.ps.CalcEngine;

/**
 * Created by Javier on 11/29/2016.
 */
public class Subtracter extends CalculateBase {

    public Subtracter() {}

    public Subtracter(double leftValue, double rigthValue) {
        super(leftValue, rigthValue);
    }

    @Override
    public void calculate() {
        double value = getLeftVal()- getRightVal();
        setResult(value);
    }
}
