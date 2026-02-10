import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {

        int n, i = 2, a = 0, b = 1, next;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of terms in positive integer: ");
        n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        while (i < n) {
            next = a + b;
            System.out.print(next + " ");

            a = b;
            b = next;
            i++;
        }

        sc.close();
    }
}