package org.example.service;

public class CalcImpl implements Calc{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int multiply(int a, int b) {
        return 0;
    }

    @Override
    public double division(int a, int b) {
        return a/b;
    }

    @Override
    public int subtraction(int a, int b) {
        return 0;
    }
}
