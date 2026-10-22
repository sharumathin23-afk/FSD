package Day5;

public class SalaryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee p = new PermanentEmployee();
	    p.basicSalary = 25000;
	    System.out.println("Permanent Salary: " + p.calculateSalary());

	    ContractEmployee c = new ContractEmployee();
	    c.basicSalary = 20000;
	    System.out.println("Contract Salary: " + c.calculateSalary());

	}

}
class Employee{
	int employeeId;
	String name;
	double basicSalary;
	double calculateSalary() {
        return basicSalary;
    }
}
class PermanentEmployee extends Employee{
  double calculateSalary(){
	  return basicSalary + (basicSalary * 20 / 100);  
  }
	
}
class ContractEmployee extends Employee{
	double calculateSalary(){
		return basicSalary + 2000;
	  }
}