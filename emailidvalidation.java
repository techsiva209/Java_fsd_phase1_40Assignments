import java.util.Scanner;

public class emailidvalidation {

	public boolean validate(String emailid, String password){
		if(emailid.equalsIgnoreCase("helloworld@gmail.com") && password.equals("Hello@4321"))
			return true;
		else
			return false;	}
	public static void main(String args[]){
		emailidvalidation obj=new emailidvalidation();
		int i=1;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter emailid");
			String userid=sc.nextLine();
		System.out.println("Enter password");
		String passwd=sc.nextLine();
		
		if(obj.validate(userid.trim(), passwd.trim())){
			System.out.println("Welcome");
			break;
		}
		else
		{
				if(i!=3)
			System.out.println("Enter correct emailid and password");
				
		}
		i++;
		}while(i<=3);
	}
	}

