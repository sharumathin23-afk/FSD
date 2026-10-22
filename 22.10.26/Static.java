package Day5;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Whatsapp.whatsappAi();
      System.out.println(Whatsapp.version);
	}

}
class Whatsapp{
	static String version = "2.7.2.0";
	void whatsappMsg(){
		System.out.println("Hi");
	}
	static void whatsappAi(){
		System.out.println("Hi this is AI");
	}
	
}
