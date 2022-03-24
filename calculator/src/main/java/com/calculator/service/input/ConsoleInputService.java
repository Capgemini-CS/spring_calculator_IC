package com.calculator.service.input;

import com.calculator.service.exception.InvalidOperationException;
import com.calculator.service.validate.ValidateInputService;

import java.util.Scanner;

public class ConsoleInputService extends ValidateInputService implements Input {

    Scanner scanner = new Scanner(System.in);

    @Override
    public int getNumber() {
        return scanner.nextInt();
    }

    @Override
    public String getOperator() throws InvalidOperationException {
        return validateOperator(scanner.next()) ;
    }
}
