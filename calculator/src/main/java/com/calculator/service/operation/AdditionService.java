package com.calculator.service.operation;

import org.springframework.stereotype.Service;

@Service
public class AdditionService implements Operation {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public String whoAmI() {
        return "+";
    }
}
