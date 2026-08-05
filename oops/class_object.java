class Calculator {
    int num1;

    public int add(int num1, int num2) {
        int r = num1 + num2;
        return r;

    }
}

public class class_object {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);

    }
}
