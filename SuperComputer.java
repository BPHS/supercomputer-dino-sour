// Author: Christopher and Robert
// Date: Holloween, 2016
// Description: making a program to create a supercomputer

import java.util.Scanner;

public class SuperComputer {
    
    public static void main(String [] args) {
        
        Scanner key = new Scanner(System.in);
        
        System.out.println ("Welcome to our SuperComputer program!");
    
        System.out.println("");
        
        System.out.println("1. Count from 1 to 10000");
        System.out.println("2. Count from 1 to 10000 by 5's");
        System.out.println("3. Count down from 100 to 0 by 1");
        System.out.println("4. Count from 1000 to 10000 by 10's");
       
        System.out.println("");
        
        System.out.print("To test the performance of this SuperComputer please select from the choices above: ");
        String choice = key.nextLine();
        
        if (choice.equals("1")) {
         for (int i = 0; i <= 10000; i++) {
            System.out.print(i + " ");
        }
        System.out.println();   
        
            
      } else if (choice.equals("2")) { 
        for (int i = 0; i <= 10000; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();
        
      } else if (choice.equals("3")) {
          for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");
        }   
        System.out.println();
            
      } else if (choice.equals("4")) {
          for (int i = 100000; i <= 10000; i += 10) {
             System.out.print(i + " ");
          }
      }
      
          
      }
    } 
    
