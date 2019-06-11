package singletonpattern;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

   public static void main(String[] args) {
	   //Eager class public instance
	   EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getnstance(); 
	 EagerInitializedSingleton obj1=null;//null instance by eager class 
	 try {
		 Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
		 for(Constructor const1:constructors) {
			 const1.setAccessible(true);
			 obj1 = (EagerInitializedSingleton) const1.newInstance();
			 break;
		 }}
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 System.out.println(instanceOne.hashCode());
	 System.out.println(obj1.hashCode());
	 }
	    }

