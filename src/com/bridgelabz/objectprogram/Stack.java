package com.bridgelabz.objectprogram;


//import com.bridgelabz.structural.Stack.Node;

//import com.bridgelabz.structural.LinkedList;
public class Stack<T>
{
Node Top;
public class Node
{
	T data;   
	Node next;
	}

	


//add element
public void  push(T ch) {
	Node node=new Node();
	node.data=ch;
	node.next=Top;
	Top=node;
	}
/*
* peek element
*/
/* public T peek(T ch) {
	 if(Top==null) {
		 System.out.println("stack is empty");}
	 else {
		 Node n=Top;
		 
		 while(n.next!=null)
		 {
			 System.out.println(n.data);
		 }
		 n=n.next;
	 }
	return null;

	
	 /*
	  * check stack is empty or not
	  
	}
*/
public  T peek() {
	Node Top;
	Node node=new Node();
	Node head = null;
	if(head==null)
	{
		System.out.println("No element Found");
		return null;
	}
	return (T)head.data;
}
public boolean isempty() {
	 if(Top==null)
		 return false;
	 else 
		 return true;
	}
/*
*delete data from stack 
*/
/*
*   char pop()  
  { 
      if (top == -1)  
      { 
          System.out.println("Underflow error"); 
          return '\0'; 
      }  
      else 
      { 
          char element = items[top]; 
          top--; 
          return element; 
      } 
  } 
*/
public T pop()
{
	 if(Top==null) {
		System.out.println("");
		System.exit(0);
		}
	Top= Top.next;
	return null;

		 }
public void display() {
	
	
}
}
