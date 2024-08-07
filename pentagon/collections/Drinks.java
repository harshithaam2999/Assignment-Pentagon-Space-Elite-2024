package pentagon.collections;

public class Drinks 
{
  String type;
  String brand;
  double quantity;
  double price;
  
  public Drinks(String type, String brand, double quantity, double price) {
	super();
	this.type = type;
	this.brand = brand;
	this.quantity = quantity;
	this.price = price;
}
  
  public String toString() {
	return "Drinks Type  : " + this.type+"\n Brand :"+this.brand+"\n quantity :"+this.quantity+"\n price:"+this.price;
	
	  
  }
   
}
