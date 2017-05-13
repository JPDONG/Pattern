package com.learn.strategy;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
