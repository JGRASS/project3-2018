package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.kontroler.GUIKontroler;
import java.awt.Toolkit;

public class Poraz extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Poraz() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Poraz.class.getResource("/icons/Hangman1.png")));
		setTitle("Vesalica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		BufferedImage image;
		try {
			image = ImageIO.read(this.getClass().getResource("/icons/poraz.jpg"));
			contentPane.setLayout(null);
			
			JButton btnPovratak = new JButton("Povratak");
			btnPovratak.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.prikaziPocetniProzor();
					dispose();
				}
			});
			contentPane.setLayout(null);
			btnPovratak.setBackground(SystemColor.inactiveCaptionBorder);
			btnPovratak.setFont(new Font("Arial Black", Font.BOLD, 12));
			btnPovratak.setBounds(90, 197, 143, 27);
			contentPane.add(btnPovratak);
			JLabel lblNewLabel = new JLabel(new ImageIcon(image));
			lblNewLabel.setBounds(0, 0, 238, 239);
			contentPane.add(lblNewLabel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
