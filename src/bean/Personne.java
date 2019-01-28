package bean;

public class Personne {
	private int idpersonne, level;
	private String nom,prenom,tel,mail,adresse,mdp,idassociation;

	public int getId() {
		return idpersonne;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getTel() {
		return tel;
	}

	public String getMail() {
		return mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getMdp() {
		return mdp;
	}

	public int getLevel() {
		return level;
	}

	public String getAssociation() {
		return idassociation;
	}

	public void setId(int idpersonne) {
		this.idpersonne = idpersonne;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setAssociation(String idassociation) {
		this.idassociation = idassociation;
	}
	
}
