package com.calculator.service.input;

import com.calculator.service.exception.InvalidOperationException;
import com.calculator.service.validate.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ConsoleInputService implements Input {

    private Scanner scanner = new Scanner(System.in);

    private Validate validate;

    @Autowired
    public ConsoleInputService(Validate validate) {
        this.validate = validate;
    }

    @Override
    public int getNumber() throws InvalidOperationException {
        return validate.validateNumber(scanner.next());
    }

    @Override
    public String getOperator() throws InvalidOperationException {
        return validate.validateOperator(scanner.next());
    }
}
