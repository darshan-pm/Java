class Human {
    private int age;
    private String name;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Darshan");
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}