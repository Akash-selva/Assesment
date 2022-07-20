
public class Constructor {
String modelname;
int modelyear;

public Constructor(String name,int year) {
	modelname=name;
	modelyear=year;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor("hyundai",1999);

		System.out.println("car model and year is: " +" "+obj.modelname+" "+obj.modelyear);
	}

}