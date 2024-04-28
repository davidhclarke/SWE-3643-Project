package com.dclar.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String showCalculator(Model model) {
        model.addAttribute("calculator", this);
        return "calculator";
    }

    @PostMapping("/")
    public String calculate(@RequestParam("operand1") double operand1,
                            @RequestParam("operand2") double operand2,
                            @RequestParam("operation") String operation,
                            Model model) {
        CalculatorEngine calc = new CalculatorEngine();
        double result = 0;
        switch (operation) {
            case "add" -> result = calc.add(operand1, operand2);
            case "subtract" -> result = calc.subtract(operand1, operand2);
            case "multiply" -> result = calc.multiply(operand1, operand2);
            case "divide" -> {
                try {
                    result = calc.divide(operand1, operand2);
                } catch (ArithmeticException e) {

                }
            }
            case "equals" -> result = calc.equals(operand1, operand2);
            case "power" -> result = calc.power(operand1, operand2);
            case "logN" -> {
                try {
                    result = calc.logN(operand1, operand2);
                } catch (ArithmeticException e) {

                }
            }
//            case "nthRoot" -> {
//                try {
//                    result = calc.nthRoot(operand1, operand2);
//                } catch (ArithmeticException e) {
//
//                }
//            }
            case "factorial" -> result = calc.factorial(operand1);
            case "sine" -> result = calc.sine(operand1);
            case "cosine" -> result = calc.cosine(operand1);
            case "tangent" -> result = calc.tangent(operand1);
            case "reciprocal" -> {
                try {
                    result = calc.reciprocal(operand1);
                } catch (ArithmeticException e) {

                }
            }
            default -> throw new IllegalArgumentException("Invalid operation");
        }

        model.addAttribute("result", result);
        return "calculator";
    }
}
