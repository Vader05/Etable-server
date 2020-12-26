package etable.application.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etable.domain.menu.model.Item;
import etable.domain.menu.model.SubItem;
import etable.domain.menu.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	private MenuRepository repository;
	

	@Override
	public List<Item> getItems() {
		return this.repository.getItems();
	}

	@Override
	public List<SubItem> getSubItems() {
		return this.repository.getSubItems();
	}

	@Override
	public List<SubItem> getSubItemByItem(int citem) {
		return this.repository.getSubItemByItem(citem);
	}

	@Override
	public List<Item> accesoTipoUsuario(int id) {
		return this.repository.acceso(id);
	}
	
	
}
