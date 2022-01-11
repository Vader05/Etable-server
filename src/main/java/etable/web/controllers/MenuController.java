package etable.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import etable.application.menu.MenuService;
import etable.domain.menu.model.Item;
import etable.domain.menu.model.SubItem;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/api/mainMenu"})
public class MenuController {

	@Autowired
	private MenuService service;
	
	@GetMapping(path = {"/listMenuItems"})
	public List<Item> getMenuItems() {
		return this.service.getItems();
	}
	
	@GetMapping(path = {"/listMenuSubItems"})
	public List<SubItem> getMenuSubItems() {
		return this.service.getSubItems();
	}
	
	@GetMapping(path = {"/listMenuSubItems/{id}"})
	public List<SubItem> getMenuSubItemsByItem(@PathVariable int id) {
		return this.service.getSubItemByItem(id);
	}
	
	@GetMapping(path = {"/listMenuItems/acceso/{id}"})
	public List<Item> accesoSistemaByTipoUsuario(@PathVariable int id) {
		return this.service.accesoTipoUsuario(id);
	}
}
