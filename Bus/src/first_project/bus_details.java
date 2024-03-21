package first_project;

public class bus_details {
   private int bus_no;
   private boolean ac;
   private int capacity;
   private String from;
   private String to;
   
   
   public int getno() {
	   return bus_no;
   }
   public boolean ac() {
	   return ac;
   }
   public int getCapacity() {
	   return capacity;
   }
   public String  getpickup() {
	   return from;
   }
   public String  getdestination() {
	   return to;
   }
   public void setdestination(String t) {
	   to =t;
   }
   public void  setpickup(String g) {
	   from=g;
   }
   
   public void setac(boolean a){
	   ac=a;
   }
   public void setCapacity(int c){
	   capacity=c;
   }
   
   
   bus_details(int no,boolean a,int c,String f,String t){
	   this.bus_no=no;
	   this.ac = a;
	   this.capacity=c;
	   this.from=f;
	   this.to=t;
	   
   }
   public void DisplayInfo() {
	   System.out.println("Busno: "+bus_no+",AC/NONAC: "+ac+",Capacity: "+capacity+ ",pickup : "+from + ",destination : "+to+".");
	   System.out.println(); 
   }
   
}