class A {
    String Name;
    int Age;

    public A() {
        System.out.println("Object created");
    }

    public String getName() {
        return Name;
    }

    public void show() {
        System.out.println("inside java");
    }

}

class anonymousObject {
    public static void main(String[] args) {

        new A().show();

    }
}
