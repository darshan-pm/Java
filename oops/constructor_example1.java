class Human {
    private int Age;
    private String Name;

    public Human() {
        Age = 20;
        Name = "Darshan";
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}

public class constructor_example1 {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}