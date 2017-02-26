package ua.com.lampshop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.lampshop.entity.CountryProducer;
import ua.com.lampshop.service.CountryProducerService;

public class CountryProducerEditor extends PropertyEditorSupport{
	
	private final CountryProducerService countryProducerService;

	public CountryProducerEditor(CountryProducerService countryProducerService) {
		this.countryProducerService = countryProducerService;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException{
		CountryProducer countryProducer = countryProducerService.findOne(Long.valueOf(text));
		setValue(countryProducer);
	}

}
