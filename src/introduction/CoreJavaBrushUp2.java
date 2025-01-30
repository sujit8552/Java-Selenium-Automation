package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
		
		// Print the elements from array which are multiple by 2
		for(int num: arr2)
		{
			if(num%2 == 0)
			{
				System.out.print(num + " ");
			}
		}
		
		// In real time we want dynamic array (ArrayList) not static array
		// e.g. product names into array in e-commerce
		
		//######### ArrayList ############
		// Create ArrayList
		ArrayList<String> arrlist = new ArrayList();
		// Add items to array list
		arrlist.add("Rahul");
		arrlist.add("Shetty");
		// array list is dynamically growing
		arrlist.add("Selenium");
		arrlist.add("Java Automation");
		// Remove item from ArrayList
		arrlist.remove(0);
		// Print all elements of ArrayList using for loop
		for(int i=0; i< arrlist.size(); i++)
		{
			System.out.println(arrlist.get(i));
		}
		System.out.println("=====================================");
		for(String str: arrlist)
		{
			System.out.println(str);
		}
		
		//To check if item is present in ArrayList : contains() 
		System.out.println(arrlist.contains("Selenium"));
		
		// If you want to convert normal array to ArrayList we have .asList() method
		String[] names = {"Rahul","Shetty","Java","Selenium"};
		List<String> namesArrayList = Arrays.asList(names);
		System.out.println(namesArrayList.contains("Java"));
		
		// Interview Question: What is the difference between Array and ArrayList? Why ArrayList is required to use?
		// Ans => Array is static and ArrayList is dynamic so we can add items to arraylist dynamically and it also grows
		// dynamically
	
	}

}
