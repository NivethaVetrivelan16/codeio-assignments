/* Problem 5:
Create an Employee class with private variables name, id, and salary. 
Provide getter and setter methods to access and update details */

class Employee {
    private String name;
    private int id;
    private double salary;
    // Setters
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setSalary(double salary) { this.salary = salary; }
    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }
}
public class Prob5_Employee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Nivetha  Vetrivelan");
        e.setId(1608);
        e.setSalary(55000.0);
        System.out.println("Employee Details:");
        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getId());
        System.out.println("Salary: " + e.getSalary());
    }
}
