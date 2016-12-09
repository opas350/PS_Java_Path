package com.opas350.ps.CalcEngine;

/**
 * Created by Javier on 12/8/2016.
 */
public interface MathProcessing {

    String SEPARATOR = " ";
    String getKeyword(); // add
    char getSymbol();   // +
    double doCalculation(double leftVal, double rightVal);

}
