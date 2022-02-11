package My_Package;
public class Array_intro 
{
	public static void main(String[] args) 
{
		int[] a;     //Array declaration
		a = new int [5]; //allocating memory to array
		System.out.println(a[2]); //accessing element at index 2
		System.out.println(a.getClass().getName());
		
		int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };  //Array literal		
		
		int[] b= {10,20,30};   //Array literal
		//No need to write new int[] in new versions of java.
		
		float[] c=new float[4];   //combining both declaration and memory allocation
		System.out.println(c[2]);
		System.out.println(c.getClass().getName());
		
		byte[][] arr1= new byte[2][3];		//2D array
		System.out.println(arr1);		//Memory reference of 2D array arr1
		System.out.println(arr1[0]);  	//Memory reference of 1D array located at 0th index of 2D array arr1
		System.out.println(arr1[0][0]); //Element at 0th index in 1D array located at 0th index of 2D array arr1

		boolean[] w=new boolean[4];
		System.out.println(w[1]);
		System.out.println(w.getClass().getName());   //***
		
		double[] d=new double[4];
		System.out.println(d.getClass().getName());
		
		short[] e=new short[4];
		System.out.println(e.getClass().getName());
				
		byte[] f=new byte[4];
		System.out.println(f.getClass().getName());
		
		long[] h=new long[4];
		System.out.println(h[2]);
		System.out.println(h.getClass().getName()); //***
		
		char[] j=new char[4];
		System.out.println(j[2]);					//***
		System.out.println(j.getClass().getName());
		
		String[] v=new String[4];
		System.out.println(v[2]);					//***
		System.out.println(v.getClass().getName());	//***
		
	//Some valid array declarations:	
		int[]x;
		int u[];
		int [][] s;
		int [][]k;
		int g[][];
		int[][] i;
		int[] []o;
		int[] p[];
		int []q[];
		int[] r,t;			// r and t as 1D Array
		int[] y1[],y2[];	// y1 and y2 as 2D
		int[] a1[],b1;		// a1 as 2D and b1 as 1D	
}	
}
/*Note:- For every array class is available which is part of java language.
  This class is not available for developers.*/	