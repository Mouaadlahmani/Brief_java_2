import java.util.ArrayList;

public class Croupier extends Personne{
  public Croupier(Hand main) {
		super(main);
	}

static Cartes hiddenCard;
  static int croupierSum;

  
  static ArrayList<Cartes> croupierMain;
  
  

  public void addCarteToCroupierMain() {
    Cartes carte = Cartes.paquet.remove(Cartes.paquet.size()-1);
    croupierMain.add(carte);
  }

  public static void JouerTourCroupier() {
	       System.out.println("\nTour coupier: ");
	  	   System.out.println("Croupier Main: ");
		   System.out.print(Croupier.hiddenCard+", ");
		   System.out.println(Croupier.croupierMain);
		   System.out.println(Croupier.croupierSum);
	  while(croupierSum<17){
		        Cartes carte = Cartes.paquet.remove(Cartes.paquet.size() - 1);
		        croupierSum += carte.getValeur(carte.carteValue);
		        croupierMain.add(carte);
		        
		      System.out.println("\nCroupier: ");
		      System.out.println(croupierMain);
		      System.out.println(croupierSum);
	  }
  }
  
  public static void ComparerMain() {
	  if(Joueur.JoueurSum>21) {
		System.out.println("Vous avez perdu.");  
	  }else if(Joueur.JoueurSum>Croupier.croupierSum && Joueur.JoueurSum<=21) {
		  System.out.println("Vous avez gagnez.");
		  Joueur.solde += (Joueur.mise*2);
	  }else if(Joueur.JoueurSum==Croupier.croupierSum) {
		  System.out.println("Null.");
		  Joueur.solde+=Joueur.mise;
	  }else if(Croupier.croupierSum>Joueur.JoueurSum && Croupier.croupierSum<=21) {
		  System.out.println("Vous avez perdu.");
	  }else if(Croupier.croupierSum>21 && Joueur.JoueurSum<=21) {
		  System.out.println("Vous avez gagnez.");
		  Joueur.solde += (Joueur.mise*2);
	  }
  }
  
  

  public Cartes gethiddenCard(){
    return hiddenCard;
  }

  public int getCroupierSum(){
    return croupierSum;
  }

  public void sethiddenCard(Cartes hiddencard){
    this.hiddenCard=hiddenCard;
  }
  
  public void setCroupierSum(int croupierSum){
    this.croupierSum=croupierSum;
  }

}