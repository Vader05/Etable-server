package etable.application.menu;

import java.util.List;

import etable.domain.menu.model.Item;
import etable.domain.menu.model.SubItem;

public interface MenuService {

	List<Item> getItems();
	List<SubItem> getSubItems();
	List<SubItem> getSubItemByItem(int citem);
	
	List<Item> accesoTipoUsuario(int id);
}
