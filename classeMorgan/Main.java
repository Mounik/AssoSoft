package classeProjet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.TableModel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fenetre = new JFrame();
		JPanel CreaCompte = new JPanel();
		
		fenetre.setSize(700,700);
		fenetre.setTitle("PROJET");
		fenetre.setContentPane(CreaCompte);
		
		CreaCompte.setBackground(new Color(176, 224, 230));
		CreaCompte.setBounds(0, 0, 684, 645);
		CreaCompte.setLayout(null);
		
		JLabel lblTitre = new JLabel("Cr\u00E9ation d'un Compte");
		lblTitre.setBounds(192, 11, 300, 30);
		lblTitre.setForeground(new Color(0, 139, 139));
		lblTitre.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		CreaCompte.add(lblTitre);
		
		JLabel lblSouslignement = new JLabel("_________________________________");
		lblSouslignement.setBounds(192, 23, 300, 14);
		lblSouslignement.setForeground(new Color(0, 139, 139));
		lblSouslignement.setBackground(new Color(255, 255, 255));
		lblSouslignement.setHorizontalAlignment(SwingConstants.CENTER);
		CreaCompte.add(lblSouslignement);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(76, 86, 185, 20);
		lblNom.setHorizontalAlignment(SwingConstants.RIGHT);
		CreaCompte.add(lblNom);
		
		JTextField txtNom = new JTextField();
		txtNom.setBounds(291, 86, 185, 20);
		txtNom.setColumns(10);
		CreaCompte.add(txtNom);
		
		JLabel lblPrenom = new JLabel("Pr\u00E9nom :");
		lblPrenom.setBounds(76, 117, 185, 20);
		lblPrenom.setHorizontalAlignment(SwingConstants.RIGHT);
		CreaCompte.add(lblPrenom);
		
		JTextField txtPrenom = new JTextField();
		txtPrenom.setBounds(291, 117, 185, 20);
		txtPrenom.setColumns(10);
		CreaCompte.add(txtPrenom);
		
		JLabel lblDate = new JLabel("Date de naissance :");
		lblDate.setBounds(76, 147, 185, 20);
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		CreaCompte.add(lblDate);
		
		JTextField txtJourNaissance = new JTextField();
		txtJourNaissance.setBounds(291, 147, 19, 20);
		txtJourNaissance.setColumns(10);
		CreaCompte.add(txtJourNaissance);
		
		JLabel lblSeparateurJourMois = new JLabel(" /");
		lblSeparateurJourMois.setBounds(310, 147, 8, 20);
		lblSeparateurJourMois.setHorizontalAlignment(SwingConstants.LEFT);
		CreaCompte.add(lblSeparateurJourMois);
		
		JTextField txtMoisNaissance = new JTextField();
		txtMoisNaissance.setBounds(318, 147, 19, 20);
		txtMoisNaissance.setColumns(10);
		CreaCompte.add(txtMoisNaissance);
		
		JLabel lblSeparateurMoisAnnee = new JLabel(" /");
		lblSeparateurMoisAnnee.setBounds(337, 147, 8, 20);
		lblSeparateurMoisAnnee.setHorizontalAlignment(SwingConstants.LEFT);
		CreaCompte.add(lblSeparateurMoisAnnee);
		
		JTextField txtAnneeNaissance = new JTextField();
		txtAnneeNaissance.setBounds(345, 147, 34, 20);
		txtAnneeNaissance.setColumns(10);
		CreaCompte.add(txtAnneeNaissance);
		
		JLabel lblMail = new JLabel("Mail :");
		lblMail.setBounds(76, 178, 185, 20);
		lblMail.setHorizontalAlignment(SwingConstants.RIGHT);
		CreaCompte.add(lblMail);
		
		JTextField txtMail = new JTextField();
		txtMail.setBounds(291, 178, 185, 20);
		txtMail.setColumns(10);
		CreaCompte.add(txtMail);
		
		JLabel lblMdp = new JLabel("Mot de passe :");
		lblMdp.setBounds(76, 209, 185, 20);
		lblMdp.setHorizontalAlignment(SwingConstants.RIGHT);
		CreaCompte.add(lblMdp);
		
		JTextField txtMdp = new JTextField();
		txtMdp.setBounds(291, 209, 185, 20);
		txtMdp.setColumns(10);
		CreaCompte.add(txtMdp);
		
		JLabel lblMdp2 = new JLabel("Confirmation mot de passe :");
		lblMdp2.setBounds(76, 240, 185, 20);
		lblMdp2.setHorizontalAlignment(SwingConstants.RIGHT);
		CreaCompte.add(lblMdp2);
		
		JTextField txtMdp2 = new JTextField();
		txtMdp2.setBounds(291, 240, 185, 20);
		txtMdp2.setColumns(10);
		CreaCompte.add(txtMdp2);
		
		JLabel lblTel = new JLabel("N\u00B0 de T\u00E9l\u00E9phone :");
		lblTel.setBounds(76, 271, 185, 20);
		lblTel.setHorizontalAlignment(SwingConstants.RIGHT);
		CreaCompte.add(lblTel);
		
		JTextField txtTel = new JTextField();
		txtTel.setBounds(291, 271, 185, 20);
		txtTel.setColumns(10);
		CreaCompte.add(txtTel);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(76, 300, 185, 20);
		lblAdresse.setHorizontalAlignment(SwingConstants.RIGHT);
		CreaCompte.add(lblAdresse);
		
		JTextArea txtAreaAdresse = new JTextArea();
		txtAreaAdresse.setBounds(291, 300, 185, 50);
		CreaCompte.add(txtAreaAdresse);
		
		ButtonGroup groupBouton = new ButtonGroup();
		JRadioButton rdbtnAdherent = new JRadioButton("Adh\u00E9rent");
		rdbtnAdherent.setBounds(270, 397, 92, 20);
		rdbtnAdherent.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnAdherent.setBackground(new Color(176, 224, 230));
		groupBouton.add(rdbtnAdherent);
		CreaCompte.add(rdbtnAdherent);
		
		JRadioButton rdbtnContact = new JRadioButton("Contact");
		rdbtnContact.setBounds(410, 397, 92, 20);
		rdbtnAdherent.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnContact.setBackground(new Color(176, 224, 230));
		groupBouton.add(rdbtnContact);
		CreaCompte.add(rdbtnContact);
		
		JLabel lblAssociation = new JLabel("Associations :");
		lblAssociation.setBounds(76, 461, 185, 20);
		lblAssociation.setHorizontalAlignment(SwingConstants.RIGHT);
		CreaCompte.add(lblAssociation);
		
		JComboBox cbbAssociation = new JComboBox();
		cbbAssociation.setBounds(291, 461, 185, 20);
		cbbAssociation.setFont(new Font("Tahoma", Font.PLAIN, 11));
		CreaCompte.add(cbbAssociation);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(249, 519, 185, 20);
		CreaCompte.add(btnValider);
		
		btnValider.addActionListener(new ActionListener() 
		{
			public void actionPerformed( ActionEvent e )
			{
				try 
				{
					Personne pers = new Personne(txtNom.getText(),txtPrenom.getText(),txtTel.getText(),txtMail.getText(),txtAreaAdresse.getText(),txtMdp.getText(),5);
					Crud crud = new Crud();
					crud.connection();
					crud.add("personne", pers);
					crud.deconnection();
				}
				catch(Exception ex)
				{
					System.out.println ("Echec AJOUT !!!!!!");
				}
			}
		});
		/*bouton2.addActionListener(new ActionListener() 
		{
			public void actionPerformed( ActionEvent e )
			{
				try 
				{
					Association asso = new Association();
					System.out.println ("Fait0");
					Crud crud = new Crud();
					System.out.println ("Fait1");
					crud.connection();
					System.out.println ("Fait2");
					crud.add("association", asso);
					System.out.println ("Fait3");
					crud.deconnection();
				}
				catch(Exception ex)
				{
					System.out.println ("Echec AJOUT !!!!!!");
				}
			}
		});*/
		fenetre.setVisible(true);
	}

}
