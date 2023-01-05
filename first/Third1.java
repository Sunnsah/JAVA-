package first;

import java.util.Scanner;

public class Third1 {
//	private int stack[];
//	private int top, max;
//	Third1(int size) {
//		stack = new int[size];
//		max = 
//		
//	}
	private static int stack[];
	private static int  capacity, top;
	public static void main(String[] args) {
		int choice, value;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the maximum capacity of stack: ");
		capacity = scan.nextInt();
		stack = new int[capacity];
		top = -1;
		do {
			System.out.println("Enter 1 to push:");
			System.out.println("Enter 2 to pop:");
			System.out.println("Enter 3 to display stack:");
			System.out.println("Enter 4 to exit:");
			choice = scan.nextInt();
	
			switch(choice) {
			case 1:
				System.out.println("Enter the value to be pushed: ");
				value = scan.nextInt();
				push(value);
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Enter the valid choice...");
			}
			System.out.println("--------------------------");
		}while(choice != 4);
		
		
	}
	public static void createStack(int arr[]) {
		
	}
	public static void push(int value) {
		if(isFull()) {
			System.out.println("The Stack is full!!");
			return;
		}
		else {
			top = top + 1;
			stack[top] = value;
		}
		display();
	}
	public static void pop() {
		if(isEmpty()) {
			System.out.println("The Stack is empty!!");
			return;
		}
		else {
			System.out.println("The number popped: " + stack[top]);
			top = top - 1;
		}
	}
	
	public static void display() {
		if(isEmpty()) {
			System.out.println("No Entry in Stack!!");
			return;
		}
		for(int i = 0; i <= top; i++) {
			System.out.printf("Stack[%d]: %d\n", i, stack[i]);
		}
	}
	
	public static boolean isEmpty() {
		return top == -1;
	}
	
	public static boolean isFull() {
		return top == (capacity - 1);
	}
	
}
