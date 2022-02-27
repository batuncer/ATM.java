package com.qa.atm;

import java.util.Scanner;

public class atm {
	
	public static void balance() {
		
	
			int balance = 1000;
			int transaction;
			
			System.out.println("1:see balance");
			System.out.println("2:withdraw");
			System.out.println("3:exit");
			
			Scanner scan= new Scanner(System.in);
			transaction= scan.nextInt();
			
			switch(transaction) {
			
			
			case 1:
				
				System.out.println("your balance " + balance);
				
				break;

				
			case 2:
				System.out.println("withdraw");
				int miktar= scan.nextInt() ;
				
				balance -= miktar;
				if (balance>=miktar) {
				System.out.println("new balance " + balance );
				}
				else ;
				System.out.println("you dont have enough money");
				break;
				
			case 3:
				System.out.println("exit");
				break;
				
			
			default:
				System.out.println("invalid transaction");
			
			}
		}
			
	

	}
	


