public class Array {

	public static void main(String[] args)

	{

		String[] cars = { "Volvo", "BMW", "Thar", "Audi" };// single dimensional array

		for (int i = 0; i < cars.length; i++)

		{

			System.out.println(cars[i]);

		}

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };// multidimensional array

		int x = myNumbers[1][2];

		System.out.println(x);

	}
}
