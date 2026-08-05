public class String_example4 {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder(" Java");
        name.append(" is");
        name.append(" awesome");

        System.out.println(name);
        name.reverse();
        System.out.println(name);

    }

}
