
public class ThrowDemo{
	public int meth(int a ,int b)throws ArithmeticException{
		int z = a/b;
		return z;
	}
		
	
	public static void main(String args[]){
		ThrowDemo td = new ThrowDemo();
		try{
			System.out.println(td.meth(10,0));		
		}
		catch(ArithmeticException e){
			System.out.println("srinidhi joshi");
	}
	
}
}
