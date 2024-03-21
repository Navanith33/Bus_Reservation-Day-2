package first_project;
import java.util.Scanner;
import java.util.ArrayList;

public class bus_demo {
	public static void main(String[] args) {
		
		int userInput=1;
		Scanner sc = new Scanner(System.in);
		ArrayList<bus_details> buses= new ArrayList<>();
		ArrayList<bookings> bookings= new ArrayList<>();
		buses.add(new bus_details(1,true,1,"coimbatore","chennai"));
		buses.add(new bus_details(2,true,2,"chennai","coimbatore"));
		buses.add(new bus_details(3,false,1,"trichy","salem"));
		for(bus_details b : buses) {
			b.DisplayInfo();
		}
		while(userInput==1) {
			System.out.println("Enter 1 to bookings,2 to exit and 3 to cancel booking");
			userInput=sc.nextInt();
			if(userInput==1) {
				bookings booking = new bookings();
				if(booking.isAvailable(bookings,buses)){
					bookings.add(booking);
					System.out.println("Your booking is Successful");	
				}
				else {
					System.out.println("Sorry the bus is full");
				}
			}
			
			
		}
		if(userInput==3) {
			cancel can = new cancel();
			if(can.isCancel(bookings)) {
				System.out.println("Cancellation is Successfull");
				
			}
			else {
				System.out.println("You have entered wrong booking details");
			}
		}
		System.out.println("Thanks for your visit");
		for(bookings b:bookings) {
			b.DisplayInfo();
		}
		
		 
	}

}