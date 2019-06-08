package proxydesigpattern;

public class ProxyPatternClient {  
    public static void main(String[] args)   
    {  
        OfficeInternetAccess access = new ProxyInternetAccess("priyaingle");  
        access.grantInternetAccess();  
    }  
}  