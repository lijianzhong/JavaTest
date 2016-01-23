package com.lijz.pattern.strategy;

/**
 * Created by jianzhongli on 16/1/23.
 */
public class AddOperation implements OperationStrategy {
    @Override
    public int operation(int num1, int num2) {
        return num1 + num2;
    }
}
