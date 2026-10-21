package Day4;

public class Inh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.Cycle();
        s.bike();

	}

}
class Father{
	int sbi = 10000;
	void bike(){
		System.out.println("Bike from Father");
	}
	void Car(){
		System.out.println("Car from Father");
	}
}
class Son extends Father{
	int hdfc = 100;
	void Cycle(){
		System.out.println("Cycle from Son");
	}
}
