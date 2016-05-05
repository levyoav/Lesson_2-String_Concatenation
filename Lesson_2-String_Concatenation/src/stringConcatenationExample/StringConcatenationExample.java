package stringConcatenationExample;

public class StringConcatenationExample {
	
	public static void main(String[] args) {
		
		String str = "abc"; //str is a String type reference.
		System.out.println(str);
		
		str += "AAA"; //Concatenating the string "AAA" to the string referenced by str.
		System.out.println(str); //"abcAAA" is printed.
		
		//The result of the arithmetic expression is being converted to a String (using the toString() method
		//of the wrapper class of the result type, in this case Integer class) and is concatenated to str. 
		str = str + (5 + 2);  
		System.out.println(str);
	}

}
