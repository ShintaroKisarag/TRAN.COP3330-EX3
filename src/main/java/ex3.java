/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the quote? ");
        String quote = input.nextLine();    //stores quote
        System.out.println("Enter the author of the quote:");
        String author = input.nextLine();   //answers author
        System.out.println(author + " says, " + quote);
    }
}
