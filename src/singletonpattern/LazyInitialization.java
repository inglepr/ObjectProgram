package singletonpattern;

public class LazyInitialization {
private static LazyInitialization instance;
private LazyInitialization() {}//Default constructor
private  static LazyInitialization getInstance(int instamnce) {
if(instance==null) {
	instance=new LazyInitialization();
}
return instance;
	
}
}