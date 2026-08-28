package com.company;
import java.util.Scanner;

public class CbscPercentageCalci {

    public static void main(String[] args) {
        Scanner str= new Scanner(System.in);

        System.out.println("Enter the student name :");
        String name= str.nextLine();
        System.out.println("Enter the marks for maths");
        float maths= str.nextInt();
        System.out.println("Enter the marks for Physics");
        float phy= str.nextInt();
        System.out.println("Enter the marks for Chemistry");
        float chem = str.nextInt();
        System.out.println("Enter the marks for English");
        float eng = str.nextInt();
        System.out.println("Enter the marks for Biology");
        float bio = str.nextInt();
        System.out.println();
        System.out.println();
        System.out.println(name);
        System.out.println("Uploaded marks is ");
        System.out.println("Maths: " + maths + " Physics: " + phy +
                " Chemistry: " + chem + " English: " + eng +
                " Biology: " + bio);
        float percentage= ((maths+phy+chem+eng+bio)/500.0f)*100;
        System.out.println("Calculated percentage is " +percentage+ "%");

    }
}

