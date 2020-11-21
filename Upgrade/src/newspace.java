

import java.util.Scanner;


public class newspace {
	





	



	public static void main(String[] args) {
		
//	    Scanner n = new Scanner(System.in);
//		System.out.println("MARKS PERCENTAGE " + "\n" + "Marks: ");
//		float mark = n.nextFloat();
//		System.out.println("Total: ");
//		float total = n.nextFloat();
//		System.out.println("Your Marks Percentage: " + percent(mark,total));
//		
		
		
		
		// My best effort till Nov 2 ..................................................................

    	Scanner n = new Scanner(System.in);
		System.out.println("SCHOLARSHIP FOR MERITORIOUS STUDENTS" +"\n" + "12th Percentage: ");
		float per = n.nextFloat();
		
	
			
        var one = "Congrats you are eligible for";
        
        
        try {
		
		
		if(per > 95) {
			
			System.out.println(one + " 100% scholarship on tuition fees ");
		}
		
		if (per <= 95 && per >85) {
			System.out.println(one + " 85% scholarship on tuition fees");
		}
		
		if (per <= 85 && per >80) {
			System.out.println(one + " 70% scholarship on tuition fees");
			
		}
		
		if (per <=80 && per >= 75) {
			
			System.out.println(one + " 60% scholarship on tuition fees");
	
		
		}
		
		if (per<74 && per >=0) {
			
			System.out.println("Sorry not eligible for scholarship must have least 75%");
		}
		

        }catch(Exception e) {
        	
        	System.out.println("Something is wrong with input ");
        	System.out.println(e.getLocalizedMessage());
        	
        	
        }

		
		
		
		// PROJECT FLAMES Nov 3......................................................................................................
		
//		Scanner n = new Scanner(System.in);
//		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
//		System.out.println("FLAMES TEST");
//		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
//		System.out.println("\n" + "First Person: ");
//		String fp = n.nextLine();
//		
//		System.out.println("Second Person: ");
//		String sp = n.next();
//		
//		String[] flames = {
//			
//				"Friends ",
//				"Love ",
//				"Arrange Marriage",
//				"Marriage",
//				"Enemy",
//				"Sister"
//			
//		};
//				
//				
//		var flame = flames[(int) Math.floor(Math.random()*flames.length)];
//		
//		System.out.println("Congrats " + fp + " and " + sp + " are " + flame ); 
//		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
	static float percent(float a, float b) {
		 
		 float start = (a/b)*100;
		 return start;
 } 
		 
	 
	
	

}
