    class Employee{  
     int bonus=1000;  
    } 
 	
    class Fulltime extends Employee{  
     int salary=30000;  
	char[] Name = { 'R', 'A', 'M' };
      String Na = new String(Name);  
	int total=bonus+salary;
    }  
      
class Parttime extends Employee{  
     int salary=15000;  
     char[] Name = { 'K', 'U', 'M', 'A', 'R' };
      String Na = new String(Name);
	int total=bonus+salary;
    } 

class TEST{
public static void main(String args[]){  
       Parttime p=new Parttime();  
	System.out.println("Parttime Employee Details");
	System.out.println("Employee name is:"+p.Na);
       System.out.println("Employee salary is:"+p.salary);  
       System.out.println("Employee Bonus is:"+p.bonus);  
	System.out.println("Total employee salary is:"+p.total);
	System.out.println("\n");
	Fulltime t=new Fulltime();
	System.out.println("Fulltime Employee Details");
	System.out.println("Employee name is:"+t.Na);
	System.out.println("Employee salary is:"+t.salary);  
       System.out.println("Employee bonus is:"+t.bonus);
	System.out.println("Total employee salary is:"+t.total);
    }  
}
