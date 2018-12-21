package classeProjet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.DriverManager;
import java.sql.Statement;

public class Crud {
	
	private String url;
	private String user;
	private String passwd;
	private Connection connection;
	private Statement stm;
	
	public Crud()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			url = "jdbc:mysql://localhost:3306/assosoft";
			user = "root";
			passwd = "";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public Crud(String url, String user, String passwd)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.url = url;
			this.user = user;
			this.passwd = passwd;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void connection() throws SQLException
	{
		connection = DriverManager.getConnection(url, user, passwd);
		stm = connection.createStatement();
	}
	
	public void add(String table,Object objet)
	{
		if(table == "personne")
		{
			try {
				stm.executeUpdate("INSERT INTO "+table+"(NOM,PRENOM,ADRESSE,TEL,MAIL,MDP,LEVEL) VALUES ('"+((Personne) objet).getNom()+"','"+((Personne) objet).getPrenom()+"','"+((Personne) objet).getAdresse()+"',"+((Personne) objet).getTel()+",'"+((Personne) objet).getMail()+"','"+((Personne) objet).getMdp()+"',"+((Personne) objet).getLvl()+")");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Votre ligne a ete insere !", "Information", JOptionPane.INFORMATION_MESSAGE);
		}
		if(table == "association")	
		{
			try {
				stm.executeUpdate("INSERT INTO "+table+"(TEL,ADRESSE,NOM,MAIL) VALUES ('"+((Association) objet).getTel()+"','"+((Association) objet).getAdresse()+"','"+((Association) objet).getNom()+"','"+((Association) objet).getMail()+"')");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Votre ligne a ete insere !", "Information", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void deconnection() throws SQLException
	{
		connection.close();
	} 
}
