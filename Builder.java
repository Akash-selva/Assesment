
class TestStringBuilder

{

	StringBuilder sb = new StringBuilder("Hello ");

	public void appendTest()

	{

		System.out.println(sb.append("myworld"));

	}

}

public class Builder {

	public static void main(String args[])

	{

		TestStringBuilder obj = new TestStringBuilder();

		// method call

		obj.appendTest();

	}

}
