package student1;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
        this.name = "john";
        this.classes = "C02";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
