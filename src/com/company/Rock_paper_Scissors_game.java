package com.company;
import java.util.Scanner;
import java.util.Random;
public class Rock_paper_Scissors_game {
    static int Computer() {
        Random random = new Random();
        int randomIntBounded = random.nextInt(0,3);
        return randomIntBounded;

    }
    public static void main(String[] args){

        System.out.println("**---------- Welcome to Rock paper Scissor game----------** ");
        System.out.println("**---------- We have 5 rounds of the game----------**  \n ----------Lets start----------");

        Scanner sc = new Scanner(System.in);
       /* int randomIntBounded = random.nextInt(0,3);
        if (randomIntBounded== 0){
            System.out.println("Rock");}
        else if  (randomIntBounded== 1){
            System.out.println("Paper");}
        else if (randomIntBounded== 2){
            System.out.println("Scissor");}*/
        System.out.println("rock= 0 , Paper = 1, Scissor = 2");
        int winningrateforcomputer=0;
        int winningrateforyou=0;
        for (int i=0;i<5;i++){
            System.out.println(" Enter your choice: ");
            int ch = sc.nextInt();
            System.out.println("Computer choice: "+ Computer());

            if((ch==0 && Computer()==0) ||(ch==1 && Computer()==1)||(ch==2 && Computer()==2)){
                System.out.println("Draw");
            }
            if((ch==0 && Computer()==1)||(ch==2 && Computer()==0)) {
                System.out.println("Computer wins");
                winningrateforcomputer++;
            }
            if((ch==0 && Computer()==2)||(ch==1 && Computer()==0)) {
                System.out.println("You win");
                winningrateforyou++;
            }

        }
        if(winningrateforcomputer>winningrateforyou) System.out.println("Computer won the game");
        else if(winningrateforcomputer<winningrateforyou) System.out.println("You won the game");
















    }
}
