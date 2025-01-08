// to calculate simple interest

import java.util.Scanner;
public class SimpleInterest
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter details like principal, rate, time(in years): ");
double principal = sc.nextDouble();
double rate = sc.nextDouble();
double time = sc.nextDouble();
double SI = (principal * rate * time) / 100;
System.out.println("Simple Interest = "+ SI);
}
}
