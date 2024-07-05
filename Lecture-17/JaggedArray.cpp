package Arrays;

public class JaggedArray {
	static void printJaggedArray(int arr[][])
	{
		//printing jagged array properly
		//All rows in seprate lines
		for(int i = 0;i<arr.length;i++)//rows
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int [3];
		arr[1] = new int [2];
		arr[2] = new int [3];
		printJaggedArray(arr);
		
		
		int arr2[][] = new int [3][];//we have already declared the array above 
		//arr2[0] = {1,2,3};//we cannot use initializers list because it does not create an object
		//arr2[1] = {2,3}
		//arr2[2] = {4,5,6}
		
		//Anonymous arrays
		arr2[0] = new int [] {1,2,3};
		arr2[1] = new int[] {2,3};
		arr2[2] = new int[] {4,5,6};
		System.out.print("*************............***********.......********");
		printJaggedArray(arr2);

	}

}
