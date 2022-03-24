package com.calculator.service.validate;

import com.calculator.service.exception.InvalidOperationException;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;
@Service
public class ValidateInputService implements Validate{

    @Override
    public int validateNumber(String number) throws InvalidOperationException{
        if(!number.matches("[0-9]+")){
            Logger.error("You should introduce a number.");
        throw new InvalidOperationException("You inserted an invalid character.");
        }

        return Integer.parseInt(number);
    }

    @Override
    public String validateOperator(String operator) throws InvalidOperationException{
        if(!operator.matches("[-+*/]+")){
            Logger.error("Operator should +, -, /, *");
            throw new InvalidOperationException("You chose an invalid operator!");
        }
        return operator;
    }
}
