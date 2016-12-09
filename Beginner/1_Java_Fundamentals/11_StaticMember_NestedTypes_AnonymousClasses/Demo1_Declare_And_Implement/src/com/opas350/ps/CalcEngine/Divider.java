package com.opas350.ps.CalcEngine;

/**
 * Created by Javier on 11/29/2016.
 */
public class Divider extends CalculateBase {

    Divider() {}

    public Divider(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
