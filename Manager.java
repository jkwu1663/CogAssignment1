package Assignments;

public class Manager extends Employee {
    public Manager() {

    }

    public Manager(String name, int age, String department, int salary) {
        super(name,age,department,salary);

    }
    @Override
    void job() {
        System.out.println("Job: Manager");
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
