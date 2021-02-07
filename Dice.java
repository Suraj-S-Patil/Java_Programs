import java.util.Scanner;
import java.util.Random;

class Dice{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        // Program to perform a roll dice and displaying random number between 1 to 6.
        
        System.out.println("____________________Dice Rolling Application___________________\n\n");        
        int[] array1={1,2,3,4,5,6};
        int random;

        while(true){
            System.out.print("\nRoll dice / Exit : (r/e) ");
            char c=scn.next().charAt(0);

            if(c=='e' || c=='E'){
                break;
            }
            else{
                int idx=new Random().nextInt(array1.length);
                random=array1[idx];
                System.out.println("\n"+random);
            }
        }

        scn.close();
    }
}