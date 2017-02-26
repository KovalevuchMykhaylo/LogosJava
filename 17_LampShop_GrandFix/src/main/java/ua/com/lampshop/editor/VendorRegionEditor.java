package ua.com.lampshop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.lampshop.entity.VendorRegion;
import ua.com.lampshop.service.VendorRegionService;

public class VendorRegionEditor extends PropertyEditorSupport{
	
	private final VendorRegionService vendorRegionService;

	public VendorRegionEditor(VendorRegionService vendorRegionService) {
		this.vendorRegionService = vendorRegionService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		VendorRegion vendorRegion = vendorRegionService.findOne(Long.valueOf(text));
		setValue(vendorRegion);
	}
}
