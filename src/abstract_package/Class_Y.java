package abstract_package;

//learning for abstract method and abstract class
//learning 1: We have to mention the keyword: abstract before the class name
//learning 2: we can not create an object of an abstract class
//learning 3: abstract class can have both abstract and non abstract methods
//learning 4: abstract keyword is also used to declare an abstract method (between access modifier and return type)
//learning 5: abstract method should not have a method body (no curly braces)
//learning 5: abstract method should not be static. Only public, private and protected access modifiers are used

public abstract class Class_Y {

	//non abstract method
	public void myMethod(String variable) {
		System.out.println(variable);
	}

	//non abstract method
	public void method(int variable) {
		System.out.println(variable);
	}
	
	public abstract void methodAbstract(int variable, int variable2);

}
