//to convert Celsius to fahrenheit 

import java.util.Scanner;
public class Conversion
{
public static void main(String[] args)
{
System.out.println("Enter temperature in Celsius ");
 Scanner sc = new Scanner(System.in);
 double celsius = sc.nextDouble();
double fahrenheit = (celsius * (9.0/5.0))+32;

System.out.print("Fahrenheit tempearture will be: "+ fahrenheit + "F");
}
}