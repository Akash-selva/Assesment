
public class InnerClassProg {
	class Outer {

		class Inner {
			public void show()

			{

				System.out.println("Welcome to Inner class");

			}

		}

	}

	class InnerClass {

		public void main(String[] args)

		{

			Outer.Inner in = new Outer().new Inner();

			in.show();

		}
	}
}
