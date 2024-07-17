package demo;



public class main {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Duy");
        Student s3 = new Student(333, "Ky");
        s1.change();
        s2.change();
        s3.change();
        s1.display();
        s2.display();
        s3.display();

    }
}
