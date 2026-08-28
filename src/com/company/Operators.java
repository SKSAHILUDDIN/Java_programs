package com.company;
import java.util.Scanner;
public class Operators {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a prefereed first value: ");
        int val1 = sc.nextInt();
        System.out.println("Give a prefereed second value: ");
        int val2 = sc.nextInt();
        if (val1>val2)
        {
            System.out.println("First value is greater -> " + val1+ ">"+  val2);
        }
        else if (val1<val2) {

            System.out.println("Second value is greater -> " + val1+ "<"+  val2);
        }


    }
}
