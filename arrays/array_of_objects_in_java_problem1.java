class Student {
    int rollno;
    String name;
    int marks;
}

public class array_of_objects_in_java_problem1 {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.rollno = 10;
        S1.name = "Darshan";
        S1.marks = 98;

        Student S2 = new Student();
        S2.rollno = 18;
        S2.name = "Dhanush";
        S2.marks = 80;

        Student S3 = new Student();
        S3.rollno = 14;
        S3.name = "Virat";
        S3.marks = 87;

        Student students[] = new Student[3];
        students[0] = S1;
        students[1] = S2;
        students[2] = S3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ":" + students[i].marks);
        }

    }

}
