package com.calculator.service.operation;

import com.calculator.service.exception.InvalidOperationException;

public interface Operation {

    int operate(int firstNumber, int secondNumber) throws InvalidOperationException;

    String whoAmI();
}
