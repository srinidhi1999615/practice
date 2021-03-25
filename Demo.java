
public class Demo {
	public static void main(String args[]){
		
	
	try{
		int z = 10/0;
		
	}
	catch(ArithmeticException e){
		System.out.println("we have an arithmetic exception");
		
	}
	finally{
		System.out.println("above process doesnt exist");
	}
	}
}
