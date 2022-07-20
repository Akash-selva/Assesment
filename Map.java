
import java.util.HashMap;
public class Map {
 public static void main(String[] args){

HashMap<String,Integer> model=new HashMap<String,Integer>();
model.put("maruthi",1990);
model.put("hyundai",2010);
model.put("kia",1970);
for( String i : model.keySet() )
{
System.out.println("key:"+" "+i+", "+"value:"+" "+model.get(i));

                               

                }
}

}



