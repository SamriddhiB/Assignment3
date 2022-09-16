/*Develop a Program that illustrate method overriding concept.
 */

class A
{
public void Display()
{
System.out.println("Hello");
}
}
class B extends A{
public void Display()
{
System.out.println("Hi");
}
}
public class Prac3_4 {
public static void main(String[] args) {
A a= new A();
A b =new B();
a.Display();
b.Display();
}
}