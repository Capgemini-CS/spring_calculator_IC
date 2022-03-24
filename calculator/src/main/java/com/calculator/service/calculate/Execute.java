package com.calculator.service.calculate;

import com.calculator.service.exception.InvalidOperationException;

public interface Execute {

    int calculate() throws InvalidOperationException;

}
