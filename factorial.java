package com.company;
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        int n, mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        factorial obj = new factorial();
        mul = obj.fact(n);
        System.out.println("Factorial of "+n+" : "+mul);



    }
    int fact(int x){
        if (x>1){
            return (x*fact(x-1));
        }
        return 1;
    }
}
