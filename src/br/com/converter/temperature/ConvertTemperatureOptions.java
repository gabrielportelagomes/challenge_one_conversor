package br.com.converter.temperature;

import javax.swing.JOptionPane;

import br.com.converter.message.ConvertedValueMessage;

public class ConvertTemperatureOptions {
	double newValue;
	String result;

	public void showOptions(double value) {
		String[] options = { "Converter de Celsius a Fahrenheit", "Converter de Celsius a Kelvin",
				"Converter de Fahrenheit a Kelvin", "Converter de Fahrenheit a Celsius",
				"Converter de Kelvin a Celsius", "Converter de Kelvin a Fahrenheit" };

		String selected = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		if (selected != null) {
			if (selected.equals("Converter de Celsius a Fahrenheit")) {
				newValue = (value * 9/5) + 32;
				result = String.format("%.2f °F", newValue);
			} else if (selected.equals("Converter de Celsius a Kelvin")) {
				newValue = value + 273.15;
				result = String.format("%.2f K", newValue);
			} else if (selected.equals("Converter de Fahrenheit a Kelvin")) {
				newValue = (value -32) * 5/9 + 273.15;
				result = String.format("%.2f K", newValue);
			} else if (selected.equals("Converter de Fahrenheit a Celsius")) {
				newValue = (value -32) / 1.8;
				result = String.format("%.2f °C", newValue);
			} else if (selected.equals("Converter de Kelvin a Celsius")) {
				newValue = value - 273.15;
				result = String.format("%.2f °C", newValue);
			} else if (selected.equals("Converter de Kelvin a Fahrenheit")) {
				newValue = (value - 273.15) * 9/5 + 32;
				result = String.format("%.2f °F", newValue);
			}

			ConvertedValueMessage valueMessageMenu = new ConvertedValueMessage();
			valueMessageMenu.showConvertedValueMessage(result);
		} else {
			System.out.println("Nenhuma opção selecionada.");
		}
	}
}
