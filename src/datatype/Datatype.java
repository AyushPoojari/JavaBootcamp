package datatype;

public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating string
		//Method-01
		String firstName = "Ayush";
		String lastName = "Poojari";
		
		//Method-02 
		//Array to string 
		char [] ch = {'A','y','u','s','h'};
		String char_to_string = new String(ch);
		
		
		//Printing the string
		System.out.println(firstName + " " + lastName);
		System.out.println(char_to_string);
		
		
		/*Java string provides various types of methods to perform operations on string
		 such as compare() , replace() , equals() , charAt(int index) , concat() , length() , 
		 toUpperCase() , toLowerCase()
		 */
		// Concat()
		String concate = firstName.concat(lastName);
		
		// Equals()
		boolean equal = firstName.equals(lastName);
		
		//Compare
		int compare = firstName.compareTo(lastName);
		
		// Replace()
		String replace = firstName.replace("A", "Z");
		
		//Upper()
		String Upper = firstName.toUpperCase();
		
		//Lower()
		String Lower = lastName.toLowerCase();
		
		//Printing Functions
		System.out.println(concate);
		System.out.println("Equal:" + equal);
		System.out.println("Compare"  + compare);
		System.out.println("Replace " + replace);
		System.out.println("Upper function : " + Upper);
		System.out.println("Lower fucntion : " + Lower);
	}

}
