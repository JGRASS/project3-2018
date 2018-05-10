package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.kontroler.GUIKontroler;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pobeda extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Pobeda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pobeda.class.getResource("/icons/Hangman1.png")));
		setTitle("Vesalica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		

		BufferedImage image;
		try {
			image = ImageIO.read(this.getClass().getResource("/icons/pobeda.jpg"));
			contentPane.setLayout(null);
			
			JButton btnPovratak = new JButton("Povratak");
			btnPovratak.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.prikaziPocetniProzor();
					dispose();
				}
			});
			btnPovratak.setBackground(SystemColor.inactiveCaptionBorder);
			btnPovratak.setFont(new Font("Arial Black", Font.BOLD, 12));
			btnPovratak.setBounds(562, 5, 143, 36);
			contentPane.add(btnPovratak);
			JLabel lblNewLabel = new JLabel(new ImageIcon(image));
			lblNewLabel.setBounds(5, 5, 700, 310);
			contentPane.add(lblNewLabel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
