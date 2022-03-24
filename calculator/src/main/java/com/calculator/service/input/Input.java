package com.calculator.service.input;

import com.calculator.service.exception.InvalidOperationException;

public interface Input {

    int getNumber();
    String getOperator() throws InvalidOperationException;

}
