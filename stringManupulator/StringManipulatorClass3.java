package stringManupulator;

public class StringManipulatorClass3 {  
	 //This Function checks whether a string is palindrome or not 
	   public boolean isPalindrome(String str) {
	        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	    }
	   //This Function removes unnecessary spaces from the string
	   public String removeExtraSpaces(String str) {
	        return str.replaceAll("\\s+", " ").trim();
	    }
	   }
	
