package javaSe11;

public class Item {
	public String name;
	public int amount;
	public Item(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "name"
				+ name+ ", Amount: " + amount;
	}
}
