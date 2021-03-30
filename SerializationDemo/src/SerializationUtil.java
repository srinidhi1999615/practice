import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 

public class SerializationUtil {
	public static void serialize(Object obj,String filename)throws IOException{
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();
	}
		
		public static Object deserialize(String filename)throws IOException,ClassNotFoundException{
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			ois.close();
			return obj;
			
			
			
		}
		
		
	}


