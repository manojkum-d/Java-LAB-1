import java.util.ArrayList;

class Student {
    private String name;
    private int id;
    private int age;
    private ArrayList<String> courses;

    // Default Constructor
    public Student() {
        name = "Chris alister";
        id = 0;
        age = 18;
        courses = new ArrayList<>();
    }

    // Parameterized Constructor 
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        courses = new ArrayList<>();
    }

    // Parameterized Constructor 
    public Student(String name, int id, int age, ArrayList<String> courses) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.courses = courses;
    }

    // Constructor Overloading 
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        age = 18;
        courses = new ArrayList<>();
    }

    // Constructor Overloading 
    public Student(String name, int id, int age, String course) {
        this.name = name;
        this.id = id;
        this.age = age;
        courses = new ArrayList<>();
        courses.add(course);
    }

    // Constructor Overloading 
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        age = 18;
        courses = new ArrayList<>();
    }

    // Method Overloading
    public void addCourse(String courseName) {
        courses.add(courseName);
    }

    public void addCourse(String courseName, String instructor) {
        courses.add(courseName + " (Instructor: " + instructor + ")");
    }

    public void addCourse(String courseName, int credits) {
        courses.add(courseName + " (" + credits + " credits)");
    }

    public void addCourse(String courseName, String instructor, int credits) {
        courses.add(courseName + " (Instructor: " + instructor + ", " + credits + " credits)");
    }

    
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Courses:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
     
        Student student1 = new Student();
        Student student2 = new Student("Manoj Kumar d", 101, 20);

        ArrayList<String> courses = new ArrayList<>();
        courses.add("Python");
        courses.add("C");
        Student student3 = new Student("Manu", 202, 22, courses);

       
        Student student4 = new Student("Sneha Mandira r", 303);
        Student student5 = new Student("Raja", 404, 21, "Chemistry");
        Student student6 = new Student(505, "Balla");

        // Add courses to students using method overloading
        student1.addCourse("Cod");
        student1.addCourse("cloud computing", "Professor Cynthia");
        student2.addCourse("React", 4);
        student3.addCourse("Computer Science", "Professor Ramesh", 3);

        
        System.out.println("Student 1 Information:");
        student1.displayStudentInfo();

        System.out.println("\nStudent 2 Information:");
        student2.displayStudentInfo();

        System.out.println("\nStudent 3 Information:");
        student3.displayStudentInfo();

        System.out.println("\nStudent 4 Information:");
        student4.displayStudentInfo();

        System.out.println("\nStudent 5 Information:");
        student5.displayStudentInfo();

        System.out.println("\nStudent 6 Information:");
        student6.displayStudentInfo();
    }
}
