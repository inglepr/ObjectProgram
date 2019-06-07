package singletonpattern;

public class StaticBlockSingleton {
private static StaticBlockSingleton instance;
private StaticBlockSingleton() {};
static {
	try {
		new StaticBlockSingleton();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}
public StaticBlockSingleton getInstance() {
	return instance;
	
}
}//
//public static int count; //static variable
//public static void setMethod(int count){ 
// this.count=count;}
