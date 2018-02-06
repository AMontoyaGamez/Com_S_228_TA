package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Sortbyroll implements Comparator<Student>
{
	 // Used for sorting in ascending order of
	 // roll number
	 public int compare(Student a, Student b)
	 {
		 return a.rollno - b.rollno;
	 }
}

class Sortbyname implements Comparator<Student>
{
	// Used for sorting in ascending order of
	// roll name
	public int compare(Student a, Student b)
	{
		return a.name.compareTo(b.name);
	}
}

//Driver class
public class StudentTest
{
	public static void main (String[] args)
	{
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
		ar.add(new Student(131, "aaaa", "nyc"));
		ar.add(new Student(121, "cccc", "jaipur"));

	     System.out.println("Unsorted");
	     for (int i=0; i<ar.size(); i++)
	    	 	System.out.println(ar.get(i));
	
	     Collections.sort(ar, new Sortbyroll());
	
	     System.out.println("\nSorted by rollno");
	     for (int i=0; i<ar.size(); i++)
	        System.out.println(ar.get(i));
	
	     Collections.sort(ar, new Sortbyname());
	
	     System.out.println("\nSorted by name");
	     for (int i=0; i<ar.size(); i++)
	        System.out.println(ar.get(i));
	 }
}