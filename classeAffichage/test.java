import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;

import javax.jws.soap.SOAPBinding.Use;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;

import org.w3c.dom.css.Counter;

/**
 * @author moi
 *
 */
public class test {

	

	/**
	 * 
	 */

	public test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame FenPrin = new JFrame();
		FenPrin.setSize(700, 700);
		FenPrin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FenPrin.getContentPane().setLayout(null);
		
		// recuperation de la taille de l'ecran de l'utilisateur
		Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		
		// variable hauteur et largeur de l'ecran utilisateur
		int hauteur = (int)tailleEcran.getHeight();
		int largeur = (int)tailleEcran.getWidth();
		
		// affichage du JFrame au centre de l'ecran de l'utilisateur
		FenPrin.setBounds((largeur - FenPrin.getWidth())/2, (hauteur - FenPrin.getHeight())/2, 700, 700);
		
		// creation d'un JPanel par une methode et insertion du JPanel dans le JFrame
		ChoixAffichage AffichPnl = new ChoixAffichage();
		FenPrin.setJMenuBar(AffichPnl.menu());
		FenPrin.setContentPane(AffichPnl.CreaCompte());
		
			// retrait du JPanel du JFrame
		FenPrin.getContentPane().remove(AffichPnl.CreaCompte());
		
		// insertion d'un autre JPanel dans le JFrame
		FenPrin.setContentPane(AffichPnl.creaAssos());
		/*
		// retrait du JPanel du JFrame
		FenPrin.getContentPane().remove(AffichPnl.creaAssos());
				
		// insertion d'un autre JPanel dans le JFrame
		FenPrin.setContentPane(AffichPnl.connexion());
		*/
		
		
		
		
		
		
		FenPrin.setVisible(true);
	}

}
