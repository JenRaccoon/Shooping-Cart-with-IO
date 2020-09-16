package shoping;
import java.util.ArrayList;
import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		String[] lines = Utility.readFile("files/ProductData.txt");
		ArrayList<MyProduct> prodList = new ArrayList<MyProduct>();
		//�N�ɮ�Ū�J�óЫ�Product����
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
		//��ЫإX��product������ʪ���
		Iterator<MyProduct> it = prodList.iterator();
		while (it.hasNext()) {
			it.next();
			cart.put(it.next());
		}
		//����ʪ����M��
		cart.listing();
		//����ʪ������B
		System.out.println("�ʪ����`���B:"+cart.cost());
		//�M���ɮפ��n�Q�R�����ӫ~�s��
		for (String line : lines) {
			if (line.charAt(0) == '-') {
				String barCode = line.substring(1);
				//System.out.println(barCode);
				Iterator<Product> it1 = cart.al.iterator();
				while (it1.hasNext()) {
					//���ӫ~�s���@�˪��q�ʪ����M�椺��
					MyProduct prod = (MyProduct)it1.next();
					if (barCode.equals(prod.getBarCode())) {
						cart.pop(prod);
					}
				}

			}
			
		}
		cart.listing();
		System.out.println("�ʪ����`���B:"+cart.cost()); 
		
	}

}
