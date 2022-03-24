package com.calculator.service.calculate;

import com.calculator.service.exception.InvalidOperationException;

public interface Execute {

    int calculate(int firstNumber, int secondNumber, String symbol) throws InvalidOperationException;

}
