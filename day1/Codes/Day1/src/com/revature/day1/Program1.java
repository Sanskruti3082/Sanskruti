package com.revature.day1;

import java.util.HashSet;
import java.util.Scanner;

public class Program1 {
public static void main(String[] args) {
	
	HashSet<String> usernames=new HashSet<>();
	Scanner sc=new Scanner(System.in);
	String input;
	
	//adding usernames
	  System.out.println("Enter usernames (type 'exit' to stop):");
	
	  while(true) {
		  input=sc.nextLine();
		  if(input.equalsIgnoreCase("exit")) {
			  break;
		  }
		  
		  boolean isAdded= usernames.add(input);
		  if(isAdded) {
			  System.out.println("Added");
		  }
		  else {
			  System.out.println("Exists already");
		  }
		  
	  }
	  
	  //checking if user exists
	  System.out.println("Enter username to check");
	  input=sc.nextLine().trim(); //trim is used so that it doesnt take partial name
	  boolean exists=usernames.contains(input);
	  if(exists) {
		  System.out.println("Username exists");
	  }
	  else {
		  System.out.println("Username Does not exists");
	  }
	  
	  //removing
	  System.out.println("Enter username to remove");
	  input=sc.nextLine();
	  boolean isRemoved=usernames.remove(input);
	  
	  if(isRemoved) {
		  System.out.println("Removed user Successfully");
	  }
	  else {
		  System.out.println("Username Doesnot exists");
	  }
	  
	  System.out.println("Current usernames"+usernames);
}
}

/*
 * Scenario 1: Choosing the Right Collection
You are developing an application where you need to store a collection of unique usernames. 
These usernames will be frequently checked for existence and occasionally added or removed. Which Java collection would you choose and why?
Answer:The best choice would be HashSet. HashSet is ideal because it stores elements in a hash table, ensuring that each element is unique (no duplicates). 
Checking for existence (contains operation) is very efficient (average O(1) time complexity), and adding/removing elements is also efficient (average O(1) amortized time complexity). 
This makes it suitable for storing unique usernames with good performance characteristics.
 */
