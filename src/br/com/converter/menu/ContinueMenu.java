package br.com.converter.menu;

import javax.swing.JOptionPane;

import br.com.converter.message.InfoMessage;

public class ContinueMenu {
	InfoMessage infoMessage = new InfoMessage();

	public void showContinueMenu() {
		int option = JOptionPane.showOptionDialog(null, "Deseja continuar?", "Select an Option",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Sim", "Não", "Cancelar" }, null);

		if (option == JOptionPane.YES_OPTION) {
			MainMenu mainMenu = new MainMenu();
			mainMenu.showMenu();
		} else if (option == JOptionPane.NO_OPTION) {
			infoMessage.showInfoMessage("Programa finalizado");
		} else if (option == JOptionPane.CANCEL_OPTION) {
			infoMessage.showInfoMessage("Programa concluído");
		} else {
			System.out.println("Conversor encerrado.");
		}
	}
}
