package org.jahia.modules.example.initializers;

import org.jahia.services.content.nodetypes.ExtendedPropertyDefinition;
import org.jahia.services.content.nodetypes.initializers.ChoiceListValue;
import org.jahia.services.content.nodetypes.initializers.ModuleChoiceListInitializer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExampleChoiceListInitializer implements ModuleChoiceListInitializer {

	String key;

	@Override
	public List<ChoiceListValue> getChoiceListValues(ExtendedPropertyDefinition epd, String param, List<ChoiceListValue> values, Locale locale, Map<String, Object> context) {
		List<ChoiceListValue> choiceListValues = new ArrayList<ChoiceListValue>();

		choiceListValues.add(new ChoiceListValue("Name to display", "Value to save"));
		choiceListValues.add(new ChoiceListValue("Another name to display", "Another value to save"));

		return choiceListValues;
	}

	@Override
	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String getKey() {
		return this.key;
	}
}
