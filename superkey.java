class PI1 
{ 
    
    void show() 
    { 
        System.out.println("Default PI1"); 
    } 
} 
  
class PI2 extends PI1
{ 
    
    void show() 
    { 
        System.out.println("Default PI2"); 
    } 
void play()
{
super.show();
show();
} 
}
  

class superkey
{ 
  
    public static void main(String args[]) 
    { 
        PI2 d = new PI2(); 
        d.play(); 
    } 
} 
