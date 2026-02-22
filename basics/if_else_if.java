public class if_else_if {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 9;
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else
            System.out.println(c);

    }
}
