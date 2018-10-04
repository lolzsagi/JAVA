class PI1 
{ 
    
    void show(int a,int b) 
    { 	
	System.out.println("Two Parameters");
        System.out.println(a); 
	System.out.println(b);
    }  
      
    void show(int a,double b,int c) 
    { 
	System.out.println("Three Parameters");
        System.out.println(a); 
	System.out.println(b);
	System.out.println(c);
    } 

}
  

class superkey
{ 
  
    public static void main(String args[]) 
    { 
        PI1 d = new PI1(); 
        d.show(3,6);
	d.show(6,6.6,6); 
    } 
} 
