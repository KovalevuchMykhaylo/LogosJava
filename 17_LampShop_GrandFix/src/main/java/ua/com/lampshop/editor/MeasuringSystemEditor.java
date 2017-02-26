package ua.com.lampshop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.lampshop.entity.MeasuringSystem;
import ua.com.lampshop.service.MeasuringSystemService;

public class MeasuringSystemEditor extends PropertyEditorSupport{
	
	private final MeasuringSystemService measuringSystemService;

	public MeasuringSystemEditor(MeasuringSystemService measuringSystemService) {
		this.measuringSystemService = measuringSystemService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		MeasuringSystem measuringSystem = measuringSystemService.findOne(Long.valueOf(text));
		setValue(measuringSystem);
	}
}
