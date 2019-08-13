package Session6;

public class IntArray {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = i + 1;
		displayEvens(intArray);

	}
	
	static void displayEvens(int[] intArray) {
		for (int i = 0; i < intArray.length; i++)
			if(intArray[i]%2==0)
			System.out.print(intArray[i]+" ");
	}

}
