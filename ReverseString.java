package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String need to be reverse: ");
        String input = sc.nextLine();

        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for (int i=0;i<strAsByteArray.length;i++)
        {
            result[i] = strAsByteArray[strAsByteArray.length-i-1];
        }
        System.out.println(new String(result));
    }
}
