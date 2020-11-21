package theONE;


import java.util.Scanner;




public class OOPS {

	public static void main(String[] args) {
		
		
		Email e1 = new Email();
		e1.words();
		
		
		

	}

}
class Email{
	
   private	String name;
   private  String department;
	private String password;
	private int mailcapacity = 500;

	private String company = "company.com";
	

	void words(){
		Scanner n = new Scanner(System.in);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("COMPANY EMAIL GENERATING APPLICATION");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.println("First name: ");
		String name1 = n.nextLine();
		System.out.println("Last name: ");
		String name2 = n.next();
		var coname = name1 + " " + name2 ;
	    name = coname;
	    
	    department = Department();
	    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("Your Company Info");
	    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Name: " + name);
		System.out.println( "Department: " +  department.toUpperCase());
        System.out.println("Email: " + name1.toLowerCase() + "." + name2.toLowerCase() + "@" + department + "." +company);
		
		password = randpass(8);
		System.out.println("Your password: " + password);
		System.out.println("Mailbox Capacity: " + mailcapacity + "MB");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		
		
		
		

	
		
		
		
		
		
		
	}

  
 private String Department(){
	 System.out.println("......................................................................................................................................................................");
	 System.out.println(" DEPARTMENT CODE\n 1.Sales\n 2.Development\n 3.Accounting\n 4.None");
	 System.out.println("......................................................................................................................................................................");
	 System.out.println(" ENTER YOUR DEPARTMENT NUMBER: ");

	Scanner n = new Scanner(System.in);
	 int depart = n.nextInt();
	 System.out.println("......................................................................................................................................................................");
		

	

	
	
	 switch (depart) {
		
		case 1:
		  return "sales";
			
		case 2:
		  return "developer";
		    
		case 3:
		    return "accountant";
		   
		case 4:
		return	"  ";
		   
		   default:
			   return " Invalid Input !!";
		
		}
	 
	
	
	 
	 
 }	
 
 
 private String randpass(int length) {
	 String pass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
	 char[] Password = new char[length];
	 for( int  i=0;i<length;i++) {
		 
		 int ran =  (int) (Math.random()*pass.length()); 
		 Password[i] = pass.charAt(ran);
		  
	 }
	 return new String(Password);
 
 
 }
 
 
 
  
 
 }
 

 
 

	 
 
 
 

 

 
 
 
 
 
 
 
 