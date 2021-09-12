package com.knoldus.OCP;

public class main {
    public static void main(String[] args) throws Exception {
        Calculator calci = new Calculator();
        Addition add = new Addition(85,18);
        Subtraction sub = new Subtraction(84,4);
        Multiplication mul = new Multiplication(5,5);
        calci.calculate(add);
        System.out.println("Addition of both number is:  "+add.sum);
        calci.calculate(sub);
        System.out.println("Subtraction of both number is:  "+sub.difference);
        calci.calculate(mul);
        System.out.println("Multiplication of both number is:  "+mul.product);

    }
}
