package com.calculator.service.output;

import com.calculator.service.calculate.Execute;
import com.calculator.service.exception.InvalidOperationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsoleOutputService implements Output {

    private Execute execute;

    @Autowired
    public ConsoleOutputService(Execute execute) {
        this.execute = execute;
    }

    @Override
    public void display() throws InvalidOperationException {
        System.out.println("The result is:" + execute.calculate());
    }
}
