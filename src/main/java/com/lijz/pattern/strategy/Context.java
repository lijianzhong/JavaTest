package com.lijz.pattern.strategy;

/**
 * Created by jianzhongli on 16/1/23.
 */
public class Context {

    private OperationStrategy operationStrategy;

    public void setOperationStrategy(OperationStrategy operationStrategy){

        this.operationStrategy = operationStrategy;
    }

    public int executeStrategy(int num1, int num2){

        return operationStrategy.operation(num1, num2);
    }

    public static void main(String[] args){

        Context context = new Context();
        context.setOperationStrategy(new AddOperation());
        System.out.println("3+4="+context.executeStrategy(3,4));

        context.setOperationStrategy(new SubstractOperation());
        System.out.println("4-3="+context.executeStrategy(4,3));

        context.setOperationStrategy(new MultiOperation());
        System.out.println("4*3="+context.executeStrategy(4,3));
    }
}
