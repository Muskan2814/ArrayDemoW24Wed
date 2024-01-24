/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

import java.util.Scanner;

/**
 *Commenting for modification on jan 17 at 9:48 AM
 * @author Muskan
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("Enter a word");
        System.out.println("Hii there!");
        Scanner input =new Scanner(System.in);
        
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        
        for (int i =0;i<myLetters.length;i++){
        myLetters [i] = myWord.charAt(i);
        }// end of for
        
        System.out.println("Printing in reverse");
        
        for (int i=myLetters.length-1;i>=0;i--){
            System.out.println(myLetters[i]);
        }// end of for
        
    }// end of main
     
}// end of class
