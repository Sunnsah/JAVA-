// Program to read n numbers and store in ArrayList and find their sum, avg, 
//min and max
package first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class one {
	public static void main(String[] args) {
		int n, i, value, sum = 0;
		float avg;
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		
		System.out.println("Enter the lenght of the list: ");
		n = scan.nextInt();
		for(i = 0; i <n; i++) {
			value = scan.nextInt();
			numbers.add(value);
		}
		
		int min = numbers.get(0);
		int max = numbers.get(0);
		
		Iterator<Integer> iter = numbers.iterator();
		
//		sum calculation
		while(iter.hasNext()) {
			sum += iter.next();
			
		}
		
//		average calculation
		avg = (float)sum / n;
		
//		min and max  calculation
		for(i = 0; i < n; i++) {
			if(min > numbers.get(i)) {
				min = numbers.get(i);
			}
			else if(max < numbers.get(i)) {
				max = numbers.get(i);
			}
			else {
				continue;
			}
		}
		
		System.out.println("The sum of the numbers: " + sum);
		System.out.println("The average of the numbers: "+ avg);
		System.out.println("The min of the numbers: " + min);
		System.out.println("The max of the numbers: " + max);
		
	}
}
