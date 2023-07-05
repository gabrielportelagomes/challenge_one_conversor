package br.com.converter.temperature;

import javax.swing.JOptionPane;

import br.com.converter.menu.MainMenu;
import br.com.converter.message.InfoMessage;
import br.com.converter.money.ConvertMoneyOptions;

public class InputTempetatureMenu {
	InfoMessage infoMessage = new InfoMessage();

	public void getValue() {
		String input = JOptionPane.showInputDialog(null, "insira um valor");

		if (input == null) {
			MainMenu mainMenu = new MainMenu();
			mainMenu.showMenu();
		} else {
			try {
				double value = Double.parseDouble(input);

				ConvertTemperatureOptions convertTemperatureOptions = new ConvertTemperatureOptions();
				convertTemperatureOptions.showOptions(value);
			} catch (NumberFormatException e) {
				infoMessage.showInfoMessage("Valor inválido");
				getValue();
			}
		}

	}
}
