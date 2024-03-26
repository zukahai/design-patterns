package builder;

public class Test {
    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .name("HaiZuka")
                .major("Computer Science")
                .age(24)
                .build();

        System.out.println(student);

        // Output: Student [name=HaiZuka, age=24, major=Computer Science]

        Student student2 = new StudentBuilder()
                .name("Linh")
                .age(24)
                .build();
        System.out.println(student2);

        // Output: Student [name=Linh, age=24, major=null]

        Student student3 = new StudentBuilder()
                .build();

        System.out.println(student3);
        // Output: Student [name=null, age=0, major=null]
    }
}
