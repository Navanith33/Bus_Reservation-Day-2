package first_project;
import java.util.*;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class bookings {
    String  passenger_name;
    int bus_no;
    Date date;
    bookings(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your Name :");
    	passenger_name=sc.nextLine();
    	System.out.println("Enter the Bus_no:");
    	bus_no=sc.nextInt();
    	System.out.println("Enter the date");
    	String s=sc.next();
    	SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    	try {
    	    date = format.parse(s);
    	} catch (ParseException e) {
    	    e.printStackTrace();
    	}

    	
    }
    public boolean isAvailable (ArrayList<bookings> booking,ArrayList<bus_details>buses) {
    	int capacity=0;
    	for(bus_details buss :buses) {
    		if(buss.getno()==bus_no) {
    			capacity=buss.getCapacity();
    		}
    	}
    	int booked=0;
    	for(bookings book :booking) {
    		if(book.bus_no== bus_no && book.date.equals(date)) {
    			booked++;
    		}
    	}
    	return booked<capacity?true:false;
    	
    	
    }
    public void DisplayInfo() {
		   System.out.println("Busno: "+bus_no+" Name: "+ passenger_name+" Date: "+date);
		   System.out.println();
	   }
    
    
}