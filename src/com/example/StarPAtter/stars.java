package com.example.StarPAtter;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Program to create a custom square with a star pattern */
public class stars {
    public static void main(String[] arg) {
        int squareSize = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer value for a square star pattern: ");
        try {
            squareSize = input.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("You did not enter an integer value, the code will exit!");
        }
        //First for loop is for the columns
        for (int i=0; i < squareSize; i++) {
            // this for loop is for the rows
            for(int j=0;j<squareSize;j++){
                /* the if statement is to satisfy the star pattern. if you look
                   at the star going down and to the right i and j are equal
                   1 and 1, 2 and 2 , 3 and 3 etc.
                   for the star pattern going down and to the left it is the sum
                   of i and j which since we want a fixed length of a 10x10 square
                   i+j=9, if you wanted to allow the user to create a custom size square box
                   you can create a variable to store the value.
                   set each for loops to less than the size that the user defined
                   and for the if statement i + j is equal to the squareSize-1
                 */
                if(i==j || i+j== squareSize-1)
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println(" ");
        }
    }
}
