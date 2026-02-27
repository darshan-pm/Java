public class nested_loop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            System.out.println("outer loop : " + i);
            int j = 0;
            while (j <= 4) {
                System.out.println("inner loop:" + j);
                j++;
            }
            i++;
        }
    }

}
