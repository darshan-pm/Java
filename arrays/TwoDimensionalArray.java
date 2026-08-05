public class TwoDimensionalArray {
    public static void main(String[] args) {
        int numbers[][] = { { 1, 3, 5, 9 }, { 4, 5, 8, 9 } };
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {

                System.out.println("numbers: [" + row + "][" + column + "]: " + numbers[row][column]);
            }

        }
    }
}
