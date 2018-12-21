package classeProjet;

public class Personne {
	
	private String Nom ;
	private String Prenom ;
	private String TEL ;
	private String Mail ;
	private String Adresse ;
	private String MDP ;
	private int Level ;


public Personne()
{
	Nom = "Leturcq";
	Prenom = "Morgan";
	TEL = "0608542545";
	Mail = "leturcq.morgan@gmail.com";
	Adresse = "2 residence les baleines";
	MDP = "1234";
	Level = 2;
}

public Personne(String Nom, String Prenom, String Tel, String Mail,String Adresse, String Mdp, int Lvl)
{
	this.Nom = Nom;
	this.Prenom = Prenom;
	this.TEL = Tel;
	this.Mail = Mail;
	this.Adresse = Adresse;
	this.MDP = Mdp;
	this.Level = Lvl;
}

///////////////////////////////NOM///////////////////////////////////////

public String getNom() {
	return Nom;

}

public void setNom(String pNom)
{
  Nom = pNom;
}

///////////////////////////////PRENOM///////////////////////////////////////

public String getPrenom() {
	return Prenom;

}

public void setPrenom(String pPrenom)
{
	Prenom = pPrenom;
}

///////////////////////////////TEL///////////////////////////////////////

public String getTel() {
	return TEL;

}

public void setTel(String pTEL)
{
	TEL = pTEL;
}

///////////////////////////////MAIL///////////////////////////////////////

public String getMail() {
	return Mail;

}

public void setMail(String pMail)
{
	Mail = pMail;
}

///////////////////////////////ADRESSE///////////////////////////////////////

public String getAdresse() {
	return Adresse;

}

public void setAdresse(String pAdresse)
{
	Adresse = pAdresse;
}

///////////////////////////////MDP///////////////////////////////////////

public String getMdp() {
	return MDP;

}

public void setMdp(String pMDP)
{
	MDP = pMDP;
}

///////////////////////////////LVL///////////////////////////////////////

public int getLvl() {
	return Level;

}

public void setLevel(int pLevel)
{
	Level = pLevel;
}

}
