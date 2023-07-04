package br.com.converter.menu;

import javax.swing.JOptionPane;

public class MainMenu {
	InputMenu input = new InputMenu();
	
	public void showMenu() {

		String[] options = { "Conversor de Moeda", "Conversor de Temperatura" };

		String selected = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		if (selected != null) {
			if (selected.equals("Conversor de Moeda")) {
				input.getValue();
			} else if (selected.equals("Conversor de Temperatura")) {
				System.out.println(selected);
			}
		} else {
			System.out.println("Conversor encerrado.");
		}
	}
}
