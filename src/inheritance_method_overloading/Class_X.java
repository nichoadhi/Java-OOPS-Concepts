package inheritance_method_overloading;


//learning 1: main method has to be static always
//learning 2: super keyword can not be used under a static method
//learning 3: to access non static method, we have to create object of the corresponding class
//learning 4: super keyword is used to refer to the method of the parent class
//learning 5: Method Overloading only works when the methods have different arguments
//learning 6: Extends keyword is used to inherit a parent class inside a child class
//learning 7: Whenever we are creating an object of a class, the default constructor of that class is being invoked


//child class
public class Class_X extends Class_Y{

	public static void main(String[] args) {
		myMethod("Nicholas");
		myMethod(50);
		
		Class_X myObj = new Class_X();
		myObj.superKeywordMethod();
	}
	
	//PolyMorphism- Method Overloading
	public static void myMethod(String variable) {
		System.out.println(variable);
	}
	
	//PolyMorphism- Method Overloading
	public static void myMethod(int variable) {
		System.out.println(variable);
	}
	
	public void superKeywordMethod() {
		super.myMethod("Super");
		//coming from Class Y, using the super keyword, can not be used under static method
	}
	
	
}
