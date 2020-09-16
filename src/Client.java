package shoping;
import java.util.ArrayList;
import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		String[] lines = Utility.readFile("files/ProductData.txt");
		ArrayList<MyProduct> prodList = new ArrayList<MyProduct>();
		//將檔案讀入並創建Product物件
		for (String line : lines) {
			//System.out.println(line);
			if (line.charAt(0) != '-') {
				String[] data = line.split(",");
				// System.out.println(data[0]);
				MyProduct prod = new MyProduct(data[0], data[1], Integer.parseInt(data[2]),
						Double.parseDouble(data[3]));
				cart.al.add(prod);
			}
		}
		//把創建出的product物件放物購物車
		Iterator<MyProduct> it = prodList.iterator();
		while (it.hasNext()) {
			it.next();
			cart.put(it.next());
		}
		//顯示購物車清單
		cart.listing();
		//顯示購物車金額
		System.out.println("購物車總金額:"+cart.cost());
		//尋找檔案中要被刪除的商品編號
		for (String line : lines) {
			if (line.charAt(0) == '-') {
				String barCode = line.substring(1);
				//System.out.println(barCode);
				Iterator<Product> it1 = cart.al.iterator();
				while (it1.hasNext()) {
					//比對商品編號一樣的從購物車清單內踢掉
					MyProduct prod = (MyProduct)it1.next();
					if (barCode.equals(prod.getBarCode())) {
						cart.pop(prod);
					}
				}

			}
			
		}
		cart.listing();
		System.out.println("購物車總金額:"+cart.cost()); 
		
	}

}
