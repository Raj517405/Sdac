package assignment;

class A{
	
	void meth(){
		System.out.println("Hi, My self Ajay.");
		
	}
	
	void meth(int a, String name){
		System.out.println("Now, I am going tocreate Github account.");
		System.out.println("Nice to see you.");
	}
}
public class Overloading {

	public static void main(String[] args) {
		A a =new A();
		a.meth();
		a.meth(2, "Ajay");
		

	}

}
