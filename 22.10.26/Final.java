package Day5;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Child s = new Child();
     s.bike();
     // s.asset(); it cannot be accessed because of final keyword
     Parent p = new Parent();
     p.asset(); //the parent final method can be accessed by only the parent class obj
     //p.Golds(); if it is private final the parent class obj also can't access it
	}

}
class Parent{
	void bike(){
		System.out.println("Father owns bike");
	}
	 final void asset(){
		System.out.println("Father owns 1.5 acre land");
	}
	 private final void Golds(){
			System.out.println("Father owns 100g gold");
		}
}
class Child extends Parent{
	void cycle(){
		System.out.println("Son owns cycle");
	}
}