package etable.infrastructure.menu.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import etable.domain.menu.model.Item;
import etable.domain.menu.model.SubItem;

@Component
public class MenuRowMapper implements RowMapper {

	public List<Item> mapRowItem(List<Map<String, Object>> rows){
		List<Item> items = new ArrayList<>();
		for(Map<String, Object> row: rows) {
			int citem = Integer.parseInt(row.get("CITEM").toString());
			String item = row.get("ITEM").toString();
			Item i = new Item(citem, item);
			items.add(i);
		}
		return items;
	}
	
	public List<SubItem> mapRowSubItem(List<Map<String, Object>> rows){
		List<SubItem> subitems = new ArrayList<>();
		for(Map<String, Object> row: rows) {
			int csubitem = Integer.parseInt(row.get("CSUBITEM").toString());
			int citem = Integer.parseInt(row.get("CITEM").toString());
			String subitem = row.get("SUBITEM").toString();
			SubItem si = new SubItem(csubitem, citem, subitem);
			subitems.add(si);
		}
		return subitems;
	}
	
	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		return new int[0];
	}
}
