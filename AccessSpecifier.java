
public class AccessSpecifier {
	private String name = "java";
	public String getname()
	{
		return this.name = name;
		
	}

	public static void main(String[] args) {
		AccessSpecifier obj =new AccessSpecifier();
		System.out.println("print private name:"+" "+obj.getname());
		

	}

}
