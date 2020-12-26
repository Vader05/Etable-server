package etable.domain.menu.model;

public class Item {
	private int citem;
	private String elemento;
	
	public Item() { }
	
	public Item(int citem, String item) {
		super();
		this.citem = citem;
		this.elemento = item;
	}
	
	public int getCitem() {
		return citem;
	}
	public void setCitem(int citem) {
		this.citem = citem;
	}
	public String getItem() {
		return elemento;
	}
	public void setItem(String item) {
		this.elemento = item;
	}
	
}
