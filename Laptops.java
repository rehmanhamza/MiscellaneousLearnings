package learning;

public class Laptops implements Comparable<Laptops>{
	private String brand;
	private int ram;
	private int price;
	
	
	public Laptops(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Laptops [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Laptops o) {
		if(this.getRam() > o.getRam())
			return 1;
		else 
			return -1;
	
	}
	
	
}
