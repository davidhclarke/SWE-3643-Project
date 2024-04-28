package com.dclar.calculator;

import jakarta.servlet.http.HttpServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication extends HttpServlet {

	public static void main(String[] args) {
		SpringApplication.run(com.dclar.calculator.CalculatorApplication.class, args);
	}

}
