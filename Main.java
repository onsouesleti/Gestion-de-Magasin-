import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produit produit1 = new Produit(1021, "Lait", "Delice", 0.700f);
        Produit produit2 = new Produit(2510, "Yaourt", "Vitalait", 0.600f);
        Produit produit3 = new Produit(3250, "Tomate", "Sicam", 1.200f);

        Date expirationDate = new Date(2028 - 2025, 11, 12); // Fix year issue
        produit1.setDateexp(expirationDate);
        produit2.setDateexp(expirationDate);
        produit3.setDateexp(expirationDate);

        Magasin Mg = new Magasin(9001, "MG");
        Mg.ajouterProduit(produit1);
        Mg.ajouterProduit(produit2);
        Mg.ajouterProduit(produit3);

        System.out.println(Mg.toString());
        System.out.println("Total produits dans tous les magasins: " + Magasin.getTotalProduits());
    }
}
