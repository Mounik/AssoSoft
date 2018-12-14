import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestDelete {
	// On initialise à zéro les variables dont on aura besoin
	static int nd = 0;

	public static void main(String[] args) {
		// On crée notre modele de fenetre
		JFrame frmAjoutDatabase;
		JTextField txtND;
		
		frmAjoutDatabase = new JFrame();
		frmAjoutDatabase.setTitle("Operation Database");
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
		
		
		JButton effacer = new JButton("Effacer");
		frmAjoutDatabase.getContentPane().add(effacer, BorderLayout.SOUTH);
		
		// On met un ActionListener sur le bouton effacer
		effacer.addActionListener(new ActionListener()
				{
			public void actionPerformed( ActionEvent e )
			{
				try {
					// On initialise les variables
					nd = Integer.parseInt(txtND.getText());;
					
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
					
					// On delete en fonction du département
					stm.executeUpdate("DELETE FROM dept WHERE ND="+nd+"");

					// On frime en affichant une fenetre pour dire que tout s'est bien passé
					JOptionPane.showMessageDialog(null, "Tout s'est bien passé", "O.K.", JOptionPane.INFORMATION_MESSAGE);
					
					// On reset l'affichage entrée dans les champs de texte
					txtND.setText("");
					System.out.println("Reset de l'affichage");
										
					// On ferme tout
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
