package br.com.converter.message;

import javax.swing.JOptionPane;

import br.com.converter.menu.ContinueMenu;

public class ConvertedValueMessage {

	public void showConvertedValueMessage(String message) {
		JOptionPane.showMessageDialog(null, "O valor da conversão é de " + message, "Message",
				JOptionPane.INFORMATION_MESSAGE);
		
		ContinueMenu continueMenu = new ContinueMenu();
		continueMenu.showContinueMenu();
	}
}
