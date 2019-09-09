import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        int num1 = 0;
        int factorialMultiply = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive integer:  ");
        num1 = input.nextInt();

        for(int i = 1; i <= num1; i++) {

            factorialMultiply = factorialMultiply * i;

        }

        System.out.println();
        System.out.println();
        System.out.println("The factorial of " + num1 + " is " + factorialMultiply);
    }

}
