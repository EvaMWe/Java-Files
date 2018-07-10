/*
 * This is a little example to remember the commands
 * ***.split() to split a string 
 * Integer.parseInt() for converting datatype to integers
 */
package exercises2;



public class StringToInt {
    public static void main (String[] args){
        
       String input = "54 78 90 50";
       
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
