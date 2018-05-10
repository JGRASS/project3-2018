package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.kontroler.GUIKontroler;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.security.GuardedObject;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class PocetniProzor extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 * @return 
	 */
	public PocetniProzor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PocetniProzor.class.getResource("/icons/Hangman1.png")));
		setTitle("Vesalica");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				izadji();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 405, 380);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnMeni = new JMenu("Meni");
		menuBar.add(mnMeni);

		JMenuItem mntmNovaIgra = new JMenuItem("Nova igra");
		mntmNovaIgra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIKontroler.prikaziIgraProzor();
				dispose();
			}
		});
		mnMeni.add(mntmNovaIgra);

		JMenuItem mntmNastaviIgru = new JMenuItem("Nastavi igru");
		mntmNastaviIgru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIKontroler.prikaziIgraProzor();
				dispose();
			}
		});
		mnMeni.add(mntmNastaviIgru);

		JMenuItem mntmIzlazak_1 = new JMenuItem("Izlazak");
		mntmIzlazak_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izadji();
			}
		});
		mnMeni.add(mntmIzlazak_1);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmInstrukcije = new JMenuItem("Instrukcije");
		mntmInstrukcije.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIKontroler.prikaziInstrukcije();
			}
		});
		mnHelp.add(mntmInstrukcije);

		JMenuItem mntmOIgrici = new JMenuItem("O igrici");
		mntmOIgrici.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oIgrici();
			}
		});
		mnHelp.add(mntmOIgrici);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPopupMenu popupMenu = new JPopupMenu();
		contentPane.add(popupMenu);
		popupMenu.setBounds(0, 0, 113, 94);
		
		JMenuItem mntmNovaIgra_1 = new JMenuItem("Nova igra");
		mntmNovaIgra_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIKontroler.prikaziIgraProzor();
				dispose();
			}
		});
		popupMenu.add(mntmNovaIgra_1);

		JMenuItem mntmNastaviIgru_1 = new JMenuItem("Nastavi igru");
		mntmNastaviIgru_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIKontroler.prikaziIgraProzor();
				dispose();
			}
		});
		popupMenu.add(mntmNastaviIgru_1);

		JMenuItem mntmInstrukcije_1 = new JMenuItem("Instrukcije");
		popupMenu.add(mntmInstrukcije_1);

		JMenuItem mntmIzlazak = new JMenuItem("Izlazak");
		mntmIzlazak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izadji();
			}
		});
		popupMenu.add(mntmIzlazak);

		JButton btnNastaviIgru = new JButton("Nastavi igru");
		btnNastaviIgru.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNastaviIgru.setBackground(new Color(255, 255, 255));
		btnNastaviIgru.setBounds(47, 109, 132, 32);
		contentPane.add(btnNastaviIgru);

		 
		JButton btnIzadji = new JButton("Izadji");
		btnIzadji.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnIzadji.setBackground(new Color(255, 255, 255));
		btnIzadji.setBounds(47, 166, 132, 32);
		contentPane.add(btnIzadji);

		JButton btnZapocniIgru = new JButton("Zapocni igru");
		btnZapocniIgru.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnZapocniIgru.setBackground(new Color(255, 255, 255));
		btnZapocniIgru.setBounds(47, 48, 132, 32);
		contentPane.add(btnZapocniIgru);
		
		BufferedImage image;
		try {
			image = ImageIO.read(this.getClass().getResource("/icons/Hangman2.jpg"));
			JLabel lblSlika = new JLabel(new ImageIcon(image));
			lblSlika.setBounds(0, 0, 569, 324);
			contentPane.add(lblSlika);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		btnZapocniIgru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIKontroler.prikaziIgraProzor();
				dispose();
			}
		});
		btnIzadji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izadji();
			}
		});
		btnNastaviIgru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIKontroler.prikaziIgraProzor();
				dispose();
			}
		});

	}

	public void izadji() {
		int opcija = JOptionPane.showConfirmDialog(contentPane, "Da li zelite da izadjete iz aplikacije?", "Izlazak",
				JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	public void oIgrici() {
		JOptionPane.showMessageDialog(contentPane,
				"Autori: Dusan Mitrovic, Nemanja Rasic, Milica Zukanovic , Verzija 1.0", "O igirici Vesalica",
				JOptionPane.INFORMATION_MESSAGE);

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

