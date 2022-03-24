package com.calculator.service.validate;

import com.calculator.service.exception.InvalidOperationException;

public interface Validate {

    int validateNumber(String number) throws InvalidOperationException;

    String validateOperator(String operator) throws InvalidOperationException;
}
