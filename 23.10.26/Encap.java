package Day6;

public class Encap {
	public static void main(String[] args) {
        HDFC obj = new HDFC();

        System.out.println(obj.getAcc_balance());
        System.out.println(obj.getAcc_holder_email());

        obj.setAcc_balance(1200000);
        obj.setAcc_holder_name("Mathi");

        System.out.println(obj.getAcc_balance());
        System.out.println(obj.getAcc_holder_name());
    }
}

	class HDFC {
	    private long acc_number = 70269863;
	    private long acc_balance = 1000000;
	    private String acc_holder_name = "Sharu";
	    private String acc_holder_email = "sharu123@gmail.com";

	    public long getAcc_number() {
	        return acc_number;
	    }

	    public long getAcc_balance() {
	        return acc_balance;
	    }

	    public String getAcc_holder_name() {
	        return acc_holder_name;
	    }

	    public String getAcc_holder_email() {
	        return acc_holder_email;
	    }

	    public void setAcc_balance(long balance) {
	        acc_balance = balance;
	    }

	    public void setAcc_holder_name(String name) {
	        acc_holder_name = name;
	    }
	}

	    
