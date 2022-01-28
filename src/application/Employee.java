package application;

public class Employee extends Person {

	/* default constructor in use, but since this is
	 * a child of Person, the Person constructor is also
	 * called.
	 */
	/* this won't work because the super class constructor
	 * requires a parameter
	 
	public Employee() {
		System.out.println("Employee constructor.");
	}
	*/
	public Employee () {
		//using super supplies the necessary info for the Person
		//constructor.  Tells Java which constructor to use.  If there
		//multiple constructors, this will direct Java to the right one.
		//super has to be the first word in this constructor
		super("Reggie");
		System.out.println("employee constructor");
	}
}
