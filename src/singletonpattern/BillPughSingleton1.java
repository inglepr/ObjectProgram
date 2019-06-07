package singletonpattern;

public class BillPughSingleton1 {
private static BillPughSingleton1 obj;
private BillPughSingleton1() {}
private static class Help{
	 private static final BillPughSingleton1 num=new BillPughSingleton1();
	
}
public BillPughSingleton1 getInstance() {
	return Help.num;
}
}
