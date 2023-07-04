package br.com.converter.menu;

import javax.swing.JOptionPane;

import br.com.converter.message.InfoMessage;
import br.com.converter.money.ConvertMoneyOptions;

public class InputMenu {
	InfoMessage infoMessage = new InfoMessage();

	public void getValue() {
		String input = JOptionPane.showInputDialog(null, "insira um valor");

		if (input == null) {
			MainMenu mainMenu = new MainMenu();
			mainMenu.showMenu();
		} else {
			try {
				int value = Integer.parseInt(input);

				ConvertMoneyOptions convertMoneyOptions = new ConvertMoneyOptions();
				convertMoneyOptions.showOptions(value);
			} catch (NumberFormatException e) {
				infoMessage.showInfoMessage("Valor inválido");
				getValue();
			}
		}

	}
}
