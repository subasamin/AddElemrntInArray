package demo;

public class Student {
    private int rollo;
    private String name;
    private static String college;

    public Student(int r, String n){
        rollo = r;
        name = n;
    }
    public void change(){
        college = "Codegym";
    }
    public void display(){
        System.out.println(rollo + name + college);
    }
}
