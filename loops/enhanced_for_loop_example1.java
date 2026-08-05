class enhanced_for_loop_example1 {
    public static void main(String[] args) {
        int num[][] = { { 1, 2, 3 },
                { 4, 3, 1 },
                { 8, 9, 7 } };
        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();

        }
    }
}
