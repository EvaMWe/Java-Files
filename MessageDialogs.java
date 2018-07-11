/*
 * This is a simple example for using JOpitonPane
 * Functionality of the code is quite similar to StringToCode, but here the user is asked
 * for the score by message dialogs
 */
package exercises2;

import javax.swing.*;



public class MessageDialogs {
    public static void main (String[] args){
        
       int question = JOptionPane.showConfirmDialog(null, "Do you want to calculate a score?");
                    
        String input;
        if (question == 0){
            input = JOptionPane.showInputDialog(null, "Put in your scores");
            


        }
        else {
            input = "okay maybe next time!";
             System.out.println(input);
            return;
                        }      
           
      
       //read string and split it to an array with String class method split       
       String [] val = input.split(" ");
       
       //initialize an integer array
       int[] score = new int [val.length];
       
       // fill score with val by converting string data to integer data type
       
       int total = 0;
       for(int i=0; i<val.length; i++){
           score [i] = Integer.parseInt(val[i]);
           total +=  score[i];
       }
       
       int scoreAvg = total/score.length;
       
       for(int i=0; i<val.length; i++){
           if (score[i] < scoreAvg){
               System.out.println (score[i] + " is less than " + scoreAvg);
               
           }
       }
    }   
}
