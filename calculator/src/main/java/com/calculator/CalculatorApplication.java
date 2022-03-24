package com.calculator;

import com.calculator.service.calculate.CalculateService;
import com.calculator.service.calculate.Execute;
import com.calculator.service.exception.InvalidOperationException;
import com.calculator.service.input.ConsoleInputService;
import com.calculator.service.input.Input;
import com.calculator.service.operation.AdditionService;
import com.calculator.service.operation.DivisionService;
import com.calculator.service.operation.MultiplicationService;
import com.calculator.service.operation.SubtractionService;
import com.calculator.service.output.ConsoleOutputService;
import com.calculator.service.output.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class CalculatorApplication  {
	public static void main(String[] args) throws InvalidOperationException {
		SpringApplication.run(CalculatorApplication.class, args);

		Input input = new ConsoleInputService();

		int firstNumber = input.getNumber();
		int secondNumber = input.getNumber();
		String symbol = input.getOperator();

		Execute execute = new CalculateService(List.of(new AdditionService(), new SubtractionService(), new DivisionService(), new MultiplicationService()));
		Output output = new ConsoleOutputService();


		output.display(execute.calculate(firstNumber,secondNumber,symbol));


	}

}
