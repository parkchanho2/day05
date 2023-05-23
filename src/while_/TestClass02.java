package while_;

public class TestClass02 {
	public static void main(String[] args) {
		boolean bool = true; // or fasle
		
//		for(int i=0; bool == true; i++) {
//			System.out.println(i+".execute");
//			if( i> 10)
//				bool = false;
//		}
		
		
		int i = 0;
		while(bool) {
			System.out.println(i +".execute");
			i++;
			if(i > 10) {
				bool = false;
			
			}
			
		}
	}
}
