package first_project;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class cancel {
	int bus_no;
	String name;
	Date date;
	
	cancel(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bus_no:");
		this.bus_no=sc.nextInt();
		System.out.println("Enter your name:");
		this.name=sc.next();
		System.out.println("Enter the booked Date:");
		String s = sc.next();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    	try {
    	    date = format.parse(s);
    	} catch (ParseException e) {
    	    e.printStackTrace();
    	}
		
		
	}
	public boolean isCancel(ArrayList<bookings> booking) {
	    boolean change = false;
	    Iterator<bookings> iterator = booking.iterator();
	    
	    while (iterator.hasNext()) {
	        bookings book = iterator.next();
	        if (book.bus_no == bus_no && book.date.equals(date)&&book.passenger_name.equals(name)) {
	            iterator.remove(); 
	            change = true;
	        }
	    }
	    
	    return change;
	}
	 

    	
    	
    }

