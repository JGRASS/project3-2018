package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.kontroler.GUIKontroler;

import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Instrukcije extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Instrukcije() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Instrukcije.class.getResource("/icons/Hangman1.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 382, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrO = new JTextArea();
		txtrO.setBounds(5, 5, 356, 236);
		txtrO.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtrO.setText("Pravila\r\n\r\nOvo je jednostavna igrica u kojoj je cilj pogoditi\r\nzadatu rec. Rec mozete da izaberete iz 8 kategorija:\r\ndrzave, muzicki instrumenti, voce, povrce, sportovi, \r\nevropski gradovi, zivotinje i zanimanja. \r\nPogadjate slovo po slovo, birajuci slovo, za koje \r\npretpostavljate da rec sadrzi, desnim klikom na slovo \r\nna ekranu. Imate pravo da pet puta \r\nizaberete pogresno slovo, ali opet da pogodite rec \r\ni pobedite!");
		contentPane.add(txtrO);
	}
}
