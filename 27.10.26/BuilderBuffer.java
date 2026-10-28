package Day9;

public class BuilderBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("Face");
		for(int i=0; i<10000000; i++){
			sb.append("prep");
		}
		System.out.println("Rime taken by StringBuffer: "+(System.currentTimeMillis()- startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder sb2=new StringBuilder("Face");
		for(int i=0; i<10000000; i++){
			sb2.append("prep");
		}
		System.out.println("Rime taken by StringBuffer: "+(System.currentTimeMillis() - startTime) + "ms");

	}

}
