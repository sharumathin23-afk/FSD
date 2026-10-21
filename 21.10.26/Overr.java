package Day4;

public class Overr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Class3 c3 = new Class3();
     c3.display(2);
     c3.display(35.2);
     c3.display("Hi");
	}

}
class Class1{
	void display(int a){
		System.out.println("From Class 1 : "+a);
	}
}
class Class2 extends Class1{
	void display(double a){
		System.out.println("From Class 2: "+a);
	}
}
class Class3 extends Class2{
	void display(String str){
		System.out.println("From Class 3: "+str);
	}
}