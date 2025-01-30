package introduction;

public class MethodsDemo {
	public static void main(String[] args)
	{
		//################ How To Create Methods in Java and Access Them ###########
		MethodsDemo demo = new MethodsDemo();
		String name = demo.GetData();
		System.out.println(name);
		
		// calling static method without creating object
		PrintName();
	}
	
	// We have to create object of class MethodsDemo and then call this method
	public String GetData()
	{
		System.out.println("Hii");
		return "Rahul Shetty";
	}
	
	// If you dont want to create the object of the class and directly call the method then use "static"
	public static void PrintName()
	{
		System.out.println("This is called without creating object");
	}
}
