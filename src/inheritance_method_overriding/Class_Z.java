package inheritance_method_overriding;

//super class
public class Class_Z {

	public void myMethod(String variable) {
		System.out.println(variable);
	}

	protected void myMethod(int variable) {
		System.out.println(variable);
	}
	
	void myMethod(int variable, int variable2) {
		System.out.println(variable+ variable2);
	}
	
}
