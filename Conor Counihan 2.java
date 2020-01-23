//Assessment2.java*/
/*The purpose of this program is to display bank details
 *for customers. They can make a withdrawal or a lodgement
 *using this program.*/
 
 import java.util.Scanner;{
 	
public class Assessment2;{
  public static void main(String args[]);
    
 Scanner input = new Scanner(System.in);
   System.out.print("Please enter your PIN");
  
  if PIN incorrect("\n\nYou have entered an invalid PIN, exiting system now.....");
  else PIN correct ("\n\n\t\t\t***************Welcome to the ATM system***************\n\n");  
    
  int withdrawal, lodgement, balance;
  String exit;
  
  System.out.print("A. Make a withdrawal");
  System.out.print("B. Make a lodgement"); 
  System.out.print("C. Display balance on screen");
  System.out.print("D. Exit the system"); 
   	
  System.out.print("Please enter your choice");
   	withdrawal = nextint;
  
  System.out.print("Please enter the amount you wish to withdraw"); 
  if withdrawal > balance System.out.print("You are attempting to withdraw more than your current balance! Exiting system now....."); 		
  else withdrawal < balance System.out.print("You have made a succesful withdrawal. Your new balance is EUR154.33"); 		
  
  System.out.print("Please enter your choice");	
  	lodgement = nextint;
  		
  System.out.print("Please enter the amount you wish to lodge"); 
  if lodge > EUR5000 System.out.print("You are attempting to lodge more than EUR5000! Exiting system now.....");
  else lodge < EUR5000 System.out.print("You have made a succesful lodgement. Your new balance is EUR3598.56");
  
  System.out.print("Please enter your choice");
   	balance = nextint;
   	
  System.out.print("Your current balance is EUR1000.00");   	
  
  System.out.print("Please enter your choice");
     exit = nextString;
     
  System.out.print("Thank you for using the ATM ..... goodbye");     	
    }   
 }
    