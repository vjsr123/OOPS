package Encapsulation;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the pin");
		int key = scan.nextInt();
		System.out.println("Enter the amount to withdraw");
		int amount = scan.nextInt();
		Bank b= new Bank();
		b.setData(key,amount);
		System.out.println(b.getData(amount, key));
	
		

	}

}
