package singletonpattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
	private static final long  serialVersionUID=1112213;
	private SerializedSingleton() {}
private static class  Serializationhelp{
	private static SerializedSingleton obj=new SerializedSingleton();
	
}
public static SerializedSingleton getInstance() {
	return Serializationhelp.obj;

	

	
}}

