import java.io.Serializable;


public class Employee implements Serializable {
	private String name;
	private int  phone;
	private int age;
	public String toString(){
			return	"Employee name ="+name+ "phone is:" +phone+"age is"+age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getPhone(){
		return phone;
	}
	public void setPhone(int  phone){
		this.phone=phone;
	}
	public int  getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}
