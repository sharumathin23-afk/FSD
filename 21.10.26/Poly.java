package Day4;

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculator c = new Calculator();
     c.addition(10, 30);
	}

}
class Calculator{
	void addition(int a, int b){
		System.out.println("First Addition: "+(a+b));
	}
	void addition(int a, int b, int c){
		System.out.println("Second Addition: "+(a+b+c));
	}
}
