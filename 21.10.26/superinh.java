package Day4;

public class superinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d = new Daughter();
		d.bike();
        d.oldCycle();
	}

}
class Daddy{
	int sbi = 10000;
	void bike(){
		System.out.println("Bike from Father");
	}
	void Car(){
		System.out.println("Car from Father");
	}
}
class Daughter extends Daddy{
	int sbi = 100;
	void bike(){
		System.out.println("Bike from Daughter");
		super.bike();
	}
	void oldCycle(){
		System.out.println("Cycle from Daughter");
		System.out.println(super.sbi);
	}
}
