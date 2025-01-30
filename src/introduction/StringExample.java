package introduction;

public class StringExample {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object
		String s5= "Rahul shetty Academy"; // This is a string literal
		String s1 = "Rahul shetty Academy"; // Java will not create another object
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome"); // Here 2 different object will be created.
		
		/*
		 * Interview Question: 
		 * Q.1) What is String in Java?
		 * Ans => String is an object which reperesents sequence of characters?
		 * Q.2) How many ways you can define string?
		 * Ans => We can define string in 2 ways i) String literal ii) Using new keyword.
		 * Q.3) How do you want to create String object? with String literal or new keyword?
		 * Ans => When you create String with new keyword everytime you creates a new object even though the 
		 * 		  value is same. But incase of string literal if values are same then it refers to the same.
		 * Generally in automation String literal is used. 
		 * */
		
		
		// Split the String based on whitespace : Split() method in String class
		String s = new String("Rahul Shetty Academy");
		String[] splittedString = s.split("Shetty"); // it is returning 3 strings so we have to catch in an array
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim()); // to remove the white space
		// To Print character by character by iterating a string
		for(int i=0; i<s.length();i++)
		{
			System.out.println(s.charAt(i)); 	 	  
		}
		
		// I.Q) Print the String in reverse order
		String str = "PrintTheString";
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.println(str.charAt(i)); 
		}
		
		
		
	}

}
