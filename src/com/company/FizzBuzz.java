package com.company;
public class FizzBuzz {
    static int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public void showFizzBuzz() {
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}
