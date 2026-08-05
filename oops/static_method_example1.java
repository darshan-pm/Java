class Student {
    String name;
    int age;

    static void college() {
        System.out.println("Jain University");
    }

    public void show() {
        System.out.println(name + " :" + age + " :");
    }

}

public class static_method_example1 {
    public static void main(String[] args) {
        Student.college();

        Student obj = new Student();
        obj.name = "Darshan";
        obj.age = 20;

        obj.show();

    }
}
