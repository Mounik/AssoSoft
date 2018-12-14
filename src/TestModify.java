import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestModify {
	// On initialise à zéro les variables dont on aura besoin
	static int nd = 0;
	static String nom = "";
	static String ville = "";
	static int nbemp = 0;

	public static void main(String[] args) {
		// On crée notre modele de fenetre
		JFrame frmAjoutDatabase;
		JTextField txtND;
		JTextField txtNOM;
		JTextField txtVILLE;
		JTextField txtNBEMP;
		
		frmAjoutDatabase = new JFrame();
		frmAjoutDatabase.setTitle("Ajout Database");
		frmAjoutDatabase.setBounds(100, 100, 800, 120);
		frmAjoutDatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAjoutDatabase.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmAjoutDatabase.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel ND = new JLabel("ND");
		panel.add(ND);
		
		txtND = new JTextField();
		panel.add(txtND);
		txtND.setColumns(10);
		
		JLabel NOM = new JLabel("NOM");
		panel.add(NOM);
		
		txtNOM = new JTextField();
		panel.add(txtNOM);
		txtNOM.setColumns(10);
		
		JLabel VILLE = new JLabel("VILLE");
		panel.add(VILLE);
		
		txtVILLE = new JTextField();
		panel.add(txtVILLE);
		txtVILLE.setColumns(10);
		
		JLabel NBEMP = new JLabel("NBEMP");
		panel.add(NBEMP);
		
		txtNBEMP = new JTextField();
		panel.add(txtNBEMP);
		txtNBEMP.setColumns(10);
		
		JButton select = new JButton("Select");
		frmAjoutDatabase.getContentPane().add(select, BorderLayout.SOUTH);
		JButton update = new JButton("Update");
		frmAjoutDatabase.getContentPane().add(update, BorderLayout.SOUTH);

		
		// On met un ActionListener sur le bouton Update
		update.addActionListener(new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				try {
					// On initialise les variables
					nd = Integer.parseInt(txtND.getText());
					nom = txtNOM.getText();
					ville = txtVILLE.getText();
					nbemp = Integer.parseInt(txtNBEMP.getText());
					
					// On installe le driver
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					System.out.println("Driver O.K.");
					
					// On se connecte a la base de données (en mysql, localhot + le port, nom de la table)
					String url = ("jdbc:mysql://localhost:3306/demo");
					
					// Nom d'utilisateur
					String user = "root";
					// Password
					String passwd = "";
					// On vérifie la connection
					Connection connection = DriverManager.getConnection(url, user, passwd);
					
					// On crée l'état a partir de la connection
					Statement stm = connection.createStatement();
					System.out.println("Connecté !");
					
					// On crée la modification (UPDATE)
					stm.executeUpdate("UPDATE dept SET NOM='"+nom+"', VILLE='"+ville+"', NBEMP="+nbemp+" WHERE ND="+nd);
					
					// On frime en affichant une fenetre pour dire que tout s'est bien passé
					JOptionPane.showMessageDialog(null, "Tout s'est bien passé", "O.K.", JOptionPane.INFORMATION_MESSAGE);
					
					// On reset l'affichage entrée dans les champs de texte
					txtND.setText("");
					txtNOM.setText("");
					txtVILLE.setText("");
					txtNBEMP.setText("");
					System.out.println("Reset de l'affichage");
					
					// On stocke le resultat dans une variable qui effectue la requete SQL
					ResultSet Resultat;
					Resultat = stm.executeQuery("SELECT ND, NOM, VILLE, NBEMP FROM dept");
					while(Resultat.next()) {
						int i = Resultat.getInt("ND");
						String nom2 = Resultat.getString("NOM");
						String ville2 = Resultat.getString("VILLE");
						int j = Resultat.getInt("NBEMP");
						//On affiche le tout 
						System.out.println(i + " " + nom2 + " " + ville2 + " " + j);
					}
					// On ferme tout
					Resultat.close();
					connection.close();
					
				} catch (Exception erreur) {
					System.out.println(erreur.getMessage());
				}
			}
		});
		// On met un ActionListener sur le bouton Select
		select.addActionListener(new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				try {
					// On initialise les variables
					nd = Integer.parseInt(txtND.getText());
					nom = txtNOM.getText();
					ville = txtVILLE.getText();
					nbemp = Integer.parseInt(txtNBEMP.getText());
					
					// On installe le driver
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					System.out.println("Driver O.K.");
					
					// On se connecte a la base de données (en mysql, localhot + le port, nom de la table)
					String url = ("jdbc:mysql://localhost:3306/demo");
					
					// Nom d'utilisateur
					String user = "root";
					// Password
					String passwd = "";
					// On vérifie la connection
					Connection connection = DriverManager.getConnection(url, user, passwd);
					
					// On crée l'état a partir de la connection
					Statement stm = connection.createStatement();
					System.out.println("Connecté !");
					
					// On crée l'insertion généré par l'event du bouton (SELECT SQL)
					stm.executeUpdate("SELECT ND, NOM, VILLE, NBEMP FROM dept");
					
					// On frime en affichant une fenetre pour dire que tout s'est bien passé
					JOptionPane.showMessageDialog(null, "Tout s'est bien passé", "O.K.", JOptionPane.INFORMATION_MESSAGE);
					
					// On reset l'affichage entrée dans les champs de texte
					txtND.setText("");
					txtNOM.setText("");
					txtVILLE.setText("");
					txtNBEMP.setText("");
					System.out.println("Reset de l'affichage");
					
					// On stocke le resultat dans une variable qui effectue une requete SQL qui affiche le tableau actuel
					ResultSet Resultat;
					Resultat = stm.executeQuery("SELECT ND, NOM, VILLE, NBEMP FROM dept");
					while(Resultat.next()) {
					int i = Resultat.getInt("ND");
					String nom2 = Resultat.getString("NOM");
					String ville2 = Resultat.getString("VILLE");
					int j = Resultat.getInt("NBEMP");
					//On affiche le tout 
					System.out.println(i + " " + nom2 + " " + ville2 + " " + j);
					}
					// On ferme tout
					Resultat.close();
					connection.close();
					
				} catch (Exception erreur) {
					System.out.println(erreur.getMessage());
				}
			}
		});
		// On rend notre fenetre visible
		frmAjoutDatabase.setVisible(true);
	}
}
