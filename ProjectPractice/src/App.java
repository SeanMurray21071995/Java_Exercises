

public class App {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for(int i = 0; i< 10; i++ ) 
		{
			arr[i] = i;
		}
		 
		
		String output= "Hello world !";
		
		//Hello World	
		System.out.println("Hello World");	
		
		//Assignment
		System.out.println(output);
		
		//Parameters
		// return types	
		System.out.println(Practice.shout(output));	
		
		//Parameters/Operates	
		System.out.println(Practice.add(3, 4));	
		
		// Conditions
		System.out.println(Practice.addMulti(false, 3, 3));	
		
		//Conditions 2 
		System.out.println(Practice.addMultiElseZero(true, 0, 5));	
		
		// Iteration
		for(int i = 0; i< 10; i++) 
		{
			System.out.println(Practice.addMultiElseZero(true, i, 4));
		}
		
		//Arrays
		for(int i = 0; i< 10; i++) 
		{
			System.out.println(Practice.addMultiElseZero(true, i, arr[i]));
		}
		
		//Iteration/Array
		for(int i=0; i <arr.length; i++) 
		{
			System.out.println("Array:"+arr[i]);
		}
		
		//Iteration/Array2 
		int[] arrTwo = new int[10];
		for(int i= 0 ; i < arrTwo.length; i++) 
		{
			arrTwo[i]= i;
			System.out.println("arrTwo: "+arrTwo[i]);
			
		}
		for(int i=0; i<arrTwo.length; i++) 
		{
			int holder = arrTwo[i];
			arrTwo[i]= holder*10;
			System.out.println("arrTwo*10: "+arrTwo[i]);
		}
		
		
	}
}
 