/*Write a program that illustrates the significance of interface default method.
 */

interface defaultMeth{
    abstract public void meth();
    default void defaultmeth()
    {
    System.out.println("Default method");
    }
    }
    class A implements defaultMeth{
    public void meth()
    {
    System.out.println("Abstract method");
    }
    }
    public class prac3_7 {
    public static void main(String[] args) {
    A a1= new A();
    a1.meth();
    a1.defaultmeth();
    }
    }