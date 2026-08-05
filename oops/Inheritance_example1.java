class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

}

class AdvaCalc extends Calc {
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }
}

public class Inheritance_example1 {
    public static void main(String[] args) {
        AdvaCalc obj = new AdvaCalc();
        int result1 = obj.add(9, 3);
        int result2 = obj.sub(9, 3);
        int result3 = obj.multiply(10, 9);
        System.out.println(result1 + " " + result2 + " " + result3);
    }
}