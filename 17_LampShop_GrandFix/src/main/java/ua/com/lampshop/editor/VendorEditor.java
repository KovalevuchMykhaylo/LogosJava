package ua.com.lampshop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.lampshop.entity.Vendor;
import ua.com.lampshop.service.VendorService;

public class VendorEditor extends PropertyEditorSupport{
	
	private final VendorService vendorService;

	public VendorEditor(VendorService vendorService) {
		this.vendorService = vendorService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Vendor vendor = vendorService.findOne(Long.valueOf(text));
		setValue(vendor);
	}
}
