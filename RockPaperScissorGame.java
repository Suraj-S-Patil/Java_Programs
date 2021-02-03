import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

class RockPaperScissorGame{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        char array1[]={'r','p','s'};
        char random, char1;

        while(true){
            System.out.println("\n____________Rock Paper Scissor Game____________\n");
            System.out.print("Enter your move: \n('R'=Rock, 'P'=Paper, 'S'=Scissor or 'E'=Exit) : ");

            char1=scn.next().charAt(0);

            int idx=new Random().nextInt(array1.length);
            random=(char)array1[idx];

            //System.out.print(random);

            if(char1=='e' || char1=='E'){
                break;
            }
            else{
                System.out.printf("You = %c \nComputer = %c \n",char1,random);

                if(((char1=='r' || char1=='R') && random=='r') || ((char1=='p' || char1=='P') && random=='p') || ((char1=='s' || char1=='S') && random=='s'))
                    System.out.println("Draw!");
                
                else if((char1=='r' || char1=='R') && random=='p')
                    System.out.println("Aww! You lose.");

                else if(char1=='r' || char1=='R' && random=='s')
                    System.out.println("Wow! You won.");

                else if(char1=='p' || char1=='P' && random=='r')
                    System.out.println("Wow! You win.");

                else if(char1=='p' || char1=='P' && random=='s')
                    System.out.println("Aww! You lose.");

                else if(char1=='s' || char1=='S' && random=='r')
                    System.out.println("Aww! You lose.");

                else if(char1=='s' || char1=='S' && random=='p')
                    System.out.println("Wow! You won.");
                
            }
        }
    }
};