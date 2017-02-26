package ua.com.lampshop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.lampshop.entity.Item;
import ua.com.lampshop.service.ItemService;

public class ItemEditor extends PropertyEditorSupport{
	
	private final ItemService itemService;

	public ItemEditor(ItemService itemService) {
		this.itemService = itemService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Item item = itemService.findOne(Long.valueOf(text));
		setValue(item);
	}
}
