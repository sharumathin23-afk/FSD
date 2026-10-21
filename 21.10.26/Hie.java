package Day4;

public class Hie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son1 s = new Son1();
		s.oldCycle();
        s.bike();

	}

}
class Dad{
	int sbi = 10000;
	void bike(){
		System.out.println("Bike from Father");
	}
	void Car(){
		System.out.println("Car from Father");
	}
}
class Son1 extends Dad{
	int hdfc = 100;
	void oldCycle(){
		System.out.println("Cycle from Son1");
	}
}
class Son2 extends Dad{
	int hdfc = 100;
	void newCycle(){
		System.out.println("Cycle from Son2");
	}
}
