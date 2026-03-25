public class HowClassInitializeInJava {

	public static void main(String[] args) {

		new Child();
		System.out.println("----");
		new Child();

		// 1. Initializes static variables, Execute static blocks
		// 📌Note: Static block runs only once, no matter how many objects you create.
		// 2. Instance initialization blocks (Empty block)
		// 2. Invoke Default Constructor, Parent class constructor is called first. super();
	}
}

class Parent {
	static {
		System.out.println("Parent static");
	}

	{
		System.out.println("Parent instance block 1");
	}

	{
		System.out.println("Parent instance block 2");
	}

	Parent() {
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {
	static {
		System.out.println("Child static");
	}

	{
		System.out.println("Child instance block");
	}

	Child() {
		System.out.println("Child constructor");
	}
}
