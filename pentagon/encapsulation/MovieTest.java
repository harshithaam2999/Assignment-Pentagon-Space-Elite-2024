package pentagon.encapsulation;

class Movies
{
	 String movieName;
	 private double price;  //by making data memebers as private
	 private String movieCategory;
	 private String language;
	 private int noofTickets;
	 private int totalPrice;
	 private int availableTickets;
	 
	 public int getNoofTickets() 
	 {
		return noofTickets;
	 }
	public void setNoofTickets(int noofTickets) 
	{
		this.noofTickets = noofTickets;
	}
	public double getTotalprice() 
	{
		return price*noofTickets;
	}
	public void setTotalprice(int totalprice)
	{
		this.totalPrice = totalprice;
	}
	public int getAvailabletickets()
	{
		return availableTickets;
	}
	public void setAvailabletickets(int availabletickets) 
	{
		this.availableTickets = availabletickets;
	}
	
	  
	 public void setMovieName(String movieName) // by making memeber functiosn as public 
	 {
		 this.movieName=movieName;
	 }
	 public void setprice(double price) 
	 {
		 this.price=price;
		 
	 }
	 public void setmovoieCategory(String movieCategory)
	 {
		 this.movieCategory=movieCategory;
	 }
	 public void setlanguage(String language) 
	 {
		 this.language=language;
	 }
	 public String getMovieName() 
	 {
		 return movieName;
	 }
	 public double getprice() 
	 {
		 return price;
	 }
	 public String getmovieCategory() 
	 {
		 return movieCategory;
	 }
	 public String getlanguage()
	 {
		 return language;
	 }
	 public void setTotalPrice(int totalPrice)
	 {
		 this.totalPrice = totalPrice*noofTickets;
	 }
	 public double getTotalPrice()
	 {
		return totalPrice;
		 
	 }
	 public int getfinalTicketsAvailable() 
	 {
		return availableTickets - noofTickets;
		 
	 }
	 
}
public class MovieTest {

	public static void main(String[] args) 
	{
		Movies movie1 = new Movies();
		
		movie1.setMovieName("Vikrant Rona");
		
		movie1.setmovoieCategory("Horor");
		
		movie1.setlanguage("Kannada");
		
		movie1.setprice(250);
		
		movie1.setAvailabletickets(50);
		
		movie1.setNoofTickets(10);
		
		movie1.setTotalprice(300);
		
		System.out.println("*****Movie Deatils*****");
		
		System.out.println();
		
		System.out.println("Movie Name : " + movie1.getMovieName());
		
		System.out.println("Movie Category : " + movie1.getmovieCategory());
		
		System.out.println("Movie Language : " + movie1.getlanguage());
		
		System.out.println("Movie Price " + movie1.getprice());
		
		System.out.println("Available Tickets : " + movie1.getAvailabletickets());
		
		System.out.println("No Of Tickets : "+ movie1.getNoofTickets());
		
		System.out.println("Total Price :" + movie1.getTotalprice());
		
		System.out.println("Final Available Tickets : " + movie1.getfinalTicketsAvailable());
		
			
		}

	}

