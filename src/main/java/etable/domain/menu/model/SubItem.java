package etable.domain.menu.model;

public class SubItem {

	private int csubitem;
	private int citem;
	private String subelemento;
	
	public SubItem() {
		
	}
	
	public SubItem(int csubitem, int citem, String subitem) {
		super();
		this.csubitem = csubitem;
		this.citem = citem;
		this.subelemento = subitem;
	}

	public int getCsubitem() {
		return csubitem;
	}

	public void setCsubitem(int csubitem) {
		this.csubitem = csubitem;
	}

	public int getCitem() {
		return citem;
	}

	public void setCitem(int citem) {
		this.citem = citem;
	}

	public String getSubitem() {
		return subelemento;
	}

	public void setSubitem(String subitem) {
		this.subelemento = subitem;
	}
	
}
