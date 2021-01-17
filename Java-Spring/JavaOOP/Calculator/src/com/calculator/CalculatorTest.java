package com.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculate = new Calculator(2,3,"+");
        calculate.performOperation();
        System.out.println(calculate.getResults());
        Calculator calculate2 = new Calculator(5,3,"-");
        calculate2.performOperation();
        System.out.println(calculate2.getResults());
        calculate.setOperandOne(10.5);
        calculate.setOperation("+");
        calculate.setOperandTwo(5.2);
        calculate.performOperation();
        System.out.println(calculate.getResults());

    }
}
