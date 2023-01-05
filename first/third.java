//Program to implement stack operations using library function
package first;

import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;

public class third {
	public static void main(String[] args) {
		int choice, value;
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		do {
			System.out.println("Enter 1 for Push operation.");
			System.out.println("Enter 2 for Pop operation.");
			System.out.println("Enter 3 for displaying elements in stack.");
			System.out.println("Enter 4 to exit");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the number to push.");
				value = scan.nextInt();
				stack.push(value);
				break;
			case 2:
				value = stack.pop();
				System.out.println("The data popped: " + value);
				break;
			case 3:
				Iterator iter = stack.iterator();
				System.out.println("The elements in stack are: ");
				while(iter.hasNext()) {
					System.out.printf("%d\t", iter.next());
				}
				System.out.println();
				break;
			case 4:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid choice...");
			}
		}while(choice != 4);
		
	}
}
