public class Buffer {

	public static void main(String[] args) {

		// methods of strings

		System.out.println("welcome to java Strings");

		String obj = new String("String World");

		System.out.println(obj.length());

		String str = "My java program";

		StringBuffer sbr = new StringBuffer(str);

		sbr.reverse();

		System.out.println("String to StringBuffer");

		System.out.println(sbr);

	}

	}

