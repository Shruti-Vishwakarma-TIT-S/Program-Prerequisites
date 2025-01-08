// Area of Circle

//print the addition of numbers

import java.util.Scanner;
public class AreaOfCircle
{
public static void main(String[] args)
{
System.out.println("Enter Radius ");
 Scanner sc = new Scanner(System.in);
 double radius = sc.nextDouble();
double area = Math.PI * radius * radius;

System.out.print("Area of Circle would be: "+ area);
}
}