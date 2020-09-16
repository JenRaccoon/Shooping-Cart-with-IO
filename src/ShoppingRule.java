package shoping;

public interface ShoppingRule {
	public boolean put(Product prod); //è²·æ±è¥?
	public boolean pop(Product prod); //ä¸è²·
	public void listing(); //æ¸…å–®:?”¢??å?ç¨±.?ƒ¹? ¼
	public int cost(); //è²»ç”¨
}
