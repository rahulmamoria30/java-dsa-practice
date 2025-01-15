package ArrayPractice;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println("Nth fibbonacci Number : " + fib(n));
    }

    public  static  int fib(int n){
        if(n==0 || n==1) return n;
        return fib(n-1) + fib(n-2);
    }
}
