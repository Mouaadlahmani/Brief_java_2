import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
      int choix;
      do {
      System.out.println("-------Bienveneu au BlackJack-------");
      System.out.println("-------Menu Principal------");
      System.out.println("1- Commencez à jouer");
      System.out.println("2- Consulter mon solde de juton");
      System.out.print("Entrez votre choix: ");
      Scanner scan = new Scanner(System.in);
      choix = scan.nextInt();
      switch(choix) {
      case 1 : Blackjack.demarerPartie();
      break;
      case 2 : System.out.println("\nVotre solde: "+Joueur.solde);
      break;
      default : System.out.println("Choix invalide");
      break;
      }
      }while(choix!=0);
     

  }
}