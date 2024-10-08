package tp4;

public class compte {
	private static int c = 0; 
    private int numc;
    private personne titulaire;
    private double solde;
    private double decouvertMax;
    private double debitMax;
    private boolean estaDécouvert=false;
    public compte (personne p) {
    	c++;
    	this.titulaire=p;
    	this.numc=c;
    	this.decouvertMax = 800;
        this.debitMax = 1000;
    }
    public compte(personne p,double d,int debitMax) {
    	this.titulaire=p;
    	this.numc=++c;
    	this.decouvertMax = d ;
        this.debitMax = debitMax;
        
    }
    public void decritcompte() {
    	System.out.println(this);
    }
    public String toString() {
        return "Compte numero " + numc +":\n"+titulaire+"solde=" + solde +"\n"+"decouvert max=" + decouvertMax +"\n"+"debit max=" + debitMax ;
    }
	public static int getC() {
		return c;
	}
	public static void setC(int c) {
		compte.c = c;
	}
	public int getNumc() {
		return numc;
	}
	public void setNumc(int numc) {
		this.numc = numc;
	}
	public personne getTitulaire() {
		return titulaire;
	}
	public void setTitulaire(personne titulaire) {
		this.titulaire = titulaire;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public double getDecouvertMax() {
		return decouvertMax;
	}
	public void setDecouvertMax(double decouvertMax) {
		this.decouvertMax = decouvertMax;
	}
	public double getDebitMax() {
		return debitMax;
	}
	public void setDebitMax(double debitMax) {
		this.debitMax = debitMax;
	}
	public void crediter(double m) {
        if (m > 0) {
            solde += m;
        } else {
            System.out.println("err");
        }
    }
	public boolean debiter(double m) {
        if (m > 0 && m <= debitMax) {
            if (solde - m >= -decouvertMax) {
                solde -= m;
                this.estaDécouvert=this.estaDécouvert();
                return true;
            } else {
                System.out.println("err");
                return false;
            }
        } else {
        	System.out.println("err");
        	return false;
        }
    }
	public boolean estaDécouvert() {
		return solde <0;
	}
	public double MontantDécouvert() {
		if(estaDécouvert) {
			return solde;
		}else {
			return 0;
		}
		
	}	
	public void Virement(compte c, double m) {
		
		if (this.debiter(m)) {
			c.crediter(m);
		}else {
			System.out.println("err");
		}
		
	}
	public static void Virement(compte c1,compte c2, double m) {
		if (c1.debiter(m)) {
			c2.crediter(m);
		}else {
			System.out.println();
		}
		
	}
}
