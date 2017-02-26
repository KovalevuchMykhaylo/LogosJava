package ua.com.lampshop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.lampshop.entity.PlinthType;
import ua.com.lampshop.service.PlinthTypeService;

public class PlinthTypeEditor extends PropertyEditorSupport{
	
	private final PlinthTypeService plinthTypeService;
	
	public PlinthTypeEditor(PlinthTypeService plinthTypeService) {
		this.plinthTypeService = plinthTypeService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		PlinthType plinthType = plinthTypeService.findOne(Long.valueOf(text));
		setValue(plinthType);
	}
}
