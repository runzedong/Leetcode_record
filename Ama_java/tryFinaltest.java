import java.util.*;

public class tryFinaltest {

	public static String lem() {
		System.out.println("start lem");
		System.out.println("lem executing");
		return "return from FUNC lem";
	}

	public static String bar() {
		System.out.println("start bar");
		int a = 0;
		int b = 5;
		try {
			System.out.println("start try");
			int c = b/a;
			System.out.println("end try");
			return "return from try block";
		}

		catch (Exception ex) {
			System.out.println("start catch");
			return lem()+" @ return from catch block";
		}

		finally {
			System.out.println("start finally");
			System.out.println("bar finally executed");
		}
	}

	public static void foo() {
		System.out.println("start foo");
		String s = bar();
		System.out.println(s);
		System.out.println("end foo");
	}

	public static void main(String[] args) {
		foo();	
	}
	
}

/*
	start foo
	start bar
	start try
	start catch
	start lem
	lem executing
	----> catch has return string to Varialbe s. and then finally block execute.
	start finally
	bar finally executed
	----> s is the following string, and output with System.out.println(s);
	return from FUNC lem @ return from catch block
	end foo

*/