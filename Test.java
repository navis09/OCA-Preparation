import java.util.*;

interface Bozo {
	int type = 0;
	public void jump();
}
class Base{
	final int i = 10;
}

class A {
	int i = 10;
	int m1() {
		return i;
	}
}
class B extends A {
	int i = 20;
	int m1() {
		return i;
	}
}
class C extends B {
	int i = 30;
	int m1() {
		return i;
	}
	String m2() {
		return "Method declared in subclass";
	}
}

public class Test extends Base implements Bozo{
	private int j = 0; //used in loop
	public static int var = 0;

	public static void main(String[] args) {
		System.out.println("String".replace('g','G') == "StrinG");

		// Test t = new Test();
		// System.out.println(t.accessStatic());
		// t.changeIt(20);
		// System.out.println(t.j);

		// String s = "abcd";
		// char a = 1;
		// System.out.println(s.charAt(a));

		/* Boolean object */
		// //The String constructor allocates a Boolean object representing the
		// //value true if the string argument is not null and is equal,
		// //ignoring case, to the string "true".
		// Boolean strConstructor1 = new Boolean("TrUe");
		// Boolean strConstructor2 = new Boolean("hello");
		// Boolean boolConstructor1 = new Boolean(true);
		// Boolean boolConstructor2 = new Boolean(true);
		// //parseBoolean return primitive boolean
		// Boolean parseB1 = Boolean.parseBoolean("true");
		// Boolean parseB2 = Boolean.parseBoolean("false");
		// Boolean parseB3 = Boolean.parseBoolean(null);
		// //valueOf return to a reference object to either Boolean.TRUE or Boolean.FALSE
		// Boolean valueB = Boolean.valueOf("true");
		//
		// System.out.println(strConstructor1 == boolConstructor1);
		// System.out.println(strConstructor2 == false);
		// System.out.println(boolConstructor1 == boolConstructor2);
		// System.out.println(strConstructor1 == parseB1);
		// System.out.println(boolConstructor1 == valueB);
		// System.out.println(parseB1 == valueB);
		// System.out.println(parseB1 == parseB2);
		// System.out.println(parseB2 == parseB3);


		/* loop with a variable j*/
		//new Test().showJ();

		/* substring */
		// String s = "MINIMUM";
		// System.out.println(s.substring(4,7));
		// System.out.println(s.substring(4,8)); //StringIndexOutOfBoundException
		// System.out.println(s.substring(s.indexOf('I', 3)));
		// System.out.println(s.substring(s.indexOf('I', 4))); //s.indexOf returns -1

		/* Override */
		// A a = new C();
		// B b = (B)a;
		// C c = (C)a;
		// System.out.println(a.i);
		// System.out.println(a.m1());
		// System.out.println(b.i);
		// System.out.println(b.m1());
		// System.out.println(c.m1());
		// System.out.println(c.m2());

		/* StringBuilder replace  */
		// StringBuilder b1 = new StringBuilder("abcdef");
		// StringBuilder b2 = new StringBuilder("defgha");
		// b1.replace(3,4,"a");
		// System.out.println(b1.toString());
		// System.out.println(b2.toString());

		/* String concat  */
		// String s = "hello";
		// s.concat(" world");
		// System.out.println(s);
		// System.out.println(s.concat(" world"));
		// s = s.concat(" world");
		// System.out.println(s);

		/* implement interface - method */
		// Bozo b = new Test();
		// b.jump();

	}
	public void changeIt(int j) {
		j = 20;
	}

	public static int accessStatic(){
		return var;
	}

	public void jump() {
		System.out.println("jumping...");
	}
	void printMe(Object[] oa) {
    for(int i = 0; i <= oa.length; i++) {
        System.out.println(oa[i]);
    }
	}

	void showJ() {
		int j = 1;
		while (j <= 5) {
			for (j = 0; j < 5; j++) {
				System.out.println(j);
			}
			j++;
		}
	}
}
