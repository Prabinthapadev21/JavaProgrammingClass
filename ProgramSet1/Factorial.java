import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();
        System.out.println("The factorial is "+factorial(n));
    }
        public void int factorial(int num)
            {
            if(num==0)
            {
                return 1;
            }
            else
            {
                return num* factorial(num-1);
            }
            
            }
}
