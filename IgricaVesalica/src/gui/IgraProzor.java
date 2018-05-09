package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.SystemColor;
import java.awt.Font;

public class IgraProzor extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 * Create the frame.
	 */
	public IgraProzor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IgraProzor.class.getResource("/icons/Hangman1.png")));
		setResizable(false);
		setTitle("Vesalica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 405);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmNovaIgra = new JMenuItem("Nova igra");
		mnHelp.add(mntmNovaIgra);
		
		JMenuItem mntmSacuvajIgru = new JMenuItem("Sacuvaj igru");
		mnHelp.add(mntmSacuvajIgru);
		
		JMenuItem mntmInstrukcije = new JMenuItem("Instrukcije");
		mnHelp.add(mntmInstrukcije);
		
		JMenuItem mntmIzadji = new JMenuItem("Izadji");
		mntmIzadji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izadji();
			}
		});
		mnHelp.add(mntmIzadji);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(contentPane, popupMenu);
		
		JMenuItem mntmNovaIgra_1 = new JMenuItem("Nova igra");
		popupMenu.add(mntmNovaIgra_1);
		
		JMenuItem mntmSacuvajIgru_1 = new JMenuItem("Sacuvaj igru");
		popupMenu.add(mntmSacuvajIgru_1);
		
		JMenuItem mntmInstrukcije_1 = new JMenuItem("Instrukcije");
		popupMenu.add(mntmInstrukcije_1);
		
		JMenuItem mntmIzadji_1 = new JMenuItem("Izadji");
		mntmIzadji_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izadji();
			}
		});
		popupMenu.add(mntmIzadji_1);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnE.setBounds(52, 224, 46, 23);
		contentPane.add(btnE);
		
		JButton btnR = new JButton("R");
		btnR.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnR.setBounds(108, 224, 46, 23);
		contentPane.add(btnR);
		
		JButton btnT = new JButton("T");
		btnT.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnT.setBounds(161, 224, 46, 23);
		contentPane.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnU.setBounds(217, 224, 46, 23);
		contentPane.add(btnU);
		
		JButton btnI = new JButton("I");
		btnI.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnI.setBounds(270, 224, 46, 23);
		contentPane.add(btnI);
		
		JButton btnO = new JButton("O");
		btnO.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnO.setBounds(326, 224, 46, 23);
		contentPane.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnP.setBounds(382, 224, 46, 23);
		contentPane.add(btnP);
		
		JButton btnA = new JButton("A");
		btnA.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnA.setBounds(0, 258, 46, 23);
		contentPane.add(btnA);
		
		JButton btnS = new JButton("S");
		btnS.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnS.setBounds(52, 258, 46, 23);
		contentPane.add(btnS);
		
		JButton btnD = new JButton("D");
		btnD.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnD.setBounds(108, 258, 46, 23);
		contentPane.add(btnD);
		
		JButton btnF = new JButton("F");
		btnF.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnF.setBounds(161, 258, 46, 23);
		contentPane.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnG.setBounds(217, 258, 46, 23);
		contentPane.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnH.setBounds(270, 258, 46, 23);
		contentPane.add(btnH);
		
		JButton btnJ = new JButton("J");
		btnJ.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnJ.setBounds(326, 258, 46, 23);
		contentPane.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnK.setBounds(382, 258, 46, 23);
		contentPane.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnL.setBounds(438, 258, 46, 23);
		contentPane.add(btnL);
		
		JButton btnZ = new JButton("Z");
		btnZ.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnZ.setBounds(82, 292, 46, 23);
		contentPane.add(btnZ);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnC.setBounds(138, 292, 46, 23);
		contentPane.add(btnC);
		
		JButton btnV = new JButton("V");
		btnV.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnV.setBounds(194, 292, 46, 23);
		contentPane.add(btnV);
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnB.setBounds(250, 292, 46, 23);
		contentPane.add(btnB);
		
		JButton btnN = new JButton("N");
		btnN.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnN.setBounds(306, 292, 46, 23);
		contentPane.add(btnN);
		
		JButton btnM = new JButton("M");
		btnM.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnM.setBounds(362, 292, 46, 23);
		contentPane.add(btnM);
		
		JLabel lblKategorija = new JLabel("Kategorija");
		lblKategorija.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKategorija.setBounds(369, 0, 76, 28);
		contentPane.add(lblKategorija);
		
		JRadioButton rdbtnEvropskiGradovi = new JRadioButton("Evropski gradovi");
		rdbtnEvropskiGradovi.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnEvropskiGradovi.setSelected(true);
		buttonGroup.add(rdbtnEvropskiGradovi);
		rdbtnEvropskiGradovi.setBounds(362, 21, 129, 23);
		contentPane.add(rdbtnEvropskiGradovi);
		
		JRadioButton rdbtnZivotinje = new JRadioButton("Zivotinje");
		rdbtnZivotinje.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnZivotinje);
		rdbtnZivotinje.setBounds(362, 42, 109, 23);
		contentPane.add(rdbtnZivotinje);
		
		JRadioButton rdbtnDrzave = new JRadioButton("Drzave");
		rdbtnDrzave.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnDrzave);
		rdbtnDrzave.setBounds(362, 68, 109, 14);
		contentPane.add(rdbtnDrzave);
		
		JRadioButton rdbtnPovrce = new JRadioButton("Povrce");
		rdbtnPovrce.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnPovrce);
		rdbtnPovrce.setBounds(362, 85, 109, 23);
		contentPane.add(rdbtnPovrce);
		
		JRadioButton rdbtnVoce = new JRadioButton("Voce");
		rdbtnVoce.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnVoce);
		rdbtnVoce.setBounds(362, 111, 109, 14);
		contentPane.add(rdbtnVoce);
		
		JRadioButton rdbtnSportovi = new JRadioButton("Sportovi");
		rdbtnSportovi.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnSportovi);
		rdbtnSportovi.setBounds(362, 128, 109, 23);
		contentPane.add(rdbtnSportovi);
		
		JRadioButton rdbtnZanimanja = new JRadioButton("Zanimanja");
		rdbtnZanimanja.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnZanimanja);
		rdbtnZanimanja.setBounds(362, 154, 109, 14);
		contentPane.add(rdbtnZanimanja);
		
		JRadioButton rdbtnMuzickiInstrumenti = new JRadioButton("Muzicki instrumenti");
		rdbtnMuzickiInstrumenti.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnMuzickiInstrumenti);
		rdbtnMuzickiInstrumenti.setBounds(362, 169, 136, 23);
		contentPane.add(rdbtnMuzickiInstrumenti);
		
		JButton btnIzadji = new JButton("Izadji");
		btnIzadji.setBackground(SystemColor.desktop);
		btnIzadji.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnIzadji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izadji();
			}
		});
		btnIzadji.setBounds(326, 333, 132, 23);
		contentPane.add(btnIzadji);
		
		JButton btnZapocniIgru = new JButton("Zapocni igru");
		btnZapocniIgru.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnZapocniIgru.setBackground(SystemColor.desktop);
		btnZapocniIgru.setBounds(22, 333, 132, 23);
		contentPane.add(btnZapocniIgru);
		
		JButton btnSacuvajIgru = new JButton("Sacuvaj igru");
		btnSacuvajIgru.setBackground(SystemColor.desktop);
		btnSacuvajIgru.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnSacuvajIgru.setBounds(176, 333, 132, 23);
		contentPane.add(btnSacuvajIgru);
		
	}
	
	public void izadji() {
		int opcija = JOptionPane.showConfirmDialog(contentPane, "Da li zelite da izadjete iz aplikacije?", "Izlazak",
				JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
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