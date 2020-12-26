package etable.domain.menu.repository;

import java.util.List;

import etable.domain.menu.model.Item;
import etable.domain.menu.model.SubItem;

public interface MenuRepository {

	List<Item> getItems();
	List<SubItem> getSubItems();
	List<SubItem> getSubItemByItem(int citem);
	List<Item> acceso(int id);
}
