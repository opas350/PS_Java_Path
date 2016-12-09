package com.opas350.ps.CalcEngine;

public class Main {

    public static void main(String[] args) {

//        MathEquation testEquation = new MathEquation();
//        testEquation.execute();
//        System.out.print("test = " + testEquation.getResult());

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 2250.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }

        System.out.println("\nUsing Overloads\n");

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rigthInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("result = " + equationOverload.getResult());

        equationOverload.execute(leftInt, rigthInt);
        System.out.println("result = " + equationOverload.getResult());
    }
}

