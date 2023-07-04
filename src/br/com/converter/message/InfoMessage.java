package br.com.converter.message;

import javax.swing.JOptionPane;

public class InfoMessage {

	public void showInfoMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
	}
}
