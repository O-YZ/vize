package vize;

import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("please enter an integer: ");
       printFizzBuzz(s.nextInt());
    }
    static void printFizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0 ) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}