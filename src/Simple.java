
class Simple{}  
  
class Test{  
 public static void main(String args[]){  
  Class c = null;
try {
	c = Class.forName("Simple");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}  
  System.out.println(c.getName());  
 }  
}  


