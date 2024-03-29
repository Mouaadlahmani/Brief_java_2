import java.util.ArrayList;
import java.util.Random;

public class PaquetCartes {
  private String listCartes;
  private int size;

  public PaquetCartes(String listCartes, int size) {
    this.listCartes = listCartes;
    this.size = size;
  }

  public static void melanger(ArrayList<Cartes> paquet) {
    Random random = new Random();

    for (int i = 0; i < paquet.size(); i++) {
      int j = random.nextInt(paquet.size());
      Cartes carte = paquet.get(i);
      Cartes randomCarte = paquet.get(j);

      paquet.set(i, randomCarte);
      paquet.set(j, carte);
    }
    System.out.println("After: ");
    System.out.println(paquet);
  }

  public String getListCartes() {
    return listCartes;
  }

  public void setListCartes(String listCartes) {
    this.listCartes = listCartes;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

}