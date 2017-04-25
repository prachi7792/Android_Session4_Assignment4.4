/**
 * this for files
 * @author Acer
 * 
 * @date Apr 26, 2017
 */
package constructorchaininginjava;

/**
 * this for classes
 */
public class Child extends Parent {       //here we are creating a subclass of the class extending.
	
	/**
	 * Instantiates a new child.
	 */
	public Child() {
		this("JIP");              // passing argument to parent class constructor.
		System.out.println("Child  no-args constructor called");    // this message should be printed.
	}

	/**
	 * Instantiates a new child.
	 *
	 * @param name the name
	 */
	public Child(String name) {
			super("JIP");         // passing argument to parent class constructor.
			System.out.println("Child constructor called by " + name); // this message should be printed.
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {      //calling main method
		Child c = new Child();                    //Object 'c' has access to child's properties as well as its parent class properties
	}											  //By using child reference we can call both parent and child class
}
