package shoping;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart implements ShoppingRule {
	ArrayList<Product> al = new ArrayList<>();

	@Override
	public boolean put(Product prod) {

		return al.add(prod);
	}

	@Override
	public boolean pop(Product prod) {

		return al.remove(prod);
	}

	@Override
	public void listing() {
		System.out.println("----------------------------------------------------");
		Iterator<Product> it = al.iterator();
		while (it.hasNext()) {
			Product prod = it.next();
			System.out.printf("商品編號:%10s 商品名稱:%4s  價格:%3d ", prod.getBarCode(), prod.getName(), prod.getPrice());
			System.out.println();
			//System.out.println(prod.getName() + "---" + prod.getPrice());
		}
		System.out.println("----------------------------------------------------");

	}

	@Override
	public int cost() {
		int total = 0;
		Iterator<Product> it = al.iterator();
		while (it.hasNext()) {
			MyProduct prod = (MyProduct) it.next();
			total += prod.getRealPrice();

		}
		return total;
	}

}
