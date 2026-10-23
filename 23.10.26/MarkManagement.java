package Day6;

public class MarkManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();

	        System.out.println("Student ID: " + s.getstudentId());
	        System.out.println("Student Name: " + s.getstudentName());
	        System.out.println("Marks: " + s.getmarks());

	        s.setmarks(120);
	        s.setstudentName("Mathi");
	        System.out.println("Student Name: " + s.getstudentName());

	}

}
class Student{
	private int studentId=250201;
	private String studentName="Sharu";
	private int marks=70;
	public int getstudentId() {
        return studentId;
    }

	public String getstudentName() {
        return studentName;
    }

	public int getmarks() {
        return marks;
    }
	public void setstudentId(int id) {
	    studentId = id;
	}

	public void setstudentName(String name) {
	    studentName = name;
	}

	public void setmarks(int m) {
	    if (m >= 0 && m <= 100) {
	        marks = m;
	    } else {
	        System.out.println("Invalid marks!");
	    }
	}
}
