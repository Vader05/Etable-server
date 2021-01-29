package etable;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import etable.application.menu.MenuServiceImpl;
import etable.domain.menu.model.Item;
import etable.domain.menu.model.SubItem;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MenuTest {
	
	@Autowired
	private MenuServiceImpl menuservice;
	
	@Test
	public void comprobarItems() {
		List<Item> items = menuservice.getItems();
		Assertions.assertThat(items.isEmpty()).isFalse();
		Assertions.assertThat(items.get(0).getItem()).isNotEqualTo(" ");
	}
	
	@Test
	public void comprobarsubItems() {
		List<SubItem> subitem = menuservice.getSubItems();
		Assertions.assertThat(subitem.isEmpty()).isFalse();
		Assertions.assertThat(subitem.get(0).getCsubitem()>=0).isTrue();
	}
	
	@Test
	public void comprobarGetSubItemByItem() {
		List<Item> items = menuservice.getItems();
		List<SubItem> subitem = menuservice.getSubItemByItem(items.get(0).getCitem()); 
		Assertions.assertThat(subitem).isNotEmpty();
	}
	
	@Test
	public void comprobarAccesoTipoUsuario() {
		List<Item> item = menuservice.accesoTipoUsuario(1);
		Assertions.assertThat(item.get(0).getItem()).isEqualTo("Administración del Sistema");
		Assertions.assertThat(item.get(0).getCitem()).isEqualTo(1);
		Assertions.assertThat(item.size()).isEqualTo(6);
	}

}
