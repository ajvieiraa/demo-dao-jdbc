package application;

import java.util.Scanner;

public class test {
	public static void Main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if ( n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        }
		
		System.out.println();
	}
}
