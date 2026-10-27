package edu.zuj.oop.week2.lecture2;

import java.util.Scanner;


public class O1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.print(" Enter num 1 : ");
         int num1 = s.nextInt();

         System.out.print(" Enter num 2 : ");
         int num2 = s.nextInt();

         System.out.println(" Enter your choice : ");
         System.out.println("=================");
         System.out.println(" 1-Add ");
         System.out.println(" 2-Sub ");
         System.out.println(" 3-Mul ");
         System.out.println(" 4-Div ");
         System.out.println(" 5-Quit ");
         System.out.println("=================");

         int ch = s.nextInt();
         int result = 0 ;

         switch (ch) {
            case 1 : result = num1 + num2 ; break;
            case 2 : result = num1 - num2 ; break;
            case 3 : result = num1 * num2 ; break;
            case 4 : result = num1 / num2 ; break;
            case 5 : System.out.println(" Good bay "); break;
            case 5 : System.out.println(" Good bye "); break;
            default: System.out.println(" Invalid choice "); break;}


         if ( ch > 0 && ch<=4 ){
         System.out.println("Result = " + result);}
 }
}
