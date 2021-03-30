
import java.io.IOException;

public class SerializationTest {
	public static void main(String args[]){
	String fileName ="employee.ser"	;
	Employee employee = new Employee();
	employee.setName("Srinidhi");
	employee.setPhone(10);
	employee.setAge(22);
	
	try{
	 SerializationUtil.serialize(employee,fileName);
		
	}
	catch(IOException e){
		e.printStackTrace();
		}
	Employee empNew = null;
	try{
	empNew = (Employee)SerializationUtil.deserialize(fileName);
	}
	catch(IOException e){
		e.printStackTrace();
		return;
		
	}
	catch (ClassNotFoundException e){
		e.printStackTrace();
		return;
	}
	System.out.println("object new is:"+empNew);
	}
}

