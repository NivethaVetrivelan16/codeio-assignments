/* Problem 2:
Create a Student class with attributes name, roll number, marks, 
and a method to display details of each student */

class Student {
    String name;
    int rollNumber;
    double marks;
    Student(String n, int r, double m) {
        name = n;
        rollNumber = r;
        marks = m;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Marks: " + marks);
    }
}
public class Prob2_Student {
    public static void main(String[] args) {
        Student s1 = new Student("Nivetha Vetrivelan", 1, 86.5);
        Student s2 = new Student("Vinitha Kannan", 2, 87.0);
        Student s3 = new Student("Ragavi Sakkarai", 3, 83.5);
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
