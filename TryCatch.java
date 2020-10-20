package assignmentsSimpliLearn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryCatch {
	
	public static void main(String[] args) {
		try(FileOutputStream fileOutputStream =new FileOutputStream("abc.txt")){      
			String msg = "Welcome to java!";      
			byte byteArray[] = msg.getBytes(); //converting string into byte array
			fileOutputStream.flush();
			fileOutputStream.write(byteArray);
System.out.println("Message written to file successfuly!");      
			}catch(Exception exception){  
			       System.out.println(exception.getMessage());  
			}      	

	}


}
