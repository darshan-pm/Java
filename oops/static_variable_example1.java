class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }
}

public class static_variable_example1 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = " Apple";
        obj1.price = 1500;
        Mobile.name = " SmartPhone";

        obj1.name = "FoldablePhone";

        obj1.show();

    }

}
