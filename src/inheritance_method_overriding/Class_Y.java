package inheritance_method_overriding;


//Learning 1: Overriding is only possible if both methods involved are non static
//Learning 2: Everything about those involved methods have to be same (name as well as arguments)
//Learning 3: There must be an inheritance relationship between those methods
//Learning 4: Overriding is possible when the super class method is default (no access modifier is present) or protected or public

//subclass
public class Class_Y extends Class_Z{
	
	public static void main(String[] args) {
		
	}

	public void myMethod(String variable) {
		System.out.println(variable);
	}

	public void myMethod(int variable) {
		System.out.println(variable);
	}
	
	void myMethod(int variable, int variable2) {
		System.out.println(variable+ variable2);
	}

}
