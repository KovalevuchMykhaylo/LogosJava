package ua.com.lampshop.editor;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.stream.Collectors;

import ua.com.lampshop.entity.Vendor;
import ua.com.lampshop.service.VendorService;

public class VendorEditor extends PropertyEditorSupport{
	
	private final VendorService vendorService;

	public VendorEditor(VendorService vendorService) {
		this.vendorService = vendorService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		setValue(Arrays.stream(text.split("\\,"))
				.map(String::trim).map(Long::valueOf).map(e->vendorService.findOne(e)).collect(Collectors.toList()));
	}
}
