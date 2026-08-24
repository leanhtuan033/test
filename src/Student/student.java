package Student;

public class student {
    private String name = "Tuan";
    private String classes = "JV105";

    public student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + classes);
    }

}
