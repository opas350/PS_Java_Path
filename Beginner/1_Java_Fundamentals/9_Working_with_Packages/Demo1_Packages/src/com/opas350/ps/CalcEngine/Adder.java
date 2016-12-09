package com.opas350.ps.CalcEngine;

/**
 * Created by Javier on 11/29/2016.
 */
public class Adder extends CalculateBase {

    public Adder() {}

    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
