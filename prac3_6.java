/*Write a program that demonstrates use of packages & import statements.

*/
import java.util.Scanner;
import java.lang.Math;
public class prac3_6 {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.println("Enter base and exponent:2");
int a=s.nextInt();
int b=s.nextInt();
System.out.println("Value: "+ Math.pow(a, b));
}
}