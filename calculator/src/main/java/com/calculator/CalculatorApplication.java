package com.calculator;

import com.calculator.service.exception.InvalidOperationException;
import com.calculator.service.output.ConsoleOutputService;
import com.calculator.service.output.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

    private ApplicationContext applicationContext;

    @Autowired
    public CalculatorApplication(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) throws InvalidOperationException {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Output output = applicationContext.getBean(ConsoleOutputService.class);
        output.display();
    }
}
