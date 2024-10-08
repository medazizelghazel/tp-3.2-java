package tp4;

public class test {

	public static void main(String[] args) {
		personne p1 =new personne("aziz","elghazel","hammamet");
		personne p2 =new personne("jihen","elbahi","nabeul");
		compte c1 =new compte(p1,500,1200);
		compte c2 =new compte(p1,800,1800);
		compte c3 =new compte(p2,400,1000);
		c1.crediter(500);
		System.out.println(c1);
		c1.debiter(100);
		c3.crediter(30000);
		System.out.println(c1);
		c1.Virement(c3, 100);
		compte.Virement(c3,c2,1000);
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(c2);
	}
}
