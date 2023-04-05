package assignment;

class A {
	void meth(){
		System.out.println("Hello!, I am Ajay.");
	}
}
class B extends A {
	void meth(){
		System.out.println("Github");
	}
}

public class Overriding {
	public static void main(String[] args) {
		B b = new B();
				b.meth();
				
		
	}

}
