package beans;

public class Student {

    static {
        System.out.println("Student bean class loading...");
    }
    public Student() {
        System.out.println("Student bean class instantiating using Zero-arg constructor...");
    }

    public Student(int id, String name, int mark) {
        System.out.println("Student bean class instantiating using parameterized constructor...");
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    private int id;
    private String name;
    private int mark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("%-10s: %d\n%-10s: %s\n%-10s: %d\n", "Reg No", this.getId(), "Name", this.getName(), "Mark", this.getMark());
    }
}
