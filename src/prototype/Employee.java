package prototype;

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