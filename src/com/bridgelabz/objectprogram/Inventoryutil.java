package com.bridgelabz.objectprogram;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;

import com.bridgelabz.util.Utilityobject;

public class Inventoryutil {
	

	public static void main(String args[]) {
		
	try {
		JsonFactory jfactory = new JsonFactory();
		//write file //empty
		//String path=
	JsonGenerator jgenerator=jfactory.createJsonGenerator(new File("/home/admin1/eclipse-workspace/ObjectOrintedProgram/src/com/bridgelabz/objectprogram/inventory.json"),JsonEncoding.UTF8);
     
		jgenerator.writeStartObject();
		System.out.println("enter the filed");
		String file=Utilityobject.getString();
		jsonFile(jgenerator,file);
		jgenerator.writeEndObject();
		System.out.println("json file is created");
		jgenerator.close();
		
	}
	catch(Exception e) {
		e.printStackTrace();
		}
	}

	public static void jsonFile(JsonGenerator jgenerator,String filed) {
	try {
jgenerator.writeFieldName(filed);
jgenerator.writeStartArray();

	System.out.println("enter the number type you want");
	int n=Utilityobject.getInteger();
	int count=0;
	while(n>count) {
		System.out.println("enter the name");
		
		String name=Utilityobject.getString();
		
		System.out.println("enter the weigth");
		
		int weigth=Utilityobject.getInteger();
		
		System.out.println("enter the price");
		
		int price=Utilityobject.getInteger();
		
		jgenerator.writeStartObject();
		
		jgenerator.writeStringField("name", " "+name);
		jgenerator.writeNumberField("weigth", weigth);
		
		jgenerator.writeNumberField("price", price);
		jgenerator.writeEndObject();
		count++;
		
	}
	jgenerator.writeEndArray();
	}
	catch(JsonGenerationException e) {
	e.printStackTrace();	
	}
	catch(IOException e) {
		e.printStackTrace();	
	
	}
	}
}

	
	
	
	
	
	
	
	
	