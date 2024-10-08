package tp4;

public class personne {
	private String nom;
    private String prenom;
    private String adresse;
    public personne(String n,String p,String a) {
    	this.nom=n;
    	this.prenom=p;
    	this.adresse=a;
    }
    public String toString() {
    	return ("nom titulaire= " + nom + '\n'+
                "prenom titulaire= " + prenom + '\n' +
                "adresse titulaire= " + adresse + '\n' );
    }
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
    
}
