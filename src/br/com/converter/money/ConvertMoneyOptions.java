package br.com.converter.money;

import javax.swing.JOptionPane;

import br.com.converter.menu.MainMenu;
import br.com.converter.message.ConvertedValueMessage;

public class ConvertMoneyOptions {
	double newValue;
	String result;

	public void showOptions(double value) {
		String[] options = { "Converter de Reais a Dólar", "Converter de Reais a Euro",
				"Converter de Reais a Libras Esterlinas", "Converter de Reais a Peso argentino",
				"Converter de Reais a Peso Chileno", "Converter de Dólar a Reais", "Converter de Euro a Reais",
				"Converter de Libras Esterlinas a Reais", "Converter de Peso argentino a  Reais",
				"Converter de Peso Chileno a Reais" };

		String selected = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		if (selected != null) {
			if (selected.equals("Converter de Reais a Dólar")) {
				newValue = value * 0.21;
				result = String.format("$ %.2f", newValue);
			} else if (selected.equals("Converter de Reais a Euro")) {
				newValue = value * 0.19;
				result = String.format("€ %.2f", newValue);
			} else if (selected.equals("Converter de Reais a Libras Esterlinas")) {
				newValue = value * 0.16;
				result = String.format("£ %.2f", newValue);
			} else if (selected.equals("Converter de Reais a Peso argentino")) {
				newValue = value * 53.65;
				result = String.format("$ %.2f", newValue);
			} else if (selected.equals("Converter de Reais a Peso Chileno")) {
				newValue = value * 165.55;
				result = String.format("$ %.2f", newValue);
			} else if (selected.equals("Converter de Dólar a Reais")) {
				newValue = value * 4.83;
				result = String.format("R$ %.2f", newValue);
			} else if (selected.equals("Converter de Euro a Reais")) {
				newValue = value * 5.27;
				result = String.format("R$ %.2f", newValue);
			} else if (selected.equals("Converter de Libras Esterlinas a Reais")) {
				newValue = value * 6.15;
				result = String.format("R$ %.2f", newValue);
			} else if (selected.equals("Converter de Peso argentino a  Reais")) {
				newValue = value * 0.019;
				result = String.format("R$ %.2f", newValue);
			} else if (selected.equals("Converter de Peso Chileno a Reais")) {
				newValue = value * 0.006;
				result = String.format("R$ %.2f", newValue);
			}

			ConvertedValueMessage valueMessageMenu = new ConvertedValueMessage();
			valueMessageMenu.showConvertedValueMessage(result);
		} else {
			MainMenu mainMenu = new MainMenu();
			mainMenu.showMenu();
		}
	}
}
