package com.opas350.ps.CalcEngine;

/**
 * Created by Javier on 11/29/2016.
 */
public class Multiplier extends CalculateBase {

    public Multiplier() {}

    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
