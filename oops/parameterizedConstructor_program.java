class Human {
    String Name;
    int Age;

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public Human(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

}

public class parameterizedConstructor_program {
    public static void main(String[] args) {
        Human obj = new Human("Darshan", 20);
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}