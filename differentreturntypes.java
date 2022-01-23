public class differentreturntypes {
	// Declare a method with return type int. 
	  int m1()
	  { 
	   System.out.println("m1 method"); 
	// If you declare a method to return a value, you must return a value of declared type. Since the return type of m1() method is an integer. So, we will have to return an integer value. 
	      return 80; 
	} 
	// Similarly
	  float m2() 
	  { 
	    System.out.println("m2 method"); 
	      return 87.5f; 
	  }
	      static char m3()
	      { 
	        System.out.println("m3 method"); 
	         return 'r'; 
	      } 
	    public static void main(String[] args)
	     { 
	    // Create an object of the class named differentreturntypes. 
	       differentreturntypes s = new differentreturntypes();
	     
	    // Call m1() method using reference variable s. Since s.m1() is returning an integer value, we will store value by using a variable x with a data type int. 
	          int x = s.m1(); 
	    // Now print the return value. 
	        System.out.println("Return value of m1()= " +x); 
	   // Similarly,
	        float y = s.m2();
	        System.out.println("Return value of m2()= " +y); 
	     // Call static method using the class name. Since m3() method returns character, we will store a character using a variable ch with type char. 
	        char ch = differentreturntypes.m3(); 
	        System.out.println("Return value of m3()= " +ch); 


	  }
}


