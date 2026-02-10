import java.lang.System;
import java.util.Scanner;

class user_input_int{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println("The value of a is:"+a);
    }
}

class user_input_string{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println("The name is: "+name);
    }
}
class user_input_float{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float f = scn.nextFloat();
        System.out.println("The value of f is: "+f);
    }
}

class user_input_floatsum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter value for a: ");
         float a = scn.nextFloat();
        System.out.print("enter value for b: ");
        float b = scn.nextFloat();
        float sum = a + b;
        System.out.println("Sum of a and b is: "+sum);
    }
}

class user_input_doublesum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter value for a: ");
        double a = scn.nextDouble();
        System.out.print("enter value for b: ");
        double b = scn.nextDouble();
        double sum = a + b;
        System.out.println("Sum of a and b is: "+sum);
    }
}