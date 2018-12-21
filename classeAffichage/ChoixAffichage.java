import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 * 
 */

/**
 * @author moi
 *
 */

public class ChoixAffichage {

	/**
	 * 
	 */
	
	public ChoixAffichage() {
		
	
	}
	
	public JMenuBar menu () {
		
		JMenuBar menuBar = new JMenuBar();
		
		
		JMenu mnAssos = new JMenu("Assos");
		menuBar.add(mnAssos);
		
		JMenuItem mntmAccueil = new JMenuItem("accueil");
		mnAssos.add(mntmAccueil);
		
		JMenuItem mntmCreer = new JMenuItem("creer");
		mntmCreer.setHorizontalAlignment(SwingConstants.LEFT);
		mnAssos.add(mntmCreer);
		
		JMenuItem mntmModification = new JMenuItem("modification");
		mnAssos.add(mntmModification);
		
		JMenuItem mntmSupprimer = new JMenuItem("supprimer");
	
		mnAssos.add(mntmSupprimer);
		
		JMenuItem mntmVoir = new JMenuItem("voir");
		mnAssos.add(mntmVoir);
		
		JMenu mnAdh = new JMenu("Adherent");
		menuBar.add(mnAdh);
		
		JMenuItem mntmModificationCompte = new JMenuItem("modification compte");
		mnAdh.add(mntmModificationCompte);
		
		JMenuItem mntmAjouterAdhrent = new JMenuItem("ajouter adh\u00E9rent");
		mnAdh.add(mntmAjouterAdhrent);
		
		JMenuItem mntmSupprimerAdhrent = new JMenuItem("supprimer adh\u00E9rent");
		mnAdh.add(mntmSupprimerAdhrent);
		
		JMenuItem mntmValiderCompte = new JMenuItem("valider compte");
		mnAdh.add(mntmValiderCompte);
		
		JMenuItem mntmAjouterAdmin = new JMenuItem("ajouter admin");
		mnAdh.add(mntmAjouterAdmin);
		
		JMenu mnCompte = new JMenu("Compte");
		menuBar.add(mnCompte);
		
		JMenuItem mntmFaireUnDon = new JMenuItem("faire un don");
		mnCompte.add(mntmFaireUnDon);
		
		JMenuItem mntmmodifcompte = new JMenuItem("modification compte");
		mnCompte.add(mntmmodifcompte);
		
		JMenuItem mntmVosDons = new JMenuItem("vos dons");
		mnCompte.add(mntmVosDons);
		
		return menuBar;
	}
	
	public JPanel connexion() {
		
		JPanel connexion = new JPanel();
		connexion.setForeground(new Color(0, 0, 0));
		connexion.setBackground(new Color(176, 224, 230));
		connexion.setBounds(0, 0, 684, 645);
		connexion.setLayout(null);
		
		JLabel lblTitre = new JLabel("Bienvenue ASSOSoft");
		lblTitre.setBounds(192, 10, 300, 30);
		lblTitre.setForeground(new Color(0, 139, 139));
		lblTitre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		connexion.add(lblTitre);
		
		JLabel lblSousLignementTitre = new JLabel("_____________________________________");
		lblSousLignementTitre.setForeground(new Color(0, 139, 139));
		lblSousLignementTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSousLignementTitre.setBounds(192, 23, 300, 14);
		connexion.add(lblSousLignementTitre);
		
		JLabel lblTitre2 = new JLabel("Veuillez vous connectez, ou cr\u00E9er un compte.");
		lblTitre2.setBounds(184, 42, 316, 14);
		lblTitre2.setForeground(new Color(119, 136, 153));
		lblTitre2.setHorizontalAlignment(SwingConstants.CENTER);
		connexion.add(lblTitre2);
		
		JLabel lblIdentifiant = new JLabel("Identifiant :");
		lblIdentifiant.setForeground(new Color(0, 0, 0));
		lblIdentifiant.setBounds(231, 146, 86, 20);
		lblIdentifiant.setHorizontalAlignment(SwingConstants.RIGHT);
		connexion.add(lblIdentifiant);
		
		JTextField txtIdentifiant = new JTextField("123");
		txtIdentifiant.setBounds(347, 146, 106, 20);
		txtIdentifiant.setColumns(10);
		connexion.add(txtIdentifiant);
		
		JLabel lblMdp = new JLabel("Mot de passe :");
		lblMdp.setForeground(new Color(0, 0, 0));
		lblMdp.setBounds(231, 186, 86, 20);
		lblMdp.setHorizontalAlignment(SwingConstants.RIGHT);
		connexion.add(lblMdp);
		
		JPasswordField pwdMdp = new JPasswordField();
		pwdMdp.setBounds(347, 186, 106, 20);
		connexion.add(pwdMdp);
		
		JButton btnConnexion = new JButton("Connexion");
		btnConnexion.setBounds(285, 272, 114, 20);
		connexion.add(btnConnexion);
		
		JButton btnCreerCompte = new JButton("Cr\u00E9er Compte");
		btnCreerCompte.setBounds(285, 312, 114, 20);
		connexion.add(btnCreerCompte);
		
		
		return connexion;
	}
	
	public JPanel accueil() {
		
		JPanel accueil = new JPanel();
		accueil.setForeground(new Color(0, 0, 0));
		accueil.setBackground(new Color(176, 224, 230));
		accueil.setBounds(0, 0, 684, 645);
		accueil.setLayout(null);
		
		
		
		return accueil;
	}
	
	public JPanel dons() {
		
		JPanel dons = new JPanel();
		dons.setForeground(new Color(0, 0, 0));
		dons.setBackground(new Color(176, 224, 230));
		dons.setBounds(0, 0, 684, 645);
		dons.setLayout(null);
		
		JLabel lblTitre = new JLabel("Faire un Don");
		lblTitre.setBounds(192, 10, 300, 30);
		lblTitre.setForeground(new Color(0, 139, 139));
		lblTitre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		dons.add(lblTitre);
		
		JLabel lblsousLignementTitre = new JLabel("_______________________");
		lblsousLignementTitre.setBounds(192, 23, 300, 14);
		lblsousLignementTitre.setForeground(new Color(0, 139, 139));
		lblsousLignementTitre.setHorizontalAlignment(SwingConstants.CENTER);
		dons.add(lblsousLignementTitre);
		
		JLabel lblChoixAssos = new JLabel("Choix association :");
		lblChoixAssos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChoixAssos.setBounds(142, 134, 185, 20);
		dons.add(lblChoixAssos);
		
		JComboBox cbbChoixAssos = new JComboBox();
		cbbChoixAssos.setModel(new DefaultComboBoxModel(new String[] {"Choix Association"}));
		cbbChoixAssos.setBounds(357, 134, 185, 20);
		dons.add(cbbChoixAssos);
		
		JLabel lblAffAssos = new JLabel("Votre association :");
		lblAffAssos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAffAssos.setBounds(142, 174, 185, 20);
		dons.add(lblAffAssos);
		
		JTextField txtAffAssos = new JTextField();
		txtAffAssos.setText("Des milles et une nuits");
		txtAffAssos.setBounds(357, 174, 185, 20);
		dons.add(txtAffAssos);
		txtAffAssos.setColumns(10);
		
		JLabel lblTitre2 = new JLabel("Choix du payement :");
		lblTitre2.setBounds(142, 220, 185, 20);
		lblTitre2.setForeground(new Color(0, 139, 139));
		lblTitre2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitre2.setHorizontalAlignment(SwingConstants.LEFT);
		dons.add(lblTitre2);
		
		JLabel lblsousLignementTitre2 = new JLabel("__________________");
		lblsousLignementTitre2.setBounds(142, 224, 185, 14);
		lblsousLignementTitre2.setForeground(new Color(0, 139, 139));
		lblsousLignementTitre2.setHorizontalAlignment(SwingConstants.LEFT);
		dons.add(lblsousLignementTitre2);
		
		JRadioButton rdbtnLiquide = new JRadioButton("Liquide");
		rdbtnLiquide.setBackground(new Color(176, 224, 230));
		rdbtnLiquide.setBounds(142, 260, 109, 20);
		dons.add(rdbtnLiquide);
		
		JRadioButton rdbtnCarte = new JRadioButton("Carte bancaire");
		rdbtnCarte.setBackground(new Color(176, 224, 230));
		rdbtnCarte.setBounds(142, 290, 109, 20);
		dons.add(rdbtnCarte);
		
		JRadioButton rdbtnCheque = new JRadioButton("Ch\u00E8que");
		rdbtnCheque.setBackground(new Color(176, 224, 230));
		rdbtnCheque.setBounds(142, 320, 109, 20);
		dons.add(rdbtnCheque);
		
		JLabel lblMontantDon = new JLabel("Montant de votre Don :");
		lblMontantDon.setBounds(142, 380, 185, 20);
		lblMontantDon.setHorizontalAlignment(SwingConstants.RIGHT);
		dons.add(lblMontantDon);
		
		JTextField txtEuros = new JTextField();
		txtEuros.setHorizontalAlignment(SwingConstants.CENTER);
		txtEuros.setText("1000000000");
		txtEuros.setBounds(357, 380, 185, 20);
		dons.add(txtEuros);
		txtEuros.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(292, 450, 90, 20);
		btnValider.setHorizontalAlignment(SwingConstants.CENTER);
		dons.add(btnValider);
		
		return dons;
	}
	
	public JPanel voir() {
		
		JPanel voir = new JPanel();
		voir.setBackground(new Color(176, 224, 230));
		voir.setForeground(new Color(0, 0, 0));
		voir.setBounds(0, 0, 684, 645);
		voir.setLayout(null);
		
		JLabel lblTitre = new JLabel("Informations");
		lblTitre.setForeground(new Color(0, 139, 139));
		lblTitre.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setBounds(269, 11, 145, 30);
		voir.add(lblTitre);
		
		JLabel lblSousLignementTitre = new JLabel("____________________");
		lblSousLignementTitre.setForeground(new Color(0, 139, 139));
		lblSousLignementTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSousLignementTitre.setBounds(269, 24, 145, 14);
		voir.add(lblSousLignementTitre);
		
		JComboBox cbbChoixAssos = new JComboBox();
		cbbChoixAssos.setModel(new DefaultComboBoxModel(new String[] {"Choisissez une Association"}));
		cbbChoixAssos.setBounds(10, 125, 185, 20);
		voir.add(cbbChoixAssos);
		
		JLabel lblTitreCadreAssos = new JLabel("Association choisis");
		lblTitreCadreAssos.setForeground(new Color(0, 139, 139));
		lblTitreCadreAssos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitreCadreAssos.setBounds(10, 230, 185, 20);
		voir.add(lblTitreCadreAssos);
		
		// encadrement de l'association selectionner et affichage
		JLabel lblNomAssosChoisis = new JLabel();
		lblNomAssosChoisis.setForeground(new Color(0, 0, 0));
		lblNomAssosChoisis.setBorder(new LineBorder(new Color(0, 139, 139)));
		lblNomAssosChoisis.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomAssosChoisis.setBounds(10, 250, 185, 20);
		voir.add(lblNomAssosChoisis);
		
		JButton btnListeAdherent = new JButton("Liste des Adh\u00E9rents");
		btnListeAdherent.setBounds(10, 308, 185, 20);
		voir.add(btnListeAdherent);
		
		JButton btnListeBudget = new JButton("Budget");
		btnListeBudget.setBounds(10, 368, 185, 20);
		voir.add(btnListeBudget);
		
		JButton btnListePlanning = new JButton("Planning");
		btnListePlanning.setBounds(10, 428, 185, 20);
		voir.add(btnListePlanning);
		
		JButton btnListeDons = new JButton("Liste des Dons");
		btnListeDons.setBounds(10, 488, 185, 20);
		voir.add(btnListeDons);
		
		JLabel lblTitre2Planning = new JLabel("Planning");
		lblTitre2Planning.setForeground(new Color(0, 139, 139));
		lblTitre2Planning.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblTitre2Planning.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre2Planning.setBounds(383, 84, 100, 30);
		voir.add(lblTitre2Planning);
		
		JLabel lblTitre2Adh = new JLabel("Adh\u00E9rent");
		lblTitre2Adh.setForeground(new Color(0, 139, 139));
		lblTitre2Adh.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblTitre2Adh.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre2Adh.setBounds(383, 84, 100, 30);
		voir.add(lblTitre2Adh);
		
		JLabel lblTitre2Budget = new JLabel("Budget");
		lblTitre2Budget.setForeground(new Color(0, 139, 139));
		lblTitre2Budget.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre2Budget.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblTitre2Budget.setBounds(383, 84, 100, 30);
		voir.add(lblTitre2Budget);
		
		JLabel lblTitre2Dons = new JLabel("Dons");
		lblTitre2Dons.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblTitre2Dons.setForeground(new Color(0, 139, 139));
		lblTitre2Dons.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre2Dons.setBounds(383, 84, 100, 30);
		voir.add(lblTitre2Dons);
		
		JTable table = new JTable();
		table.setBounds(214, 125, 438, 471);
		voir.add(table);
		
		return voir;
	}
	
	public JPanel CreaCompte() {
		
		JPanel CreaCompte = new JPanel();
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
		
		return CreaCompte;
	}
	
	public JPanel validCompte() {
		
		JPanel validCompte = new JPanel();
		validCompte.setBackground(new Color(176, 224, 230));
		validCompte.setBounds(0, 0, 684, 645);
		validCompte.setLayout(null);
		
		JLabel lblTitre = new JLabel("Validation Compte");
		lblTitre.setForeground(new Color(0, 139, 139));
		lblTitre.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setBounds(192, 11, 300, 30);
		validCompte.add(lblTitre);
		
		JLabel lblSousLignementTitre = new JLabel("_____________________________");
		lblSousLignementTitre.setForeground(new Color(0, 139, 139));
		lblSousLignementTitre.setBounds(192, 23, 300, 14);
		lblSousLignementTitre.setHorizontalAlignment(SwingConstants.CENTER);
		validCompte.add(lblSousLignementTitre);
		
		JComboBox cbbListeCompte = new JComboBox();
		cbbListeCompte.setModel(new DefaultComboBoxModel(new String[] {"Comptes à Valider"}));
		cbbListeCompte.setBounds(250, 74, 185, 20);
		validCompte.add(cbbListeCompte);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(80, 124, 185, 20);
		lblNom.setHorizontalAlignment(SwingConstants.RIGHT);
		validCompte.add(lblNom);
		
		JTextField txtNom = new JTextField();
		txtNom.setBounds(315, 124, 185, 20);
		txtNom.setColumns(10);
		validCompte.add(txtNom);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setBounds(80, 164, 185, 20);
		lblPrenom.setHorizontalAlignment(SwingConstants.RIGHT);
		validCompte.add(lblPrenom);
		
		JTextField txtPrenom = new JTextField();
		txtPrenom.setBounds(315, 164, 185, 20);
		txtPrenom.setColumns(10);
		validCompte.add(txtPrenom);
		
		JLabel lblDate = new JLabel("Date de naissance :");
		lblDate.setBounds(80, 204, 185, 20);
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		validCompte.add(lblDate);
		
		JTextField txtDate = new JTextField();
		txtDate.setBounds(315, 204, 185, 20);
		txtDate.setColumns(10);
		validCompte.add(txtDate);
		
		JLabel lblMail = new JLabel("Mail :");
		lblMail.setBounds(80, 244, 185, 20);
		lblMail.setHorizontalAlignment(SwingConstants.RIGHT);
		validCompte.add(lblMail);
		
		JTextField txtMail = new JTextField();
		txtMail.setBounds(315, 244, 185, 20);
		txtMail.setColumns(10);
		validCompte.add(txtMail);
		
		JLabel lblTel = new JLabel("N° de Téléphone :");
		lblTel.setBounds(80, 284, 185, 20);
		lblTel.setHorizontalAlignment(SwingConstants.RIGHT);
		validCompte.add(lblTel);
		
		JTextField txtTel = new JTextField();
		txtTel.setBounds(315, 284, 185, 20);
		txtTel.setColumns(10);
		validCompte.add(txtTel);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(80, 324, 185, 20);
		lblAdresse.setHorizontalAlignment(SwingConstants.RIGHT);
		validCompte.add(lblAdresse);
		
		JTextField txtAdresse = new JTextField();
		txtAdresse.setBounds(315, 324, 185, 20);
		txtAdresse.setColumns(10);
		validCompte.add(txtAdresse);
		
		// TypeCompte = Adherent ou contact ou admin
		JLabel lblTypeCompte = new JLabel("Type de Compte :");
		lblTypeCompte.setBounds(80, 364, 185, 20);
		lblTypeCompte.setHorizontalAlignment(SwingConstants.RIGHT);
		validCompte.add(lblTypeCompte);
		
		JTextField txtTypeCompte = new JTextField();
		txtTypeCompte.setBounds(315, 364, 185, 20);
		txtTypeCompte.setColumns(10);
		validCompte.add(txtTypeCompte);
		
		JLabel lblNomAssos = new JLabel("Nom Association :");
		lblNomAssos.setBounds(80, 404, 185, 20);
		lblNomAssos.setHorizontalAlignment(SwingConstants.RIGHT);
		validCompte.add(lblNomAssos);
		
		JTextField txtNomAssos = new JTextField();
		txtNomAssos.setBounds(315, 404, 185, 20);
		txtNomAssos.setColumns(10);
		validCompte.add(txtNomAssos);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(167, 484, 92, 20);
		validCompte.add(btnValider);
		
		JButton btnRefuser = new JButton("Refuser");
		btnRefuser.setBounds(406, 484, 92, 20);
		validCompte.add(btnRefuser);
		
		
		return validCompte;
	}
	
	public JPanel modifCompte() {
		
		JPanel modifCompte = new JPanel();
		modifCompte.setBackground(new Color(176, 224, 230));
		modifCompte.setBounds(0, 0, 684, 645);
		modifCompte.setLayout(null);
		
		JLabel lblTitre = new JLabel("Modification Compte");
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblTitre.setForeground(new Color(0, 139, 139));
		lblTitre.setBounds(192, 10, 300, 30);
		modifCompte.add(lblTitre);
		
		JLabel lblSousLignementTitre = new JLabel("__________________________________________");
		lblSousLignementTitre.setForeground(new Color(0, 139, 139));
		lblSousLignementTitre.setBounds(192, 23, 300, 14);
		modifCompte.add(lblSousLignementTitre);
		
		JComboBox cbbListeCompte = new JComboBox();
		cbbListeCompte.setModel(new DefaultComboBoxModel(new String[] {"Compte à Valider"}));
		cbbListeCompte.setBounds(58, 166, 106, 20);
		modifCompte.add(cbbListeCompte);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(304, 124, 106, 20);
		modifCompte.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setBounds(439, 124, 106, 20);
		modifCompte.add(lblPrenom);
		
		JLabel lblDate = new JLabel("Date de naissance :");
		lblDate.setBounds(304, 190, 106, 20);
		modifCompte.add(lblDate);
		
		JLabel lblMail = new JLabel("Mail :");
		lblMail.setBounds(439, 190, 106, 20);
		modifCompte.add(lblMail);
		
		JTextField txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(259, 92, 106, 20);
		modifCompte.add(txtMail);
		
		JLabel lblTel = new JLabel("N° de Téléphone :");
		lblTel.setBounds(304, 261, 106, 20);
		modifCompte.add(lblTel);
		
		JTextField txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(259, 92, 106, 20);
		modifCompte.add(txtTel);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(439, 261, 106, 20);
		modifCompte.add(lblAdresse);
		
		JTextArea txtAreaAdresse = new JTextArea();
		txtAreaAdresse.setColumns(10);
		txtAreaAdresse.setBounds(259, 92, 106, 20);
		modifCompte.add(txtAreaAdresse);
		
		// TypeCompte = Adherent ou contact ou admin
		JLabel lblTypeCompte = new JLabel("Type de Compte :");
		lblTypeCompte.setBounds(377, 329, 106, 20);
		modifCompte.add(lblTypeCompte);
		
		JLabel lblNomAssos = new JLabel("Nom Association :");
		lblNomAssos.setBounds(377, 329, 106, 20);
		modifCompte.add(lblNomAssos);
		
		JButton btnValider = new JButton("Valider Modification");
		btnValider.setBounds(156, 461, 106, 20);
		modifCompte.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(377, 461, 106, 20);
		modifCompte.add(btnAnnuler);
		
		
		
		return modifCompte;
	}
	
	public JPanel suppCompte() {
		
		JPanel suppCompte = new JPanel();
		suppCompte.setForeground(new Color(0, 0, 0));
		suppCompte.setBackground(new Color(176, 224, 230));
		suppCompte.setBounds(0, 0, 684, 645);
		suppCompte.setLayout(null);
		
		JLabel lblTitre = new JLabel("Suppression de Compte");
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblTitre.setForeground(new Color(0, 139, 139));
		lblTitre.setBounds(192, 11, 300, 30);
		suppCompte.add(lblTitre);
		
		JLabel lblSousLignement = new JLabel("____________________________________");
		lblSousLignement.setHorizontalAlignment(SwingConstants.CENTER);
		lblSousLignement.setForeground(new Color(0, 139, 139));
		lblSousLignement.setBounds(192, 23, 300, 14);
		suppCompte.add(lblSousLignement);
		
		JComboBox cbbListeCompte = new JComboBox();
		cbbListeCompte.setModel(new DefaultComboBoxModel(new String[] {"Compte à Supprimer"}));
		cbbListeCompte.setBounds(250, 166, 185, 20);
		suppCompte.add(cbbListeCompte);
		
		JButton btnValider = new JButton("Valider Suppression");
		btnValider.setBounds(250, 461, 185, 20);
		suppCompte.add(btnValider);
		
		return suppCompte;
	}
	
	public JPanel creaAssos() {
		
		JPanel creaAssos = new JPanel();
		creaAssos.setBackground(new Color(176, 224, 230));
		creaAssos.setBounds(0, 0, 684, 645);
		creaAssos.setLayout(null);
		
		JLabel lbltitre = new JLabel("Cr\u00E9er une Association");
		lbltitre.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitre.setForeground(new Color(0, 139, 139));
		lbltitre.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lbltitre.setBounds(192, 11, 300, 30);
		creaAssos.add(lbltitre);
		
		JLabel lblsousLignementTitre = new JLabel("__________________________________");
		lblsousLignementTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblsousLignementTitre.setForeground(new Color(0, 139, 139));
		lblsousLignementTitre.setBounds(192, 23, 300, 14);
		creaAssos.add(lblsousLignementTitre);
		
		JLabel lblChoixAssociation = new JLabel("Selectionnez une association :");
		lblChoixAssociation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChoixAssociation.setBounds(43, 64, 185, 20);
		creaAssos.add(lblChoixAssociation);
		
		JComboBox cbbChoixAssociation = new JComboBox();
		cbbChoixAssociation.setBounds(249, 64, 185, 20);
		creaAssos.add(cbbChoixAssociation);
		
		JLabel lblNomAsso = new JLabel("Nom Association :");
		lblNomAsso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomAsso.setBounds(43, 104, 185, 20);
		creaAssos.add(lblNomAsso);
		
		JTextField txtNomAssos = new JTextField();
		txtNomAssos.setColumns(10);
		txtNomAssos.setBounds(249, 104, 185, 20);
		creaAssos.add(txtNomAssos);
		
		JLabel lblNomAdmin = new JLabel("Nom Admin :");
		lblNomAdmin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomAdmin.setBounds(43, 144, 185, 20);
		creaAssos.add(lblNomAdmin);
		
		JTextField txtNomAdmin = new JTextField();
		txtNomAdmin.setBounds(249, 144, 185, 20);
		creaAssos.add(txtNomAdmin);
		txtNomAdmin.setColumns(10);
		
		JLabel lblPrenomAdmin = new JLabel("Pr\u00E9nom Admin :");
		lblPrenomAdmin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrenomAdmin.setBounds(43, 184, 185, 20);
		creaAssos.add(lblPrenomAdmin);
		
		JTextField txtPrenomAdmin = new JTextField();
		txtPrenomAdmin.setBounds(249, 184, 185, 20);
		creaAssos.add(txtPrenomAdmin);
		txtPrenomAdmin.setColumns(10);
		
		JLabel lblDateNaissanceAdmin = new JLabel("Date de naissance  Admin :");
		lblDateNaissanceAdmin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateNaissanceAdmin.setBounds(43, 224, 185, 20);
		creaAssos.add(lblDateNaissanceAdmin);
		
		JTextField txtJourNaissance = new JTextField();
		txtJourNaissance.setColumns(10);
		txtJourNaissance.setBounds(249, 224, 20, 20);
		creaAssos.add(txtJourNaissance);
		
		JLabel lblSeparateurJourMois = new JLabel(" /");
		lblSeparateurJourMois.setBounds(269, 224, 7, 20);
		creaAssos.add(lblSeparateurJourMois);
		
		JTextField txtMoisNaissance = new JTextField();
		txtMoisNaissance.setColumns(10);
		txtMoisNaissance.setBounds(276, 224, 20, 20);
		creaAssos.add(txtMoisNaissance);
		
		JLabel lblSeparateurMoisAnnee = new JLabel(" /");
		lblSeparateurMoisAnnee.setBounds(296, 224, 7, 20);
		creaAssos.add(lblSeparateurMoisAnnee);
		
		JTextField txtAnneeNaissance = new JTextField();
		txtAnneeNaissance.setColumns(10);
		txtAnneeNaissance.setBounds(303, 224, 34, 20);
		creaAssos.add(txtAnneeNaissance);
		
		JLabel lblMail = new JLabel("Mail Association :");
		lblMail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMail.setBounds(43, 264, 185, 20);
		creaAssos.add(lblMail);
				
		JTextField txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(249, 264, 185, 20);
		creaAssos.add(txtMail);
		
		JLabel lblTel = new JLabel("N\u00B0 T\u00E9l\u00E9phone Association :");
		lblTel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTel.setBounds(43, 304, 185, 20);
		creaAssos.add(lblTel);
		
		JTextField txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(249, 304, 185, 20);
		creaAssos.add(txtTel);
		
		JLabel lblAdresse = new JLabel("Adresse Association :");
		lblAdresse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdresse.setBounds(43, 344, 185, 20);
		creaAssos.add(lblAdresse);
		
		JTextArea txtAreaAdresse = new JTextArea();
		txtAreaAdresse.setBounds(249, 344, 185, 58);
		creaAssos.add(txtAreaAdresse);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(249, 424, 185, 20);
		creaAssos.add(btnValider);
		
		
		return creaAssos;
	}
	
	public JPanel modifAssos() {
		
		JPanel modifAssos = new JPanel();
		modifAssos.setForeground(new Color(0, 0, 0));
		modifAssos.setBackground(new Color(176, 224, 230));
		modifAssos.setBounds(0, 0, 684, 645);
		modifAssos.setLayout(null);
		
		return modifAssos;
	}
	
	public JPanel suppAssos() {
		
		JPanel suppAssos = new JPanel();
		suppAssos.setForeground(new Color(0, 0, 0));
		suppAssos.setBackground(new Color(176, 224, 230));
		suppAssos.setBounds(0, 0, 684, 645);
		suppAssos.setLayout(null);
		
		return suppAssos;
	}
	
}
