package shoping;

public interface ShoppingRule {
	public boolean put(Product prod); //買東�?
	public boolean pop(Product prod); //不買
	public void listing(); //清單:?��??��?�稱.?��?��
	public int cost(); //費用
}
