package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.Personne;
	public class PersonneDao {
	
	// On établit la connection avec la BDD
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assosoft","root","");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	
	// Sauvegarde dans la base
	public static int save(Personne u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into personne(nom,prenom,tel,mail,adresse,mdp,level,idassociation) values(?,?,?,?,?,?,?,?)");
			ps.setString(1,u.getNom());
			ps.setString(2,u.getPrenom());
			ps.setString(3,u.getTel());
			ps.setString(4,u.getMail());
			ps.setString(5,u.getAdresse());
			ps.setString(6,u.getMdp());
			ps.setInt(7,u.getLevel());
			ps.setString(8,u.getAssociation());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	// Modification dans la base
	public static int update(Personne u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("update personne set nom=?,prenom=?,tel=?,mail=?,adresse=?,mdp=?,level=?,idassociation=? where idpersonne=?");
			ps.setString(1,u.getNom());
			ps.setString(2,u.getPrenom());
			ps.setString(3,u.getTel());
			ps.setString(4,u.getMail());
			ps.setString(5,u.getAdresse());
			ps.setString(6,u.getMdp());
			ps.setInt(7,u.getLevel());
			ps.setString(8,u.getAssociation());
			ps.setInt(9,u.getId());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	// Efface de la base
	public static int delete(Personne u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("delete from personne where idpersonne=?");
			ps.setInt(1,u.getId());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
	
		return status;
	}
	
	// Liste de la base
	public static List<Personne> getAllRecords(){
		List<Personne> list=new ArrayList<Personne>();
		
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from personne");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Personne u=new Personne();
				u.setId(rs.getInt("idpersonne"));
				u.setNom(rs.getString("nom"));
				u.setPrenom(rs.getString("prenom"));
				u.setTel(rs.getString("tel"));
				u.setMail(rs.getString("mail"));
				u.setAdresse(rs.getString("adresse"));
				u.setMdp(rs.getString("mdp"));
				u.setLevel(rs.getInt("level"));
				u.setAssociation(rs.getString("idassociation"));
				list.add(u);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	
	// On retourne la personne en rapport avec l'ID
	public static Personne getRecordById(int idpersonne){
		Personne u = null;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from personne where idpersonne=?");
			ps.setInt(1,idpersonne);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				u=new Personne();
				u.setId(rs.getInt("idpersonne"));
				u.setNom(rs.getString("nom"));
				u.setPrenom(rs.getString("prenom"));
				u.setTel(rs.getString("tel"));
				u.setMail(rs.getString("mail"));
				u.setAdresse(rs.getString("adresse"));
				u.setMdp(rs.getString("mdp"));
				u.setLevel(rs.getInt("level"));
				u.setAssociation(rs.getString("idassociation"));
			}
		}catch(Exception e){System.out.println(e);}
		return u;
	}
}
