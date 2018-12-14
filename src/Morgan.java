import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Morgan {
	 
	 static int nd = 0;
	 static int ndb = 0;
	 static String nom = "";
	 static String ville = "";
	 static int nbemp = 0;
	 
public static void main(String[] args) {
	
	 
	//************************************ INITIALISATION **********************************************
	 JFrame fenetre = new JFrame();
	 JFrame fenetre2 = new JFrame();
	 JFrame fenetre3 = new JFrame();
	 JPanel panel = new JPanel();
	 JPanel panel2 = new JPanel();
	 JButton bouton = new JButton("Ajouter");
	 JButton bouton2 = new JButton("Recherche");
	 JButton bouton3 = new JButton("Modifier");
	 JButton bouton4 = new JButton("Supprimer");
	 JButton bouton5 = new JButton("Afficher");
	 JLabel label1 = new JLabel("ND");
	 JLabel label2 = new JLabel("Nom");
	 JLabel label3 = new JLabel("Ville");
	 JLabel label4 = new JLabel("NBemp");
	 JLabel label5 = new JLabel("ND");
	 JLabel label6 = new JLabel("Nom");
	 JLabel label7 = new JLabel("Ville");
	 JLabel label8 = new JLabel("NBemp");
	 JTextField edit1 = new JTextField("");
	 JTextField edit2 = new JTextField("");
	 JTextField edit3 = new JTextField("");
	 JTextField edit4 = new JTextField("");
	 JTextField edit5 = new JTextField("");
	 JTextField edit6 = new JTextField("");
	 JTextField edit7 = new JTextField("");
	 JTextField edit8 = new JTextField("");
	 JTextField edit9 = new JTextField("");
	 //static public JOptionPane jop = new JOptionPane();
	 edit1.setPreferredSize(new Dimension(80,20));
	 edit2.setPreferredSize(new Dimension(80,20));
	 edit3.setPreferredSize(new Dimension(80,20));
	 edit4.setPreferredSize(new Dimension(80,20));
	 edit5.setPreferredSize(new Dimension(80,20));
	 edit6.setPreferredSize(new Dimension(90,20));
	 edit7.setPreferredSize(new Dimension(90,20));
	 edit8.setPreferredSize(new Dimension(90,20));
	 edit9.setPreferredSize(new Dimension(90,20));
	 
	 fenetre.setSize(315,500);
	 fenetre.setTitle("Ajouter Departement");
	 fenetre2.setSize(310,500);		 
	 fenetre2.setTitle("Imformation Departement");
	 fenetre3.setTitle("JTable");
	 fenetre3.setSize(310,500);

	 //******************************************** AJOUT AU PANEL ******************************
	 
	 panel.setLayout(new FlowLayout(FlowLayout.CENTER,60,40));
	 fenetre.setContentPane(panel);
	 panel2.setLayout(new FlowLayout(FlowLayout.CENTER,60,40));
	 fenetre2.setContentPane(panel2);
	 panel.add(edit5);
	 panel.add(bouton2);
	 panel.add(label1);
	 panel.add(edit1);
	 panel.add(label2);
	 panel.add(edit2);
	 panel.add(label3);
	 panel.add(edit3);
	 panel.add(label4);
	 panel.add(edit4);
	 panel.add(bouton);
	 panel.add(bouton5);
	 panel2.add(label5);
	 panel2.add(edit6);
	 panel2.add(label6);
	 panel2.add(edit7);
	 panel2.add(label7);
	 panel2.add(edit8);
	 panel2.add(label8);
	 panel2.add(edit9);
	 panel2.add(bouton3);
	 panel2.add(bouton4);
	 
	
	 
		
	 //************************************** BOUTON AJOUT **********************************
		bouton.addActionListener(new ActionListener() 
		{
			public void actionPerformed( ActionEvent e )
			{
			 try {
				  nd = Integer.parseInt(edit1.getText());
				  nom = edit2.getText();
				  ville = edit3.getText();
				  nbemp = Integer.parseInt(edit4.getText());
				  Class.forName("com.mysql.jdbc.Driver").newInstance();
			      System.out.println("Driver O.K.");

			      String url = "jdbc:mysql://localhost:3306/basedemo";
			      String user = "root";
			      String passwd = "";
			      Connection connection = DriverManager.getConnection(url, user, passwd);
			      Statement stm = connection.createStatement();
			      System.out.println("Connexion effective !");
			      stm.executeUpdate("INSERT INTO dept(ND,NOM,VILLE,NBEMP) VALUES ("+nd+",'"+nom+"','"+ville+"',"+nbemp+")");
			      JOptionPane.showMessageDialog(null, "Votre ligne a ete insere !", "Information", JOptionPane.INFORMATION_MESSAGE);
			      edit1.setText("");
			      edit2.setText("");
			      edit3.setText("");
			      edit4.setText("");
			      System.out.println("Connexion effective !");
			      ResultSet Resultat;
				  Resultat = stm.executeQuery("SELECT ND,NOM,VILLE,NBEMP FROM dept");
				  while(Resultat.next())
				  {
					  int i = Resultat.getInt("ND");
					  String nom2 = Resultat.getString("NOM");
					  String ville2 = Resultat.getString("VILLE");
					  int j = Resultat.getInt("NBEMP");
					  System.out.println(i + " " + nom2 + " " + ville2 + " " + j);
				  }
				  Resultat.close();
				  connection.close();
			 }catch(Exception ex)
			 {
			  System.out.println ("la connexion a echoue"); 
			 }
			}  
		}); 
		
		//********************************************* BOUTON RECHERCHE *****************************************
		
		bouton2.addActionListener(new ActionListener() 
		{
			public void actionPerformed( ActionEvent e )
			{
			 try 
			 {
				  
				 Class.forName("com.mysql.jdbc.Driver").newInstance();
			      System.out.println("Driver O.K.");
			      nd =  Integer.parseInt(edit5.getText());
			      String url = "jdbc:mysql://localhost:3306/basedemo";
			      String user = "root";
			      String passwd = "";
			      Connection connection = DriverManager.getConnection(url, user, passwd);
			      Statement stm = connection.createStatement();
			      System.out.println("Connexion effective !");
			      //JOptionPane.showMessageDialog(null, "Votre ligne a ete insere !", "Information", JOptionPane.INFORMATION_MESSAGE);
			      ResultSet Resultat1;
			      //System.out.println("SELECT ND,NOM,VILLE,NBEMP FROM dept WHERE ND = "+nd);
				  Resultat1 = stm.executeQuery("SELECT ND,NOM,VILLE,NBEMP FROM dept WHERE ND = "+nd);
				  Resultat1.next();
				  edit6.setText(Integer.toString(Resultat1.getInt("ND")));
				  edit7.setText(Resultat1.getString("NOM"));
				  edit8.setText(Resultat1.getString("VILLE"));
				  edit9.setText(Integer.toString(Resultat1.getInt("NBEMP")));
				  System.out.println("Connexion effective !");
				  Resultat1.close();
				  connection.close();
				  fenetre2.setVisible(true);
			 }catch(Exception ex)
			 {
				 
				 System.out.println ("la connexion a echoue");
			 }				
			}
		});

		//***************************************  BOUTON MODIFIER *****************************************
		
		bouton3.addActionListener(new ActionListener() 
		{
			public void actionPerformed( ActionEvent e )
			{
				 try 
				 {
				  nd = Integer.parseInt(edit6.getText());
				  nom = edit7.getText();
				  ville = edit8.getText();
				  nbemp = Integer.parseInt(edit9.getText());
				  Class.forName("com.mysql.jdbc.Driver").newInstance();
			      System.out.println("Driver O.K.");
			      ndb =  Integer.parseInt(edit5.getText());
			      String url = "jdbc:mysql://localhost:3306/basedemo";
			      String user = "root";
			      String passwd = "";
			      Connection connection = DriverManager.getConnection(url, user, passwd);
			      Statement stm = connection.createStatement();
				  stm.executeUpdate("UPDATE dept SET ND="+nd+", NOM='"+nom+"', VILLE='"+ville+"', NBEMP="+nbemp+" WHERE ND = "+ndb);
				  JOptionPane.showMessageDialog(null, "Votre ligne a ete modifie !", "Information", JOptionPane.INFORMATION_MESSAGE);
				  connection.close();
				 }catch(Exception ex)
				 {
					 
					 System.out.println ("la connexion a echoue");
				 }
				
			}
			
		});
		
		//******************************************* BOUTON SUPPRIMER **************************
		
		bouton4.addActionListener(new ActionListener() 
		{
			public void actionPerformed( ActionEvent e )
			{
				try 
				 {
				  ndb =  Integer.parseInt(edit5.getText());
				  Class.forName("com.mysql.jdbc.Driver").newInstance();
			      System.out.println("Driver O.K.");
			      String url = "jdbc:mysql://localhost:3306/basedemo";
			      String user = "root";
			      String passwd = "";
			      Connection connection = DriverManager.getConnection(url, user, passwd);
			      Statement stm = connection.createStatement();
			      System.out.println("DELETE FROM dept WHERE ND="+ndb);
				  stm.executeUpdate("DELETE FROM dept WHERE ND="+ndb);
				  JOptionPane.showMessageDialog(null, "Votre ligne a ete supprime !", "Information", JOptionPane.INFORMATION_MESSAGE);
				  connection.close();
				 }catch(Exception ex)
				 {
					 
					 System.out.println ("la connexion a echoue");
				 }
			}
			
		});
		
		//************************************************* BOUTON AFFICHER ************************************
		
		bouton5.addActionListener(new ActionListener() 
		{
			public void actionPerformed( ActionEvent e )
			{
			 try 
			 {
				 int h =0;
				 String[][] donnee;
				 String[] entetes ;
				  Class.forName("com.mysql.jdbc.Driver").newInstance();
			      System.out.println("Driver O.K.");

			      String url = "jdbc:mysql://localhost:3306/basedemo";
			      String user = "root";
			      String passwd = "";
			      Connection connection = DriverManager.getConnection(url, user, passwd);
			      Statement stm = connection.createStatement();
			      System.out.println("Connexion effective !");
			      ResultSet resultat3,resultat4;
			      ResultSetMetaData metadata;
				  resultat3 = stm.executeQuery("SELECT ND,NOM,VILLE,NBEMP FROM dept");
				  metadata = resultat3.getMetaData();
				  
				  resultat4 = stm.executeQuery("SELECT count(*) AS nbl FROM dept" );
				  System.out.println("SELECT effective !");
				  resultat4.next(); 
				  System.out.println(resultat4.getInt("nbl"));
				  donnee = new String[resultat4.getInt("nbl")][metadata.getColumnCount()];
				  entetes = new String[metadata.getColumnCount()];
				  for (int y = 0; y <(metadata.getColumnCount()); y++)
				  {
					  System.out.println( metadata.getColumnName(y+1));
					  entetes[y] = metadata.getColumnName(y+1);

				  }
				  System.out.println("metadata effective !");
				  resultat3 = stm.executeQuery("SELECT ND,NOM,VILLE,NBEMP FROM dept");
				  while(resultat3.next())
				  {
					  System.out.println("ligne effective !");
					  donnee[h][0] = Integer.toString(resultat3.getInt("ND"));
					  donnee[h][1] = resultat3.getString("NOM");
					  donnee[h][2] = resultat3.getString("VILLE");
					  donnee[h][3] = Integer.toString(resultat3.getInt("NBEMP"));
					  
					  h++;
						  
				  }
				  System.out.println("Tableau donnees effective !");
				  
				  JTable tableau = new JTable(donnee,entetes);
				  System.out.println("JT effective !");
			      fenetre3.getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
			      fenetre3.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
			      
			      fenetre3.setVisible(true);
				  resultat3.close();
				  resultat4.close();
				  connection.close();
			 }catch(Exception ex)
			 {
				 System.out.println ("l affichage a echoue");
			 }
			}
		});
			
		fenetre.setVisible(true);
	 
}

}