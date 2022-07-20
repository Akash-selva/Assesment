
import java.util.ArrayList;
import java.util.Collections;

public class Collection {
	public static void main(String[] args) {

		ArrayList<Integer> myno = new ArrayList<Integer>();
		myno.add(32);
		myno.add(67);
		myno.add(28);
		myno.add(99);
		Collections.sort(myno);
		for (int i : myno) {

			System.out.println(i);
		}
	}
}
