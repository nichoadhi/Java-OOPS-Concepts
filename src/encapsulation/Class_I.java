package encapsulation;

//Learning for encapsulation
//Learning 1: variables encapsulated should be declared as private where it is located
//Learning 2: to access the private variables we need to establish getter and setter method
//Learning 3: Right click inside the class > source > generate getter and setter > choose the variable > OK
//Learning 4: Getter Method: to get the variable that has been declared private.
//Learning 5: Setter Method: to set (insert) something in the variable that is declared private. The return type of the setter method should always be void. 

public class Class_I extends Class_H{
	
	static Class_I myobj = new Class_I();

	public static void main(String[] args) {
		System.out.println(myobj.getA());
		myobj.setA("Nicholas");
		System.out.println(myobj.getA());
	}
	
}
