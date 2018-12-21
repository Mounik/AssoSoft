package classeProjet;

public class Association {
	
	private String nom;
	private String tel;
	private String mail;
	private String adresse;
	
	public Association()
	{
		nom = "AssoVelo";
		tel = "0322485696";
		mail = "AssoVelo@gmail.com";
		adresse = "2 rue roubilon";
	}
	public Association(String nom, String tel, String mail, String adresse)
	{
		this.nom = nom;
		this.tel = tel;
		this.mail = mail;
		this.adresse = adresse;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	public void setMail(String mail)
	{
		this.mail = mail;
	}
	public void setAdresse(String adresse)
	{
		this.adresse = adresse;
	}
	public String getNom()
	{
		return nom;
	}
	public String getTel()
	{
		return tel;
	}
	public String getMail()
	{
		return mail;
	}
	public String getAdresse()
	{
		return adresse;
	}
}
