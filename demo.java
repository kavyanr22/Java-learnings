import java.util.Scanner;
class demo{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter value of a: ");
        int a = scn.nextInt();
         System.out.println("enter value of b ");
        int b= scn.nextInt();
        if(a > b)
        {
            System.out.println(a+ "is largest");
            }
            else{
            System.out.println(b+ "is largest");
        }
    }
}