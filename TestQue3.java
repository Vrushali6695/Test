package java;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.regex.Pattern;

//Write program to accept email string and validate email.
public class TestQue3 {
	
	 static boolean isValid(String email){
		String emailRegex="^[a-zA-Z0-9_+&*-]+(:\\."+
	                      "a-zA-Z0-9_+&*-]+)*@"+ 
				          ":[a-zA-Z0-9-]+\\.)+[a-z"+
	                      "A-Z]{2,7}$";
	Pattern pat=Pattern.compile(emailRegex);
		if(email==null){
			return false;
			return pat.matcher(email).matches();
		}
		public static void main(String[]args) {
		ArrayList<String> address=new ArrayList<>();
		
		address.add("review.student01@gmail.com");
		address.add("writting.test01*@gmail.com")
		;
		for (String string : address) {
			if(isValid(string)){
				System.out.println(string+"-yes");}
			
				else{
				System.out.println(string+"No");
			}
			}
		}
		
	}

}
