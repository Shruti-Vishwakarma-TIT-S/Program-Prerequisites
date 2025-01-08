//print the addition of numbers

import java.util.Scanner;
public class Addition
{
public static void main(String[] args)
{
System.out.println("Enter two nos: ");
 Scanner sc = new Scanner(System.in);
 double a = sc.nextDouble();
double b = sc.nextDouble();
double add = a+b;
System.out.print("Addition of two numbers: "+ add);
}
}