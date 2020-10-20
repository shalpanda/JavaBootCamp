package sef.module8.sample;
// Needs to be completed
public class TryCatchFinallySample {

	//The following String variable is declared at class level. It'd automatically be initialized to null.
	String str;
	
	public static void main(String[] args) {
		try {
			//1 - Create an instance of TryCatchFinallySample and call catchMeIfYouCan()
			
			TryCatchFinallySample obj = new TryCatchFinallySample();
			obj.catchMeIfYouCan();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void catchMeIfYouCan()
	{
		//As long as we try to print it, it'd work and print null.		
		System.out.println(str);
		str = "Intelligent student ";
		int temp1=0;
		int temp2 = 10;
		
		//However, when we try to execute any operations on it, it'd throw a NullPointerException 
		//Uncomment the following line and then run to see what happens.
		//System.out.println(str.toUpperCase());
		
			
		//You should program in a way that such issues are captured. Follow the instructions given by your trainer to complete this code with try, catch, finally blocks
		
		//Lets see how do we handle this
		//2 - put the above print statement inside a try catch block 
		
		try {
			System.out.println(str.toUpperCase());
			
			System.out.println(temp1/temp2);
		} catch (NullPointerException e) {
			System.out.println("A variable is not initialized");
		}catch(ArithmeticException e) {
			System.out.println("I can not perform division operation if divident is zero");
		}finally {
			System.out.println("Noth wrong has happend while executing the code ! ");
		}
	}
	
}
