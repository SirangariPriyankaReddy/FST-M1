package activities;

@FunctionalInterface
interface Addable {
	int add(int a , int b);
	
}
public class Activity12 {
	public static void main(String[] args) {
		Addable addObj = (int a , int b) -> {
			return a + b;
		};
		
		System.out.println(addObj.add(10,10));
		
			
		
	}

}
