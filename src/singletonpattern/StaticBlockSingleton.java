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
}
