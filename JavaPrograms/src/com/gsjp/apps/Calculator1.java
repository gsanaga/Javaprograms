package com.gsjp.apps;

import java.util.Scanner;

public class Calculator1 {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Maths test1 = new Maths();

    double answer = 0;
    double inputA, inputB;
    char operator;
    boolean done = false;

     while (done == false) {
        System.out.print("Please enter your sum: ");

        inputA = input.nextDouble();
        operator = input.next().charAt(0);
        inputB = input.nextDouble();        

        switch (operator) {
            case '+': answer = test1.add(inputA, inputB);
                      break;
            case '-': answer = test1.subtract(inputA, inputB);
                      break;
            case '*': answer = test1.multiply(inputA, inputB);
                      break;
            case '/': answer = test1.divide(inputA, inputB);
                      break;
            case '^': answer = test1.power(inputA, inputB);
                      break;
        }

            System.out.println(answer);             
    }       
     input.close();
}
}
