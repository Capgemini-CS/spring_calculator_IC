package com.calculator.service.validate;

import com.calculator.service.exception.InvalidOperationException;
import org.tinylog.Logger;

public class ValidateInputService {

    public String validateOperator(String operator) throws InvalidOperationException{
        if(!operator.matches("[-+*/]+")){
            Logger.error("Operator should +, -, /, *");
            throw new InvalidOperationException("You chose an invalid operator!");
        }
        return operator;
    }
}
