/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers are you willing to enter?");
        int lengthOfArray = scanner.nextInt();
        System.out.println("Amzing! You want to enter "+ lengthOfArray + " numbers. Now , please enter them");
        
        int[] userInput = new int[lengthOfArray]; // I use
        
        for(int i=0; i<lengthOfArray ; i++)
        {
           userInput[i] = scanner.nextInt();
        }
         max(userInput);
         min(userInput);
        avrage(userInput);
        
        System.exit(0);
        
       
    }
    public static void max(int [] array)
    {
      
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
       
        int sum = 0; 
        for( int i=0; i<array.length; i++)
        {
            sum= sum + array[i];
           
        }
        float avrage = (float)sum/array.length;
        
        System.out.println("Avrege of your numbers: " + avrage);
        
    }
    
}
