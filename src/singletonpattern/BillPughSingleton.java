package singletonpattern;

public class BillPughSingleton {
private BillPughSingleton() {};//default constructor
//private inner class
public static class SingletonHelper{
private static final	BillPughSingleton instance=new BillPughSingleton();
	
}
public  BillPughSingleton getInstance() {
	return SingletonHelper.instance;
}
}
