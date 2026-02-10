import java.util.Scanner;

public class Fibonacci3 {

    public static void main(String[] args) {

        int n, i = 1, a = 0, b = 1, next;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of terms in positive integer: ");
        n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        // print first two numbers
        System.out.print(a + " " + b + " ");

        do {
            next = a + b;
            System.out.print(next + " ");

            a = b;
            b = next;

            i++;
        } while (i < n - 1);

        sc.close();
    }
}