import java.util.ArrayList;

public class Cartes {
    static String[] Valeur = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    static String[] Type = {" carreau", " cœur", "pique", "trèfle"};
    static ArrayList<Cartes> paquet = new ArrayList<>();

    String carteType;
    String carteValue;

    public Cartes(String carteType, String carteValue) {
        this.carteType = carteType;
        this.carteValue = carteValue;
    }

    public String toString() {
        return "[" + carteType + "|" + carteValue + "]";
    }

    public static void buildpaquet() {
        for (int i = 0; i < Valeur.length; i++) {
            for (int j = 0; j < Type.length; j++) {
                Cartes card = new Cartes(Type[j], Valeur[i]);
                paquet.add(card);
            }
        }

        System.out.println(paquet);
    }


}