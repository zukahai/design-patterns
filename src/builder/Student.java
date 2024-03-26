package builder;

public class Student {
    private String name;
    private int age;
    private String major;

    // Constructor
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // toString
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", major=" + major + "]";
    }
}