package com.opas350.ps.CalcEngine;

/**
 * Created by Javier on 12/8/2016.
 */
public class PowerOf implements MathProcessing {

    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal, rightVal);
    }
}
