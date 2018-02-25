package calculations;

//calculations

import java.util.Scanner;

public class Calculator
{
public static void main (String[] args)
{
int number1=0;
int number2=0;
int sum=0;
int difference=0;
int product=0;
int quotient=0;
Scanner input = new Scanner (System.in);

System.out.print ("Enter first integer:");
number1 = input.nextInt();

System.out.print ("Enter second integer:");
number2 = input.nextInt ();

sum = number1 + number2;
difference = number1 - number2;
product = number1 *number2;
quotient = number1 / number2;

System.out.print ("The total is: ");
System.out.print (sum);

System.out.print ("\nThe difference is: ");
System.out.print (difference);

System.out.print ("\nThe product is: ");
System.out.print (product);

System.out.print ("\nThe quotient is: ");
System.out.print (quotient);

}//end of class Calculator1
}//end of main method