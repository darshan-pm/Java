class Human {
    private int Age;
    private String Name;

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

public class this_keyword {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Darshan");
        System.out.println(obj.getName() + ":" + obj.getAge());

    }
}