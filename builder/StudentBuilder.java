package builder;

public class StudentBuilder {
    private String name;
    private int age;
    private String major;

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder major(String major) {
        this.major = major;
        return this;
    }

    public Student build() {
        return new Student(name, age, major);
    }
}
