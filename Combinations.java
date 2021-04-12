package com.company;
import java.util.*;

public class Combinations {
    static int fact (int number){
        int f = 1;
        int j = 1;
        while (j<=number){
            f =f*j;
            j++;
        }
        return f;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(9);
        numbers.add(12);
        numbers.add(22);
        numbers.add(34);
        numbers.add(91);

        int n = numbers.size();
        int r = 2;

        int result;

        result = fact(n) / (fact(r) * fact(n-r));
        System.out.println("The Combination value for the numbers list is:"+result);
    }
}
