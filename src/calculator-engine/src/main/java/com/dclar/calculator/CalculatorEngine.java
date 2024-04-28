package com.dclar.calculator;

import java.lang.Math;

public class CalculatorEngine {
    public double add(double inputA, double inputB) {
        // preq-ENGINE-3
        return inputA + inputB;
    }
    public double subtract(double inputA, double inputB) {
        // preq-ENGINE-4
        return inputA - inputB;
    }
    public double multiply(double inputA, double inputB) {
        // preq-ENGINE-5
        return inputA * inputB;
    }
    public double divide(double inputA, double inputB) throws ArithmeticException {
        // preq-ENGINE-7
        if (inputB == 0) {
            throw new ArithmeticException("division by zero");
        }
        return inputA / inputB;
    }
    public double equals(double inputA, double inputB) {
        // preq-ENGINE-8
        double precision = Math.pow(10, 8);
        inputA = Math.round(inputA * precision);
        inputB = Math.round(inputB * precision);
        if (inputA == inputB) {
            return 1;
        } else {
            return 0;
        }
    }
    public double power(double inputA, double inputB) {
        // preq-ENGINE-9
        return Math.pow(inputA, inputB);
    }
    public double logN(double inputA, double inputB) throws ArithmeticException {
        // preq-ENGINE-10
        if (inputA <= 0) {
            throw new ArithmeticException("a <= 0");
        }
        if (inputB == 0) {
            throw new ArithmeticException("b == 0");
        }
        return Math.log(inputA) / Math.log(inputB);
    }

    public double nthRoot(double inputA, double inputB) throws ArithmeticException {
        if (inputB == 0) {
            throw new ArithmeticException("division by zero");
        }
        return Math.pow(inputA, 1/inputB);
    }

    public double factorial(double inputA) {
        // preq-ENGINE-12
        inputA = Math.round(inputA);
        if (inputA == 0) {
            return 1;
        } else {
            return inputA * factorial(inputA - 1);
        }
    }

    public double sine(double inputA) {
        // preq-ENGINE-13
        return Math.round(Math.sin(inputA)*Math.pow(10, 8)) / Math.pow(10, 8);
    }

    public double cosine(double inputA) {
        // preq-ENGINE-14
        return Math.round(Math.cos(inputA)*Math.pow(10, 8)) / Math.pow(10, 8);
    }

    public double tangent(double inputA) {
        // preq-ENGINE-15
        return Math.round(Math.tan(inputA)*Math.pow(10, 8)) / Math.pow(10, 8);
    }

    public double reciprocal(double inputA) throws ArithmeticException {
        // preq-ENGINE-16
        if (inputA == 0) {
            throw new ArithmeticException("division be zero");
        }
        return 1 / inputA;
    }
}














