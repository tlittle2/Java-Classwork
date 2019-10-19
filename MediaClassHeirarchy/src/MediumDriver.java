/**
 * @author Trevor Little
 * @version 2/25/19
 * Media Class Heirarchy
 * This is the driver where all methods for all classes will be tested. 
 */



import java.util.ArrayList;

public class MediumDriver {

	public static void main(String[] args) {
		
		Time gt1= new Time(4, 3, 2);
		Time gt2= new Time(4, 5, 2);
		Time gt3= new Time(4, 3, 2);
			
			System.out.println(gt1.hashCode());
			System.out.println(gt2.hashCode());
			System.out.println(gt3.hashCode());
			
			System.out.println(gt1.equals(gt3));
			System.out.println(gt2.equals(gt3));
			
			
			System.out.println(gt1.getHours());
			System.out.println(gt1.getMinutes());
			System.out.println(gt1.getSeconds());
			
			System.out.println(gt1.getTotalInSeconds());
			
			System.out.println(gt1.toString());
			
			
			System.out.println();
				
		
		Video v1= new Video("IBM", "Trevor Little", 2019, 139, 15.6);
		Video v2= new Video("IBM", "Trevor Little", 2019, 139, 15.6);
		Video v3= new Video("Computer Systems", "Trevor Little", 2019, 139, 15.6);
		
		
		 	System.out.println(v1.hashCode());
			System.out.println(v2.hashCode());
			System.out.println(v3.hashCode());
			
			System.out.println(v2.equals(v1));
			System.out.println(v2.equals(v3));	 
		 
			System.out.println(v1.toString());
			
			System.out.println(v1.getTitle());	
				v1.setTitle("Computer Systems");
					System.out.println(v1.getTitle());
								
			System.out.println(v1.getCreator());	
				v1.setCreator("Blake Little");
					System.out.println(v1.getCreator());
					
			System.out.println(v1.getYear());	
				v1.setYear(2020);
					System.out.println(v1.getYear());
			
			System.out.println(v1.getDuration());	
				v1.setDuration(145);
					System.out.println(v1.getDuration());
			
			System.out.println(v1.getResolution());	
				v1.setResolution(20.0);
					System.out.println(v1.getResolution());			
			
			System.out.println();
		
		Audio a1= new Audio("Free Fallin", "Tom Petty", 1977, 180, 5);
		Audio a2= new Audio("Free Fallin", "Tom Petty", 1977, 180, 5);
		Audio a3= new Audio("Learning to Fly", "Tom Petty", 1977, 180, 5);
		
		
		 
		 	System.out.println(a1.hashCode());
		 	System.out.println(a2.hashCode());
		 	System.out.println(a3.hashCode());
		 	
		 	System.out.println(a1.equals(a2));
		 	System.out.println(a2.equals(a3));
		 	
		 	System.out.println(a1.toString());
		 	
			System.out.println(a1.getTitle());
				a1.setTitle("Hotel California");
					System.out.println(a1.getTitle());
			
			System.out.println(a1.getCreator());
				a1.setCreator("Eagles");
					System.out.println(a1.getCreator());
			
			System.out.println(a1.getYear());
				a1.setYear(1975);
					System.out.println(a1.getYear());
					
			System.out.println(a1.getDuration());
				a1.setDuration(3600);
					System.out.println(a1.getDuration());
					
			System.out.println(a1.getDecibelLevel());
					a1.setDecibelLevel(7);
					System.out.println(a1.getDecibelLevel());
					
			System.out.println(a1.toString());

			
			System.out.println();
			
		Print p1= new Print("Harry Potter", "J.K Rowling", 2000, 500);
		Print p2= new Print("Career of Evil", "J.K Rowling", 2000, 500);
		Print p3= new Print("Harry Potter", "J.K Rowling", 2000, 500);
		
		 	System.out.println(p1.hashCode());
		 	System.out.println(p2.hashCode());
		 	System.out.println(p3.hashCode());
		 
			System.out.println(p1.equals(p2));
			System.out.println(p3.equals(p1));
			
			System.out.println(p1.toString());
		 
			System.out.println(p1.getTitle());
				p1.setTitle("Stand by Me");	
					System.out.println(p1.getTitle());
					
			System.out.println(p1.getCreator());
				p1.setCreator("Stephen King");	
					System.out.println(p1.getCreator());
					
			
			System.out.println(p1.getYear());
				p1.setYear(1983);	
					System.out.println(p1.getYear());
					
					
			System.out.println(p1.getNumberOfPages());
				p1.setNumberOfPages(1000);
					System.out.println(p1.getNumberOfPages());
								
			System.out.println();
				
		ArrayList<Medium> Media= new ArrayList<Medium>();
		Media.add(v1);
		Media.add(a1);
		Media.add(p1);
		for(Medium i: Media) {
			System.out.println(i);
		}
		
	}

}
