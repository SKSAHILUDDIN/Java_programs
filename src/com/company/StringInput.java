package com.company;

import java.util.Scanner;

public class StringInput {
   public static void main(String[] args) {
      // System.out.printf("Hey give me a string: ");
       //Scanner sc = new Scanner(System.in);
       //String str = sc.nextLine();
       String str = " Saahil ";
       System.out.println("You entered: " + str);
       System.out.println("String length is : "+str.length());
       System.out.println("Transforming to lowewrcase :" + str.toLowerCase());
       System.out.println("Transforming to lowewrcase :" + str.toUpperCase());
       System.out.println("Trimming the given input  : " +str.trim());
       System.out.println("Substring using the starting index integer is : " +str.substring(2));// the +str.substring(2 is starting point  and end where the substring ends)
       System.out.println("Substring using the starting and ending  index integer is : " +str.substring(4,7));// the +str.substring(2 is starting point  and 3 is end here)
       System.out.println("Replacing the letter : " + str.replace('a','O'));
       System.out.println("Is the name starts with Sa? : " +str.startsWith(" Sa"));
       System.out.println("Is the name ends with ho? : " +str.endsWith("ho"));
       System.out.println("The character at 2 nd index is : " + str.charAt(2));
       System.out.println("The index of the character in the string is :" +str.indexOf("S"));
       System.out.println("The index of the character in the string is :" +str.indexOf("S",0)); //str.indexOf("String" , start searching from index no "0")
       System.out.println("The last index of the given String character 'a' is :  " +str.lastIndexOf("a",5)); //it searches the character occurence from the given index to backwards
       System.out.println("Is the given string same as 'Sahil' ? : " +str.equals("Sahil"));
       System.out.println("Is the given string same as ' Saahil ' ? : " +str.equalsIgnoreCase(" SAAHIL "));



   }
}
