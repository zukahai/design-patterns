# Prototype Pattern

## Giới thiệu

Prototype Pattern là một mẫu thiết kế thuộc nhóm Creational Patterns. Mẫu thiết kế này cho phép chúng ta tạo ra các đối tượng mới bằng cách sao chép các đối tượng đã tồn tại, thay vì tạo ra các đối tượng mới từ đầu.

## Ví dụ

Trong ví dụ này, chúng ta sẽ tạo ra một ứng dụng quản lý hồ sơ nhân viên. Mỗi nhân viên có các thuộc tính như tên, tuổi và phòng ban. Chúng ta sẽ sử dụng Prototype Pattern để tạo ra các bản sao của đối tượng nhân viên mà không cần tạo ra các đối tượng mới từ đầu.

Chúng ta sẽ tạo ra một lớp `Employee` với các thuộc tính và phương thức cần thiết.

Dưới đây là một đoạn mã minh họa:

Bạn có thể dùng interdacr **Cloneable** của java:

```java
public class Employee implements Cloneable {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getters and setters

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}

```

Hoặc tự viết thuần

```java
public class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Employee(Employee employee) {
        this.name = employee.name;
        this.age = employee.age;
        this.department = employee.department;
    }

    public Employee clone() {
        return new Employee(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, "IT");
        Employee employeeClone = employee.clone();
        System.out.println(employeeClone); // Employee{name='John', age=30, department='IT'}

        employee.setAge(50);
        System.out.println(employee); // Employee{name='John', age=50, department='IT'}
        System.out.println(employeeClone); // Employee{name='John', age=30, department='IT'}
    }
}
```