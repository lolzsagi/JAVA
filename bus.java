interface PI1 
{ 
    
    default void show() 
    { 
        System.out.println("Default PI1"); 
    } 
} 
  
class PI2 implements PI1
{ 
    
    public void show() 
    { 
        
        PI1.super.show(); 
  
        
    } 
} 
  

class TestClass1 implements PI1
{ 
   
    public void show() 
    { 
        
        PI1.super.show(); 
  
        
    } }
class bus
{
public static void main(String args[]) 
    { 
        TestClass1 d = new TestClass1(); 
        d.show(); 

        PI2 e = new PI2();
	e.show();    
} }
  
    
