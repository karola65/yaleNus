/*
 Program by BARGIEL KAROLINA ALEKSANDRA
 */
package com.mycompany.lab1;

import java.util.Scanner;


public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in); // Within my main class I use scanner to take user input. I declare Scanner named scanner
        System.out.println("How many numbers are you willing to enter?");// This message will be the first message that user will see.
        int lengthOfArray = scanner.nextInt();// By enetring an integer numer user will determine how many numbers are they willing to enter
        System.out.println("Amzing! You want to enter "+ lengthOfArray + " numbers. Now , please enter them");
        
        int[] userInput = new int[lengthOfArray]; // I use the number user entered to determine the length of my array.
        
        for(int i=0; i<lengthOfArray ; i++)// This loop let the user enter (pre-declered) n numbers that will be taken into calculations
        {
           userInput[i] = scanner.nextInt();
        }
         max(userInput);// this function calulates the maximum value
         min(userInput);// this function caluclates the minimum value
        avrage(userInput);// this function calculates avrage value
        
        System.exit(0);// end of a program
        
       
    }
    public static void max(int [] array)
    {
      // I calculate maximum value by initalazing an intiger maxValue to the value of the first variable in my array. After that I loop through the whole length of the array and if I find an intiger which is greater than my maxValue, I change the value stored in maxValue to new one. 
         int maxValue = array[0]; 
    for(int i=1;i < array.length;i++)
    { 
      if(array[i] > maxValue){ 
         maxValue = array[i]; 
      }
    }
    System.out.println("Max value of your numbers:" +maxValue);
        
      
    }
     public static void min(int [] array)
    {
      // I calculate the minimum value using the same method as maximum value. I change the value of minValue if and only if the value of array[i] is smaller.
         int minValue = array[0]; 
    for(int i=1;i < array.length;i++)
    { 
      if(array[i] < minValue){ 
         minValue = array[i]; 
      }
    }
    System.out.println("Min value of your numbers: " + minValue);
        
      
    }
    public static void avrage (int [] array)
    {
       //to calculate the avrage I use an additional varable "sum" which will store the sum of all the values of my array. After that I declere the varable avrege type float and initalize it to the value of sum devided by the length of my array.
        int sum = 0; 
        for( int i=0; i<array.length; i++)
        {
            sum= sum + array[i];
           
        }
        float avrage = (float)sum/array.length;
        
        System.out.println("Avrege of your numbers: " + avrage);
        
    }
    
}
