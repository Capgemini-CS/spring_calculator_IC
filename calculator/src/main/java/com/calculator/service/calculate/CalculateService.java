package com.calculator.service.calculate;

import com.calculator.service.exception.InvalidOperationException;
import com.calculator.service.operation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateService implements Execute {

    private List<Operation> mathOperations;

    @Autowired
    public CalculateService(List<Operation> mathOperations) {
        this.mathOperations = mathOperations;
    }


//    private Operation whoAmI(String symbol) {
//
//        Operation operation = null;
//        switch (symbol) {
//            case "+":
//                operation = new AdditionService();
//                break;
//            case "-":
//                operation = new SubtractionService();
//                break;
//            case "*":
//                operation = new MultiplicationService();
//                break;
//            case "/":
//                operation = new DivisionService();
//                break;
//        }
//        return operation;
//    }

    @Override
    public int calculate(int firstNumber, int secondNumber, String symbol) throws InvalidOperationException {
        int result = 0;

        for (Operation mathOperation : mathOperations) {

            if (mathOperation.whoAmI().equals(symbol)) {
                result = mathOperation.operate(firstNumber, secondNumber);
            }
        }
        return result;
    }
}
