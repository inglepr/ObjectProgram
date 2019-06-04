package com.bridgelabz.objectprogram;
/*
 * 
 *  Queue for Bankcash
 */
import com.bridgelabz.util.Utilityobject;
public class Queue <T> {
	static String arr[];
	static int total;
	static int front;
	static int rear;
	static int count;
	public static int amount=100;
	
	
public  Queue (){
		int size = 0;
		String []arr=new String[size];
		front=0;
		rear=-1;
		total=size;
		count=0;
	}
	public static int size() {
		return total;
	}
	/*
	 * purpose to display 
	 */
	public static void display() {
		if(front>rear) {
			System.out.println("Queue is empty");	
		}
		for(int i=front;i<rear;i++) {
			System.out.println(arr[i]);
		}
	}
	/*
	 * purpose to check it is empty or not
	 */
	public static boolean isempty() {
		return (size()==0);
	}
	/*
	 * purpose to check it is full or not
	 */
	public static boolean isFull() {
		return (size()==total);
	}
	/*
	 * purpose to withdraw amount
	 */
	public static int withdraw(int money) {
		if(amount>money) {
			amount=amount-money;
			return amount;
		}
		else {
			System.out.println("Amount exceeded");
			return 0;
		}
	}
	/*
	 * purpose to deposit amount
	 */
	public static int credit(int money) {
		amount=amount+money;
		return amount;
	}
	/*
	 * purpose to add amount in queue
	 */
	public static void enqueue(String item) {
		if(isFull()) {
			System.out.println("No space for adding ");
		}
		else {
		System.out.println("Adding to queue "+item);
		rear=(rear+1)%total;
		arr[rear]=item;
		count++;
	}}
	/*
	 * purpose to delete amount in queue
	 */
	public static void dequeue() {
		if(isempty()) {
			System.out.println("Amount in the bank: "+ amount);
		}
	//	System.out.println("Removing amount from account " +arr[front]);
		front=(front+1)%total;
		count--;
	}
	public static String peek() {
		if(isempty()) {
			System.out.println("Transaction successfull");
			return null;
		}
		return arr[rear];
	} 
	public static String transaction(int n) {
		int money;
		if(isempty()) {
			System.out.println("Amount is unavailable");
			return null;
		}
		switch(n) {
		case 1:
			System.out.println("Enter money to add");
			money=Utilityobject.getInteger();
			credit(money);
			System.out.println(peek()+" add amount in your account");
			System.out.println("Amount is added "+ amount);
			break;
		case 2:
			System.out.println("Enter withdrawl amount");
			money=Utilityobject.getInteger();
			withdraw(money);
			System.out.println(peek()+" amount is withdrawl");
			System.out.println("Amount is "+amount);
			break;
		}
		return arr[front];
	
		
	}
	public void enqueue(int i) {
		// TODO Auto-generated method stub
		
	}
}