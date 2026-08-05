public class multidimensional_array_example1 {
    public static void main() {
        int arr[][] = { { 2, 3, 4 },
                { 23, 34, 45 },
                { 34, 56, 32 },
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
