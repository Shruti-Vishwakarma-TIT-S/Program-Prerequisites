// to convert kilometers to miles

import java.util.Scanner;
public class Miles
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Kilometeric Unit: ");
double kilometers = sc.nextDouble();

double miles = kilometers * 0.621371;
System.out.println("Kilometers to miles "+ miles);
}
}