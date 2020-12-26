package etable.infrastructure.menu.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import etable.domain.menu.model.Item;
import etable.domain.menu.model.SubItem;
import etable.domain.menu.repository.MenuRepository;
import etable.web.constants.querys.Query;

@Component
public class MenuRepositoryImpl implements MenuRepository{

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Autowired
	private MenuRowMapper row;

	@Override
	public List<Item> getItems() {
		String query = Query.selectFrom(Query.TABLE_MENUITEMS);
		List<Map<String, Object>> rows = this.jdbctemplate.queryForList(query);
		return row.mapRowItem(rows);
	}

	@Override
	public List<SubItem> getSubItems() {
		String query = Query.selectFrom(Query.TABLE_MENUSUBITEMS);
		List<Map<String, Object>> rows = this.jdbctemplate.queryForList(query);
		return row.mapRowSubItem(rows);
	}

	@Override
	public List<SubItem> getSubItemByItem(int citem) {
		String query = Query.selectFromWhere(Query.TABLE_MENUSUBITEMS, "CITEM", citem);
		List<Map<String, Object>> rows = this.jdbctemplate.queryForList(query);
		return  row.mapRowSubItem(rows);
	}

	@Override
	public List<Item> acceso(int id) {
		String query = "select distinct i.citem, i.item from tbtipousuariopermiso as tp "
				+ "inner join tbpermisos as p on tp.cpermiso = p.cpermiso "
				+ "inner join tbmenusubitems as sub on sub.csubitem = p.csubitem "
				+ "inner join tbmenuitems as i on i.citem = sub.citem where tp.ctipousuario = ?"; 
		return row.mapRowItem(this.jdbctemplate.queryForList(query, id));
	}
	
}
