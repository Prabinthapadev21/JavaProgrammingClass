// 12.	Write a Java program to calculate the factorial of a number using a while loop. 
package ProgramSet2;
import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Positive Number : ");
        int num = sc.nextInt();
        Factorial cf = new Factorial();
        cf.CheckFactorial(num);
        sc.close();
    }
    public void CheckFactorial(int num){
        if(num<0){
            System.out.println("Not an Poitive Integer");
            return;
        }
        int i = 1;
        int fact = 1;
        while (i<=num) {
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial is " + fact);
        
    }

}