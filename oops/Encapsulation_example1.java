class Human {
    private int Age;

    private String Name;

    public int getAge() {
        return Age;
    }

    public void setAge(int a) {
        Age = a;
    }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }
}

public class Encapsulation_example1 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Darshan");

        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
