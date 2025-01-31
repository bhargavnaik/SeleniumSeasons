package drop1;

public class Calculator {
	
 public Calculator() {
	 System.out.println("hii,there calling");
 }
 public void add(String message) {
	 System.out.println(message);
 }
 public void sub(String message) {
	 System.out.println(message);
 }
 
	public static void main(String[] args) {
		
		Calculator obj=new Calculator();
		Calculator obj2=new Calculator();
		obj.add("this is an addition method");

	}

}
