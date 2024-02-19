import java.util.Scanner;
import java.util.ArrayList;

public class Joueur extends Personne{
  public Joueur(Hand main) {
		super(main);
	}

static String username;
  static int solde=200;
  static int JoueurSum;
  static int mise;
  static ArrayList<Cartes> JoueurMain;
  
  public static void PlacerMise() {
      Scanner scan = new Scanner(System.in);
      System.out.print("Entrez le montant de votre mise: ");
       mise = scan.nextInt();
 }
  
  public static void JouerTourJoueur() {
	  int hit;
	  do{
		  System.out.print("1-Hit | 2-Stand: ");
		  Scanner scan = new Scanner(System.in);
		  hit = scan.nextInt();
		  switch (hit) {
		  case 1 : HitJoueur();
		  		   break;
		  case 2 : System.out.println("\nTour coupier: ");
			       System.out.println("Croupier Main: ");
		  		   System.out.print(Croupier.hiddenCard+", ");
		  		   System.out.println(Croupier.croupierMain);
		  		   System.out.println(Croupier.croupierSum);
		  		   Croupier.JouerTourCroupier();
		  		   break;
		  default : System.out.println("Choix invalide.");
		  		   break;
		  }
	  }while( hit!=2 && JoueurSum < 21);
	  
	  
  }
  
  public static void HitJoueur() {
	  		Cartes carte = Cartes.paquet.remove(Cartes.paquet.size() - 1);
	        JoueurSum += carte.getValeur(carte.carteValue);
	        JoueurMain.add(carte);
	        
	      System.out.println("\n"+Joueur.username+" Main");
	      System.out.println(JoueurMain);
	      System.out.println(JoueurSum);
  }
  
  
  
public static int getMise() {
	return mise;
}
public static void setMise(int mise) {
	Joueur.mise = mise;
}
public static String getUsername() {
	return username;
}

public static void setUsername(String username) {
	Joueur.username = username;
}

public static int getSolde() {
	return solde;
}

public static void setSolde(int solde) {
	Joueur.solde = solde;
}

public static int getJoueurSum() {
	return JoueurSum;
}

public static void setJoueurSum(int joueurSum) {
	JoueurSum = joueurSum;
}

public static ArrayList<Cartes> getJoueurMain() {
	return JoueurMain;
}

public static void setJoueurMain(ArrayList<Cartes> joueurMain) {
	JoueurMain = joueurMain;
}

}
  