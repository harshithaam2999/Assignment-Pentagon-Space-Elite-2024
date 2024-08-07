package pentagon.collections;

public class Watches {
    private String brand;
    private String type;
    private int price;
    private String gender; 

    public Watches(String brand, String type, int price, String gender) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.gender = gender;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getGender() {
        return gender;
    }

	@Override
	public String toString() {
		return "Watches brand=" + brand + ", type=" + type + ", price=" + price + ", gender=" + gender + "\n";
	}

    
}
