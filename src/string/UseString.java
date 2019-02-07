package string;
public class UseString {
     String name ="Sheikh Rahman";
     String names ="Sheikh Rahman";
     public void lenghtOfName() {
    	System.out.println("Length of name is :"+name.length()); 
     }
     public void upperCase() {
    	 System.out.println("All letters are upper case :"+name.toUpperCase());
     }
     public void lowerCase() {
    	 System.out.println("All letters are lower case: "+name.toLowerCase());
     }
     public void indexFirstLetter() {
    	 System.out.println("Index number of first letter: "+name.charAt(0));
     }
     public void stringHashCode() {
    	 System.out.println("Index:"+name.hashCode());
     }
     public void replaceLetter() {
    	 System.out.println("Replace: "+name.replace("i", "a"));
     }
     public void replaceWord() {
    	 System.out.println("Tow Letter replaced:"+name.replace("Sheikh", "replacement"));
     }
     public void indexOfLetter() {
    	 System.out.println("Index of letter :"+name.indexOf(0));
     }
     public void contentTrueFalse() {
    	 boolean cont =name.contains("eikh");
    	System.out.println(cont);
     }
     public void variableValueBlank() {
    	 boolean truefalse =name.isBlank();
       System.out.println("Is variable name blank:"+truefalse);
     }
     public void emptyVariable() {
    	 boolean empValue  = name.isEmpty();
    	 System.out.println(empValue);
     }
     
     
	}


