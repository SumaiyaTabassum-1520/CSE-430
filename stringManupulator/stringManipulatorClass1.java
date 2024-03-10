package stringManupulator;

//import java.util.HashSet;
//import java.util.List;

public class stringManipulatorClass1 {
	
	  //This Function will return the length of string
	  public int calculateStringLength(String input) {
	        return input.length();
	    }
	  
	  //This Function will return a string in reverse 
	  public String reverseString(String input) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed.append(input.charAt(i));
	        }
	        return reversed.toString();
	    }
	  
	  //This Function Will Convert a string into lower case and return the string
	  public String toLowerCase(String input) {
	        return input.toLowerCase();
	    }
	  
	  //This Function will count the occurrence of a particular character in the String
	  public int countOccurrences(String str, char c) {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == c) {
	                count++;
	            }
	        }
	        return count;
	    }
	  //This Function will remove duplicate entries from the String 
	 /* public String removeDuplicates(String str) {
	        return new StringBuilder(new HashSet<>(List.of(str.split(""))).toString())
	                .deleteCharAt(0).deleteCharAt(str.length()).toString()
	                .replaceAll(", ", "");
	    }*/
	  
}

