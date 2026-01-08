

import java.util.Scanner;

public class methods1 {
    
    public static void show(String name) {
        System.out.println("Hello " + name);
    }
    public static void sum(int a, int b) {
        System.out.println("Sum is: " + (a + b));
        System.out.println("Difference is: " + (a - b));
        System.out.println("Multiplication is: " + (a * b));
        System.out.println("Division is: " + (a / b));
    }
    public static void Factorial(int number) {
        int sum=1;
        for(int i=1;i<=number;i++) {
         sum=sum*i;
        }
        System.out.println("Factorial is: " + sum);
    }

    //method overloading - methods with same name, different parameters
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number:");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second number:");
        // int num2 = sc.nextInt();
        // sum(num1, num2);

        // System.out.println("Enter a number:");
        // int number = sc.nextInt();
        // Factorial(number);
        
        // show1();
        
        // String name = sc.nextLine();
        // show(name);
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));

    }
    public static void show1() {
        System.out.println("Hello from show1 method");
    }
}
