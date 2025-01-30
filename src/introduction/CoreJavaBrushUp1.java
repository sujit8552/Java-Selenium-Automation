package introduction;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		String website = "www.google.com";
		double cash = 15000.00;
		
		System.out.println(website);
		
		//Arrays
		int[] arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		for(int i=0; i< arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		
		String[] names = {"rahul", "shetty", "sujit"};
		for(int i=0; i<names.length;i++)
		{
			System.out.print(names[i]);
		}
		
		// Enhanced for loop
		for(String s: names)
		{  
			System.out.println(s);
		}
	}

}
