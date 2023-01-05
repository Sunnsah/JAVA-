//Program to add, delete and update elements in HashMap Collection
package first;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		int choice;
		boolean status = true;
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> students = new HashMap<>();
		
		System.out.println("Enter 1 to add in the HashMap.");
		System.out.println("Enter 2 to add in the HashMap.");
		System.out.println("Enter 3 to add in the HashMap.");
		System.out.println("Enter 4 to Exit.");
		do {
			choice = scan.nextInt();			
			switch(choice) {
			case 1:
				insertElement(students);
				break;
			case 2:
				deleteElement(students);
				break;
			case 3:
				updateElement(students);
				break;
			case 4:
				status = false;
				break;
			default:
				System.out.println("Enter the valid number");
			}
			System.out.println("......................................");
			System.out.println("Enter your choice");
		}while(status);//loop till the user press 4
	}
	
//	Inserting an element
	public static void insertElement(HashMap<String, String> std) {
		Scanner scan = new Scanner(System.in);
		String key, value;
		System.out.println("Enter the Key:");
		key = scan.nextLine();
		System.out.println("Enter the Value:");
		value = scan.nextLine();
		std.put(key, value);
		traverse(std);
	}
	
//	Deleting an element
	public static void deleteElement(HashMap<String, String> std) {
		Scanner scan = new Scanner(System.in);
		String key;
		
//		Check if the collection is empty
		if(std.isEmpty()) {
			System.out.println("The Hashmap is empty!!");
			return;
		}
		System.out.println("Enter the Key of the element to be deleted:");
		key = scan.nextLine();
		if(!std.containsKey(key)) {
			System.out.println("Enter valid key..");
			deleteElement(std);
		}else {
			std.remove(key);			
		}
		traverse(std);
	}
	
//	Updating an element
	public static void updateElement(HashMap<String, String> std) {
		Scanner scan = new Scanner(System.in);
		String key, value;
		System.out.println("Enter the Key to be updated:");
		key = scan.nextLine();
		
//		Check if the collection is empty
		if(std.isEmpty()) {
			System.out.println("The collection is empty");
			return;
		}
		
		if(!std.containsKey(key)) {
			System.out.println("Enter valid key..");
			updateElement(std);
		}
		else {			
			System.out.println("Enter the Value:");
			value = scan.nextLine();
			std.replace(key, value);	
			System.out.println("The value is replaced");
		}
		traverse(std);
	}
	
//	Display the collection
	public static void traverse(HashMap<String, String> std) {
		std.forEach((key, value) -> System.out.println(key + ": " + value));          
	}
}
