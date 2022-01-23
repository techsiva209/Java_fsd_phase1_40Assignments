public class ConstructorUses1 {

	public int data;
	public double d;
  public static void main(String[] args) {
	
	  ConstructorUses1 c=new ConstructorUses1(83, 87.0);
	  System.out.println("parameterized constructor");  //parameterized constructor
	  System.out.println(c.data);
	  System.out.println(c.d);
	 
	  ConstructorUses2 c1=new  ConstructorUses2();
			  System.out.println("default constructor"); //Default constructor
			  System.out.println(c1.data);
			  System.out.println(c1.name);
	 
			  
			  
	  
}
public ConstructorUses1(int data,double d) {
	
	this.data = data;
	this.d = d;
}
  
}
