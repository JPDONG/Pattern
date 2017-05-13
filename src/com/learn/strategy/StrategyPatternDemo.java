package com.learn.strategy;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context1 = new Context(new OperationAdd());
        Utils.print("strategy add. " + context1.executeStrategy(5, 5));
        Context context2 = new Context(new OperationMultiply());
        Utils.print("strategy add. " + context2.executeStrategy(5, 5));
        Context context3 = new Context(new OperationSubstract());
        Utils.print("strategy add. " + context3.executeStrategy(5, 5));

    }
}
