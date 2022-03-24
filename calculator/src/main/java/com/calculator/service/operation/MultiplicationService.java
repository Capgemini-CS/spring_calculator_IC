package com.calculator.service.operation;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationService implements Operation{

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public String whoAmI(){
        return "*";
    }

}
