package com.calculator.service.calculate;

import com.calculator.service.exception.InvalidOperationException;
import com.calculator.service.input.Input;
import com.calculator.service.operation.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateService implements Execute {

    private List<Operation> mathOperations;
    private Input input;

    @Autowired
    public CalculateService(List<Operation> mathOperations, Input input) {
        this.mathOperations = mathOperations;
        this.input = input;
    }

    @Override
    public int calculate() throws InvalidOperationException {
        int firstNumber = input.getNumber();
        int secondNumber = input.getNumber();
        String symbol = input.getOperator();

        for (Operation mathOperation : mathOperations) {

            if (mathOperation.whoAmI().equals(symbol)) {
                return mathOperation.operate(firstNumber, secondNumber);
            }
        }
        return 0;
    }
}
