package com.calculator.service.operation;

import com.calculator.service.exception.InvalidOperationException;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

@Service
public class DivisionService implements Operation {

    @Override
    public int operate(int firstNumber, int secondNumber) throws InvalidOperationException{
        if(secondNumber == 0){
            Logger.error("SecondNumber can't be 0!");
            throw new InvalidOperationException("You chose an invalid number!");
        }
        return firstNumber / secondNumber;
    }

    @Override
    public String whoAmI(){
        return "/";
    }

}
