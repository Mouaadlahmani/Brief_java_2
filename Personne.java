import java.util.Scanner;
import java.util.ArrayList;


public class Personne {
  private Hand main;

  public Personne(Hand main){
    this.main = main;
  }

  public static void tirerCarte(){
    // croupier
    Croupier.croupierSum = 0;
    Croupier.croupierMain = new ArrayList<>();

    Croupier.hiddenCard = Cartes.paquet.remove(Cartes.paquet.size() - 1);
    Croupier.croupierSum += Croupier.hiddenCard.getValeur(Croupier.hiddenCard.carteValue);

    Cartes carte = Cartes.paquet.remove(Cartes.paquet.size() - 1);
    Croupier.croupierSum += carte.getValeur(carte.carteValue);
    Croupier.croupierMain.add(carte);
    

    System.out.println("\nCroupier Main: ");
    System.out.print("Carte cachée"+", ");
    System.out.println(Croupier.croupierMain);    
 // Joueur
    Joueur.JoueurSum = 0;
    Joueur.JoueurMain = new ArrayList<>();

    for (int i = 0; i < 2; i++) {
      carte = Cartes.paquet.remove(Cartes.paquet.size() - 1);
      Joueur.JoueurSum += carte.getValeur(carte.carteValue);
      Joueur.JoueurMain.add(carte);
    }
    System.out.println("\n"+Joueur.username+" Main");
    System.out.println(Joueur.JoueurMain);
    System.out.println(Joueur.JoueurSum);
  }
    
  
  public void setMain(Hand main){
    this.main = main;
  }
  public Hand getMain(){
    return main;
  }
  
}

