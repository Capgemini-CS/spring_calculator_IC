package com.calculator.service.output;

import com.calculator.service.exception.InvalidOperationException;

public interface Output {

    void display() throws InvalidOperationException;
}
