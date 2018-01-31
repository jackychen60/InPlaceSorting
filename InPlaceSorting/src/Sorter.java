import java.util.Arrays;

public class Sorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {1,4,4,5,2,4,3,17,0};
		double[] test2 = {1.1,4.1,4.2,5.0,2.0,4.0,3.0,17.0,0.0};
		String[] test3 = {"zebra","tortilla","abba","foo","bar","aba"};
		
		//bubble Sort Test
		long start = System.nanoTime();
		BubbleSort(test3);
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("Test3 Took :" + time + "nanoseconds");
		System.out.println(Arrays.toString(test3));
		//Selection Sort Test
		start = System.nanoTime();
		SelectionSort(test2);
		end = System.nanoTime();
		time = end-start;
		System.out.println("Test2 Took :" + time + "nanoseconds");
		System.out.println(Arrays.toString(test2));
		//Insertion Sort Test
		start = System.nanoTime();
		InsertionSort(test1);
		end = System.nanoTime();
		time = end-start;
		System.out.println("Test1 Took :" + time + "nanoseconds");
		System.out.println(Arrays.toString(test1));
		
	}
	public static void InsertionSort(int[] list1)
	{ for (int i = 1; i < list1.length; i++) {
		int x = list1[i];
		int j = i;
		while (j > 0 && list1[j - 1] > x) {
			list1[j] = list1[j - 1];
			j--;
		}
		list1[j] = x;
	}
	}
	public static void SelectionSort(double[] list1)
	{	  
	       for(int i=0; i < list1.length; i++){  
	           for(int j=i+1; j <list1.length ; j++){  
	        	   if (list1[i]>list1[j])
					{
						SwapDouble(list1, i, j);
					}  
	         }  
	       }
	}	
	public static void BubbleSort(String[]list1)
	{	  
	       for(int i=0; i < list1.length; i++){  
	           for(int j=i+1; j <list1.length ; j++){  
	        	   if (list1[i].compareTo(list1[j]) > 0)
					{
						SwapString(list1, i, j);
					}  
	         }  
	       }
	}	

public static void SwapInt(int[]arr, int index1, int index2)
	{
		int x= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=x;
	}
	public static void SwapDouble(double[] test2, int index1, int index2)
	{
		double x= test2[index1];
		test2[index1]=test2[index2];
		test2[index2]=x;
	}
	public static void SwapString(String[]arr, int index1, int index2)
	{
		String x= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=x;
	}

}
