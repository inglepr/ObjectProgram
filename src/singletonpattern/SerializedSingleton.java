package singletonpattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{
private static final long SerialUID=-7604766932017737115L;
private SerializedSingleton() {}
public static class SingletonHelper{
	 private static final SerializedSingleton instance = new SerializedSingleton();
}
public static  SerializedSingleton getinstance() {
	return SingletonHelper.instance;
	
}
}

