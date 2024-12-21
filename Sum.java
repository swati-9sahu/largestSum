import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
         
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter third number:");
        int num3 = sc.nextInt();

        int largest = Math.max(num1, Math.max(num2, num3));

        int sum = largest;

        System.out.println("The largest number is:" + largest);
        System.out.println("The sum of the largest number is:" + sum);

        sc.close();
    }
}