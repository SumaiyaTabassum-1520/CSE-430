package stringManupulator;

public class StringManipulatorClass2 {

	   //This function  capitalizes the first letter of each word while converting the rest of the letters to lower case.
		public String capitalizeWords(String sentence) {
	        StringBuilder result = new StringBuilder();
	        boolean capitalize = true;
	        for (char ch : sentence.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                if (capitalize) {
	                    result.append(Character.toUpperCase(ch));
	                    capitalize = false;
	                } else {
	                    result.append(Character.toLowerCase(ch));
	                }
	            } else {
	                result.append(ch);
	                if (ch == ' ') {
	                    capitalize = true;
	                }
	            }
	        }
	        return result.toString();
	    }
		 //This Function removes all non Alphabetic characters
		 public String removeNonAlphabetic(String str) {
		        return str.replaceAll("[^a-zA-Z]", "");
		    }
		 
		  //This Function Checks Whether the String Contains the substring or not
		  public boolean containsSubstring(String str, String substr) {
		        return str.contains(substr);
		    }
		  
	        //This Function joins two strings together
		    public String MergeStrings(String str1, String str2) {
		        return String.join("", str1, str2);
		    }
		    
		    //This Function Will reverse the words of given sentence 
		     public String reverseWords(String sentence) {
		        String[] words = sentence.split("\\s");
		        StringBuilder reversedSentence = new StringBuilder();
		        for (int i = words.length - 1; i >= 0; i--) {
		            reversedSentence.append(words[i]);
		            if (i > 0) {
		                reversedSentence.append(" ");
		            }
		        }
		        return reversedSentence.toString();
		    }
	}

