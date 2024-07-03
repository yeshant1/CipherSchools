package Arrays;

public class ArrayStudy {
	static void print(int arr[])
	{
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		//1.Array Creation Expression
		int size = 5;
		int arr[] = new int[5];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]); 
		
//		for(int i=0;i<size;i++) {
//		System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		
		print(arr);
		for(int i = 0;i<size;i++) {
			arr[i] = i+1;
			
		}
		print(arr);   
		
		//2. Array initializers list
		int arr2[] = {1,2,3,4};
		print(arr2);
		
		//if we want to inrease size of an array?
		
		int copyArr[] = new int[2*size];//create an array of double size
		for(int i = 0;i<size;i++)
		{
			int[] copyArray = null;
			copyArray[i] = arr[i];
		}
		int[] copyArray = null;
		copyArray[5] = 6;
		copyArray[6] = 7;
		print(copyArray);
	}
	

}
