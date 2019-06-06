package singletonpattern;

public class EagerInitializedSingleton {
private static final EagerInitializedSingleton instance=new EagerInitializedSingleton();
private  EagerInitializedSingleton() {}

public  EagerInitializedSingleton getinstance() {
	return instance;
}
}
