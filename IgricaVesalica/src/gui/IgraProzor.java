package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.kontroler.GUIKontroler;
import igrica.Igrica;
import sistemskeOperacije.SOSakrivenaRecNaPocetkuIgre;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;
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
import java.awt.Color;

public class IgraProzor extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblSlika;

	private String zadataRec;
	private char[] recSkrivena;
	private int brojPromasaja = 0;
	private JLabel lblSlika_1;

	public void setLblSlika(JLabel lblSlika) {
		this.lblSlika = lblSlika;
	}

	public void setZadataRec(String zadataRec) {
		this.zadataRec = zadataRec;
	}

	public void setRecSkrivena(char[] recSkrivena) {
		this.recSkrivena = recSkrivena;
	}

	public void setLblSlika_1(JLabel lblSlika_1) {
		this.lblSlika_1 = lblSlika_1;
	}

	/**
	 * Create the frame.
	 */
	public IgraProzor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IgraProzor.class.getResource("/icons/Hangman1.png")));
		setResizable(false);
		setTitle("Vesalica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 469);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
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

		JLabel lblRec = new JLabel("");
		lblRec.setForeground(Color.BLACK);
		lblRec.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblRec.setBounds(301, 214, 205, 44);
		contentPane.add(lblRec);

		BufferedImage image;
		try {
			image = ImageIO.read(this.getClass().getResource("/icons/Slika1.png"));
			lblSlika_1 = new JLabel(new ImageIcon(image));
			lblSlika_1.setBounds(10, 0, 289, 279);
			contentPane.add(lblSlika_1);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JButton btnZapocniIgru = new JButton("Zapocni igru");
		btnZapocniIgru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String kategorija = buttonGroup.getSelection().getActionCommand();
				String recZaPrikaz = "";

				zadataRec = GUIKontroler.zapocniIgru(kategorija);
				recSkrivena = GUIKontroler.postaviRecNaPocetku(zadataRec);

				for (int i = 0; i < recSkrivena.length; i++) {
					recZaPrikaz = recZaPrikaz + recSkrivena[i];
				}

				lblRec.setText(recZaPrikaz);
			}
		});
		btnZapocniIgru.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnZapocniIgru.setBackground(new Color(255, 255, 255));
		btnZapocniIgru.setBounds(10, 386, 132, 23);
		contentPane.add(btnZapocniIgru);

		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'E', recSkrivena));
				btnE.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}
				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}

			}
		});
		btnE.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnE.setBounds(52, 293, 46, 23);
		contentPane.add(btnE);

		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'R', recSkrivena));
				btnR.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}

			}
		});
		btnR.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnR.setBounds(108, 293, 46, 23);
		contentPane.add(btnR);

		JButton btnT = new JButton("T");
		btnT.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'T', recSkrivena));
				btnT.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnT.setBounds(164, 293, 46, 23);
		contentPane.add(btnT);

		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'U', recSkrivena));
				btnU.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnU.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnU.setBounds(220, 293, 46, 23);
		contentPane.add(btnU);

		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'I', recSkrivena));
				btnI.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnI.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnI.setBounds(276, 293, 46, 23);
		contentPane.add(btnI);

		JButton btnO = new JButton("O");
		btnO.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'O', recSkrivena));
				btnO.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnO.setBounds(332, 293, 46, 23);
		contentPane.add(btnO);

		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'P', recSkrivena));
				btnP.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnP.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnP.setBounds(388, 293, 46, 23);
		contentPane.add(btnP);

		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'A', recSkrivena));
				btnA.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnA.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnA.setBounds(0, 323, 46, 23);
		contentPane.add(btnA);

		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'S', recSkrivena));
				btnS.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnS.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnS.setBounds(52, 323, 46, 23);
		contentPane.add(btnS);

		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'D', recSkrivena));
				btnD.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnD.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnD.setBounds(108, 323, 46, 23);
		contentPane.add(btnD);

		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'F', recSkrivena));
				btnF.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnF.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnF.setBounds(164, 323, 46, 23);
		contentPane.add(btnF);

		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'G', recSkrivena));
				btnG.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnG.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnG.setBounds(220, 323, 46, 23);
		contentPane.add(btnG);

		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'H', recSkrivena));
				btnH.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnH.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnH.setBounds(276, 323, 46, 23);
		contentPane.add(btnH);

		JButton btnJ = new JButton("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'J', recSkrivena));
				btnJ.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnJ.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnJ.setBounds(332, 323, 46, 23);
		contentPane.add(btnJ);

		JButton btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'K', recSkrivena));
				btnK.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnK.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnK.setBounds(388, 323, 46, 23);
		contentPane.add(btnK);

		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'L', recSkrivena));
				btnL.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnL.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnL.setBounds(445, 323, 46, 23);
		contentPane.add(btnL);

		JButton btnZ = new JButton("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'Z', recSkrivena));
				btnZ.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnZ.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnZ.setBounds(108, 352, 46, 23);
		contentPane.add(btnZ);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'C', recSkrivena));
				btnC.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnC.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnC.setBounds(164, 352, 46, 23);
		contentPane.add(btnC);

		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'V', recSkrivena));
				btnV.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnV.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnV.setBounds(220, 352, 46, 23);
		contentPane.add(btnV);

		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'B', recSkrivena));
				btnB.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnB.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnB.setBounds(276, 352, 46, 23);
		contentPane.add(btnB);

		JButton btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'N', recSkrivena));
				btnN.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});
		btnN.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnN.setBounds(332, 352, 46, 23);
		contentPane.add(btnN);

		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRec.setText(GUIKontroler.dodajSlovo(zadataRec, 'M', recSkrivena));
				btnM.setEnabled(false);

				if (GUIKontroler.igracJeIzgubio()) {
					GUIKontroler.prikaziPorazProzor();
					dispose();
				}

				if (GUIKontroler.igracJePobedio()) {
					GUIKontroler.prikaziPobedaProzor();
					dispose();
				}

				if (brojPromasaja < GUIKontroler.brojGresaka()) {
					lblSlika_1.setIcon(GUIKontroler.prikaziSlikuVesanja());
					brojPromasaja = GUIKontroler.brojGresaka();
					repaint();
				}
			}
		});

		btnM.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnM.setBounds(388, 352, 46, 23);
		contentPane.add(btnM);

		JLabel lblKategorija = new JLabel("Kategorija");
		lblKategorija.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKategorija.setBounds(369, 0, 76, 28);
		contentPane.add(lblKategorija);

		JRadioButton rdbtnEvropskiGradovi = new JRadioButton("Evropski gradovi");
		rdbtnEvropskiGradovi.setActionCommand("Evropski gradovi");
		rdbtnEvropskiGradovi.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnEvropskiGradovi.setSelected(true);
		buttonGroup.add(rdbtnEvropskiGradovi);
		rdbtnEvropskiGradovi.setBounds(362, 21, 129, 23);
		contentPane.add(rdbtnEvropskiGradovi);

		JRadioButton rdbtnZivotinje = new JRadioButton("Zivotinje");
		rdbtnZivotinje.setActionCommand("Zivotinje");
		rdbtnZivotinje.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnZivotinje);
		rdbtnZivotinje.setBounds(362, 42, 109, 23);
		contentPane.add(rdbtnZivotinje);

		JRadioButton rdbtnDrzave = new JRadioButton("Drzave");
		rdbtnDrzave.setActionCommand("Drzave");
		rdbtnDrzave.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnDrzave);
		rdbtnDrzave.setBounds(362, 68, 109, 14);
		contentPane.add(rdbtnDrzave);

		JRadioButton rdbtnPovrce = new JRadioButton("Povrce");
		rdbtnPovrce.setActionCommand("Povrce");
		rdbtnPovrce.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnPovrce);
		rdbtnPovrce.setBounds(362, 85, 109, 23);
		contentPane.add(rdbtnPovrce);

		JRadioButton rdbtnVoce = new JRadioButton("Voce");
		rdbtnVoce.setActionCommand("Voce");
		rdbtnVoce.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnVoce);
		rdbtnVoce.setBounds(362, 111, 109, 14);
		contentPane.add(rdbtnVoce);

		JRadioButton rdbtnSportovi = new JRadioButton("Sportovi");
		rdbtnSportovi.setActionCommand("Sportovi");
		rdbtnSportovi.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnSportovi);
		rdbtnSportovi.setBounds(362, 128, 109, 23);
		contentPane.add(rdbtnSportovi);

		JRadioButton rdbtnZanimanja = new JRadioButton("Zanimanja");
		rdbtnZanimanja.setActionCommand("Zanimanja");
		rdbtnZanimanja.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnZanimanja);
		rdbtnZanimanja.setBounds(362, 154, 109, 14);
		contentPane.add(rdbtnZanimanja);

		JRadioButton rdbtnMuzickiInstrumenti = new JRadioButton("Muzicki instrumenti");
		rdbtnMuzickiInstrumenti.setActionCommand("Muzicki instrumenti");
		rdbtnMuzickiInstrumenti.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnMuzickiInstrumenti);
		rdbtnMuzickiInstrumenti.setBounds(362, 169, 136, 23);
		contentPane.add(rdbtnMuzickiInstrumenti);

		JButton btnIzadji = new JButton("Izadji");
		btnIzadji.setBackground(new Color(255, 255, 255));
		btnIzadji.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnIzadji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izadji();
			}
		});
		btnIzadji.setBounds(332, 386, 132, 23);
		contentPane.add(btnIzadji);

		JButton btnSacuvajIgru = new JButton("Sacuvaj igru");
		btnSacuvajIgru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIKontroler.sacuvajIgru(zadataRec, brojPromasaja, recSkrivena);
				dispose();
				GUIKontroler.prikaziPocetniProzor();
			}
		});
		btnSacuvajIgru.setBackground(new Color(255, 255, 255));
		btnSacuvajIgru.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnSacuvajIgru.setBounds(174, 386, 132, 23);
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
