class Animal {
    String name;
    String sound;

    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }

}

public class InheritanceExample2 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.name = "Tommy";
        obj.sound = "woof";
        obj.eat();
        obj.bark();
        System.out.println(obj.name + " " + obj.sound);
    }
}