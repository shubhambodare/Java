// A Simple Java program to demonstrate  
// Overriding and Access-Modifiers 
  
class Parentt 
{ 
    
    private void m1() { System.out.println("From parent m1()");} 
      
    protected void m2() { System.out.println("From parent m2()"); } 
} 
  
class Childd extends Parentt 
{ 
   
    private void m1() { System.out.println("From child m1()");} 
      
    
   
    public void m2() { System.out.println("From child m2()");} 
      
} 
  

class Main 
{ 
    public static void main(String[] args) 
    { 
        Parentt obj1 = new Parentt(); 
        obj1.m2(); 
        Parentt obj2 = new Childd(); 
        obj2.m2(); 
    } 
} 