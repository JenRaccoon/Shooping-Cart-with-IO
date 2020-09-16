package shoping;

public class Product {
	private String barCode; //����Ⅳ
	private String name; //����迂
	private int price; //����
	
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public Product(String barCode, String name, int price) {
		this.barCode = barCode;
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
