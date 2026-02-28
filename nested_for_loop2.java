public class nested_for_loop2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Month" + i);
            for (int j = 1; j <= 30; j++) {
                System.out.println("   " + (j + 1) + " - " + (j + 2));
            }
        }
    }

}
