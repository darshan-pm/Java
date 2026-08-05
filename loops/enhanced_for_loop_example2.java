class Student {
    int rollno;
    String name;
    int marks;
}

public class enhanced_for_loop_example2 {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.rollno = 1;
        S1.name = "Darshan";
        S1.marks = 97;

        Student S2 = new Student();
        S2.rollno = 2;
        S2.name = "Darshan";
        S2.marks = 78;

        Student S3 = new Student();
        S3.rollno = 3;
        S3.name = "Sharath";
        S3.marks = 87;

        Student Students[] = new Student[3];
        Students[0] = S1;
        Students[1] = S2;
        Students[2] = S3;

        for (Student Stud : Students) {
            System.out.println(Stud.name + " : " + Stud.marks);
        }

    }

}
