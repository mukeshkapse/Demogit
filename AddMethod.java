package Bridgelab.Class.Collectoin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class AddMethod {
	public static void main(String[] args) {
		Collection<String> Student = new LinkedList<String>();
		//add student
		Student.add("ayush");
		Student.add("Mohit");
		Student.add("ravi");
		
		System.out.println("Students are "+Student);
		//Student.add("this is the list end");
		//System.out.println("list is "+Student);
	
		//creating new collection and add other student
	      Collection newstudent = new ArrayList();
	      newstudent.add("Kartik");
	      newstudent.add("Rahul");
	      newstudent.add("lokesh");
	      // add all
	      Student.addAll(newstudent);
	      System.out.println("LinkedList with extend element" + Student);
	      //remove 
	      newstudent.remove("lokesh");
	      // print the new list
	      System.out.println("Remove " +newstudent);
	     
	}

}
