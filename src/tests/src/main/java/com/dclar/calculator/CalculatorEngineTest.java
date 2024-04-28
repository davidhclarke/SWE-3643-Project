package com.dclar.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.lang.ArithmeticException;

class CalculatorEngineTest {
    CalculatorEngine calculatorEngine = new CalculatorEngine();

    @Test
    public void Add_TwoFloatingPointValues_ReturnsSum() {
        // preq-UNIT-TEST-2

        // Arrange
        final double a = 5.5;
        final double b = -3.15;
        final double expected = 2.35;

        // Act
        double result = calculatorEngine.add(a, b);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void Subtract_TwoFloatingPointValues_ReturnsDifference() {
        // preq-UNIT-TEST-3

        // Arrange
        final double a = 27.93;
        final double b = 4;
        final double expected = 23.93;

        // Act
        double result = calculatorEngine.subtract(a, b);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void Multiply_TwoFloatingPointValues_ReturnsProduct() {
        // preq-UNIT_TEST-4

        // Arrange
        final double a = 5;
        final double b = 7.1;
        final double expected = 35.5;

        // Act
        double result = calculatorEngine.multiply(a, b);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void Divide_TwoFloatingPointValues_ReturnsQuotient() {
        // preq-UNIT-TEST-5

        // Arrange
        final double a = 9;
        final double b = 3;
        final double expected = 3;

        // Act
        double result = calculatorEngine.divide(a, b);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void Divide_InputBEqualsZero_ThrowsException() {
        // preq-UNIT-TEST-6

        // Arrange
        final double a = 3;
        final double b = 0;

        // Assert
        Assertions.assertThrows(ArithmeticException.class, ()->{calculatorEngine.divide(a, b);});
    }

    @Test
    public void equals_TwoEqualFloatingPointValues_ReturnsOne() {
        // preq-UNIT-TEST-7

        // Arrange
        final double a = 0.333333331;
        final double b = 0.333333332;
        final double expected = 1;

        // Act
        double result = calculatorEngine.equals(a, b);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void equals_TwoUnequalFloatingPointValues_ReturnsZero() {
        // preq-UNIT-TEST-7

        // Arrange
        final double a = 0.333;
        final double b = 0.3333;
        final double expected = 0;

        // Act
        double result = calculatorEngine.equals(a, b);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void power_TwoFloatingPointValues_ReturnsAToPowerOfB() {
        // preq-UNIT-TEST-8

        // Arrange
        final double a = 2;
        final double b = 3;
        final double expected = 8;

        // Act
        double result = calculatorEngine.power(a, b);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void logN_TwoFloatingPointValues_ReturnsALogBaseB() {
        // preq-UNIT-TEST-9

        // Arrange
        final double a = 8;
        final double b = 2;
        final double expected = 3;

        // Act
        double result = calculatorEngine.logN(a, b);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void logN_ALessThanOrEqualToZero_ThrowsException() {
        // preq-UNIT-TEST-10

        // Arrange
        final double a = 0;
        final double b = 2;

        // Assert
        Assertions.assertThrows(ArithmeticException.class, ()->{calculatorEngine.logN(a, b);});
    }


    @Test
    public void logN_BEqualToZero_ThrowsException() {
        // preq-UNIT-TEST-11

        // Arrange
        final double a = 8;
        final double b = 0;

        // Assert
        Assertions.assertThrows(ArithmeticException.class, ()->{calculatorEngine.logN(a, b);});
    }

    @Test
    public void nthRoot_BNotEqualToZero_ReturnsBRootOfA() {
        // preq-UNIT-TEST-12

        // Arrange
        final double a = 8;
        final double b = 3;
        final double expected = 2;

        // Act
        double result = calculatorEngine.nthRoot(a, b);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void nthRoot_BEqualToZero_ThrowsException() {
        // preq-UNIT-TEST-13

        // Arrange
        final double a = 10;
        final double b = 0;

        // Assert
        Assertions.assertThrows(ArithmeticException.class, ()->{calculatorEngine.nthRoot(a, b);});
    }

    @Test
    public void factorial_NonZeroFloatingPointValue_ReturnsFactorialA() {
        // preq-UNIT-TEST-14

        // Arrange
        final double a = 5;
        final double expected = 120;

        // Act
        double result = calculatorEngine.factorial(a);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void factorial_Zero_ReturnsOne() {
        // preq-UNIT-TEST-15

        // Arrange
        final double a = 0;
        final double expected = 1;

        // Act
        double result = calculatorEngine.factorial(a);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void sine_FloatingPointValue_ReturnsSinA() {
        // preq-UNIT-TEST-16

        // Arrange
        final double a = Math.PI;
        final double expected = 0;

        // Act
        double result = calculatorEngine.sine(a);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void cosine_FloatingPointValue_ReturnsCosA() {
        // preq-UNIT-TEST-17

        // Arrange
        final double a = Math.PI;
        final double expected = -1;

        // Act
        double result = calculatorEngine.cosine(a);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void tangent_FloatingPointValue_ReturnsTanA() {
        // preq-UNIT-TEST-18

        // Arrange
        final double a = Math.PI;
        final double expected = 0;

        // Act
        double result = calculatorEngine.tangent(a);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void reciprocal_NonZeroFloatingPointValue_ReturnsReciprocalA() {
        // preq-UNIT-TEST-19

        // Arrange
        final double a = 4;
        final double expected = 0.25;

        // Act
        double result = calculatorEngine.reciprocal(a);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void reciprocal_Zero_ThrowsError() {
        // preq-UNIT-TEST-20

        // Arrange
        final double a = 0;

        // Assert
        Assertions.assertThrows(ArithmeticException.class, ()->{calculatorEngine.reciprocal(a);});
    }
}
















