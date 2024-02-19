import java.util.Scanner;
import java.util.ArrayList;

public class Blackjack {

  public static void demarerPartie() {
	Joueur.username="Joueur";
	
	if (Joueur.solde == 0) {
        System.out.println("\nVous n'avez plus de juton pour jouer.");
        return;
    }
	Joueur.PlacerMise();
	if(Joueur.mise<=Joueur.solde) {
		 Joueur.solde-=Joueur.mise;
	}else {
		System.out.println("\nVotre mise est supérieure à votre solde. Veuillez placer une mise inférieure.");
		return;
	}
	Cartes.buildpaquet();
	PaquetCartes.melanger(Cartes.paquet);
	Personne.tirerCarte();
	Joueur.JouerTourJoueur();
	Croupier.JouerTourCroupier();
	Croupier.ComparerMain();
  }
}