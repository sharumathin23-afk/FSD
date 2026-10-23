package Day6;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SBI sb = new SBI();
     sb.educationLoan();
     sb.agriLoan();
	}

}
abstract class RBI{
	private final void deposit(){
		System.out.println("Deposit Method");
	}
	private final void withdrawal(){
		System.out.println("Withdrawal Method");
	}
	abstract void educationLoan();
	abstract void agriLoan();
}
class SBI extends RBI{
	void carLoan(){
		System.out.println("ROI - 11.25%");
	}
	void homeLoan(){
		System.out.println("ROI - 13.15%");
	}

	void educationLoan() {
		System.out.println("ROI - 9%");	
	}

	void agriLoan() {
		System.out.println("ROI - 10.11%");
	}
	
}
