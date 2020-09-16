package shoping;

public class MyProduct extends Product {
	private double discount;

	public MyProduct(String barCode, String name, int price, double discount) {
		super(barCode, name, price);
		setDiscount(discount);

	}
	public int getRealPrice() {
		return (int)(getPrice()*(1-discount));
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
