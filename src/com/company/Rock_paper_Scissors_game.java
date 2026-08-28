package com.company;
import org.w3c.dom.ls.LSInput;

import javax.swing.*;
import java.lang.classfile.PseudoInstruction;
import java.util.Scanner;
import java.util.Random;
public class Rock_paper_Scissors_game {
    static void Computer() {
        Random random = new Random();
        int randomIntBounded = random.nextInt(0,3);
        if (randomIntBounded== 0){
            System.out.println("Rock");}
        else if  (randomIntBounded== 1){
            System.out.println("Paper");}
        else if (randomIntBounded== 2){
            System.out.println("Scissor");}

    }
    public static void main(String[] args){

        System.out.println("**---------- Welcome to Rock paper Scissor game----------** ");
        System.out.println("**---------- We have 5 rounds of the game----------**  \n ----------Lets start----------");

        Scanner sc = new Scanner(System.in);
        Computer();

        Random random = new Random();
        int randomIntBounded = random.nextInt(0,3);
        if (randomIntBounded== 0){
            System.out.println("Rock");}
        else if  (randomIntBounded== 1){
            System.out.println("Paper");}
        else if (randomIntBounded== 2){
            System.out.println("Scissor");}
        for (int i=0;i<5;i++){
            String r = "rock" , p = "Paper", s = "Scissor" ;
            System.out.println("r = rock , p = Paper, s = Scissor \n Enter your choice: ");
            String ch = sc.nextLine();
            if(ch==r && randomIntBounded==p)
        }
















    }
}
