package Day12Collections;


import java.util.*;

public class EmployeeSalaryManagement {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        HashMap<Integer, String> departments = new HashMap<>();

        departments.put(1, "HR");
        departments.put(2, "IT");
        departments.put(3, "Finance");

        employees.add(new Employee(101, "Arun", "IT", 45000));
        employees.add(new Employee(102, "Bala", "HR", 35000));
        employees.add(new Employee(103, "Charan", "Finance", 50000));
        employees.add(new Employee(104, "Divya", "IT", 60000));
        employees.add(new Employee(105, "Priya", "HR", 40000));

        System.out.println("ALL EMPLOYEE DETAILS");

        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();
            e.display();
        }
        int searchId = 103;
        boolean found = false;

        System.out.println("\nSEARCH EMPLOYEE");

        for (Employee e : employees) {
            if (e.id == searchId) {
                e.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }
        int removeId = 105;

        Iterator<Employee> itr2 = employees.iterator();

        while (itr2.hasNext()) {
            Employee e = itr2.next();

            if (e.id == removeId) {
                System.out.println("\nDELETED EMPLOYEE");
                e.display();
                itr2.remove();
                break;
            }
        }
        System.out.println("\nDEPARTMENT DETAILS");

        for (Integer id : departments.keySet()) {
            System.out.println(id + " - " + departments.get(id));
        }
        System.out.println("\nDEPARTMENT-WISE EMPLOYEES");

        for (String dept : departments.values()) {

            System.out.println("\nDepartment: " + dept);

            for (Employee e : employees) {
                if (e.department.equals(dept)) {
                    System.out.println(e.id + " " + e.name + " " + e.salary);
                }
            }
        }
        Collections.sort(employees, new Comparator<Employee>() {

            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        });

        System.out.println("\nEMPLOYEES SORTED BY SALARY");

        for (Employee e : employees) {
            e.display();
        }
        Employee highest = employees.get(employees.size() - 1);

        System.out.println("\nHIGHEST PAID EMPLOYEE");
        highest.display();
    }
}

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------");
    }
}


