package gui.kontroler;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.IgraProzor;
import gui.Instrukcije;

import gui.Pobeda;
import gui.PocetniProzor;
import gui.Poraz;
import igrica.Igrac;
import igrica.Igrica;
import sistemskeOperacije.SODaLiJePogodjenaRec;
import sistemskeOperacije.SODaLiSuPotroseniSviPokusaji;
import sistemskeOperacije.SODodajSlovo;
import sistemskeOperacije.SOSakrivenaRecNaPocetkuIgre;

public class GUIKontroler extends JFrame {
	
	public static PocetniProzor pp;

	private JPanel contentPane;

	static Igrica igrica1;
	static Igrac igrac1;
	
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
	
	public static void prikaziInstrukcije() {
		Instrukcije prozor = new Instrukcije();
		prozor.setLocationRelativeTo(pp);
		prozor.setVisible(true);
	}

	
	public static void prikaziPorazProzor() {
		Poraz poraz = new Poraz();
		poraz.setLocationRelativeTo(pp);
		poraz.setVisible(true);
	}
	
	public static void prikaziPobedaProzor() {
		Pobeda pobeda = new Pobeda();
		pobeda.setLocationRelativeTo(pp);
		pobeda.setVisible(true);
	}


	public static String zapocniIgru(String kategorija) {
		igrac1= new Igrac();
		String rec= igrac1.zadajRecIgracu(kategorija);
		
		igrica1 = new Igrica(rec);
		
		return rec;
	}
	
	public static char[] postaviRecNaPocetku(String rec) {
		return SOSakrivenaRecNaPocetkuIgre.izvrsi(rec);
	}
	
	public static String dodajSlovo(String ZadataRec, char slovo, char[] trenutnaRec) {
		String recZaPrikaz = "";
		char[] recSkrivena = SODodajSlovo.izvrsi(ZadataRec, slovo);
		
		for(int i=0;i<recSkrivena.length;i++) {
			recZaPrikaz = recZaPrikaz+recSkrivena[i];
		}
		
		return recZaPrikaz;
	}
	
	public static int brojGresaka() {
		return igrica1.getBrojPromasaja();
	}
	
	public static boolean igracJeIzgubio() {
		return SODaLiSuPotroseniSviPokusaji.izvrsi();
	}
	
	public static boolean igracJePobedio() {
		return SODaLiJePogodjenaRec.izvrsi(igrica1.recSaOtkrivenimSlovima);
	}
	
	public static ImageIcon prikaziSlikuVesanja() {
		
		ImageIcon image = new ImageIcon(GUIKontroler.class.getResource("/icons/slika1.png"));
		
		
		if(igrica1.getBrojPromasaja() == 1) {
			image = new ImageIcon(GUIKontroler.class.getResource("/icons/slika2.png"));
		}else if(igrica1.getBrojPromasaja() == 2) {
			image = new ImageIcon(GUIKontroler.class.getResource("/icons/slika3.png"));
		}else if(igrica1.getBrojPromasaja() == 3) {
			image = new ImageIcon(GUIKontroler.class.getResource("/icons/slika4.png"));
		}else if(igrica1.getBrojPromasaja() == 4) {
			image = new ImageIcon(GUIKontroler.class.getResource("/icons/slika5.png"));
		}else if(igrica1.getBrojPromasaja() == 5) {
			image = new ImageIcon(GUIKontroler.class.getResource("/icons/slika6.png"));
		}
		
		return image;
		
	}
	
	
	
	
	
	
}
