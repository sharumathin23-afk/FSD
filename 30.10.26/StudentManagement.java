package Day12Collections;


import java.util.*;

public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> ids = new HashSet<>();

        addStudent(students, ids, new Student(101, "Arun", "BCA", 85));
        addStudent(students, ids, new Student(102, "Bala", "BBA", 90));
        addStudent(students, ids, new Student(103, "Kavin", "BCA", 78));
        addStudent(students, ids, new Student(104, "Divya", "BSc", 95));
        addStudent(students, ids, new Student(105, "Ravi", "BCom", 88));

        System.out.println("Student Details:");
        Iterator<Student> itr = students.iterator();

        while (itr.hasNext()) {
            itr.next().display();
        }

        System.out.println("\nDuplicate Registration:");
        addStudent(students, ids, new Student(101, "Ram", "BCA", 80));

        int searchId = 103;
        boolean found = false;

        System.out.println("\nSearch Result:");

        for (Student s : students) {
            if (s.id == searchId) {
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }

        int deleteId = 102;

        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            Student s = it.next();

            if (s.id == deleteId) {
                it.remove();
                ids.remove(deleteId);
                System.out.println("\nStudent " + deleteId + " deleted");
                break;
            }
        }

        System.out.println("\nAfter Deletion:");

        for (Student s : students) {
            s.display();
        }

        Student topper = Collections.max(students,
            Comparator.comparingInt(s -> s.marks));

        System.out.println("\nTopper Details:");
        topper.display();
    }

    static void addStudent(ArrayList<Student> students,
                           HashSet<Integer> ids, Student s) {

        if (ids.contains(s.id)) {
            System.out.println("Duplicate Student ID: " + s.id);
        } else {
            students.add(s);
            ids.add(s.id);
            System.out.println("Student added: " + s.name);
        }
    }
}

class Student {
    int id;
    String name;
    String department;
    int marks;

    Student(int id, String name, String department, int marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + department + " " + marks);
    }
}



