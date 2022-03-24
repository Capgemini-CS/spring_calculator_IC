package com.calculator.service.output;

import org.springframework.stereotype.Service;

@Service
public class ConsoleOutputService implements Output{

    @Override
    public void display(int result){
        System.out.println("The result is:" + result);
    }
}
