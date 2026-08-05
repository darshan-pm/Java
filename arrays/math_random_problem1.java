class math_random_problem1 {
    public static void main(String[] args) {

        int num[][] = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = (int) (Math.random() * 100);

            }
        }
        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");

            }
            System.out.println();
        }
    }
}
