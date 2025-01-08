// to calculate power 

import java.util.Scanner;
public class Power
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers as base and exponent: ");
double base = sc.nextDouble();
double exponent = sc.nextDouble();

double power = Math.pow(base, exponent);
System.out.println("Power: "+ power);
}
}
