package gui.kontroler;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.IgraProzor;
import gui.PocetniProzor;

public class GUIKontroler extends JFrame {
	
	public static PocetniProzor pp;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKontroler.pp = new PocetniProzor();
					pp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIKontroler() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	}
	
	public static void prikaziIgraProzor() {
		IgraProzor prozor = new IgraProzor();
		prozor.setLocationRelativeTo(pp);
		prozor.setVisible(true);
	}
	
	public static void prikaziPocetniProzor() {
		PocetniProzor prozor = new PocetniProzor();
		prozor.setLocationRelativeTo(pp);
		prozor.setVisible(true);
	}

}
