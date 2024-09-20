import java.util.Date;

public class main {
    public static void main(String[] args) {

        Produit produit1= new Produit(1021, "Lait "," Delice");
        Produit produit2= new Produit(2510, "Yaourt "," Vitalait");
        Produit produit3= new Produit (3250, "Tomate "," Sicam",1.200);

        produit1.prix= 700;
        produit2.prix= 550;


         produit1.afficher();
        produit2.afficher();
        produit3.afficher();

        System.out.println(produit1.toString());
        System.out.println(produit2.toString());
        System.out.println(produit3.toString());

    Date espirationDate = new Date(2026 , 11 ,31);
    produit1.dateexp =  espirationDate;
    produit2.dateexp =  espirationDate;
    produit3.dateexp =  espirationDate;
    System.out.println(produit1.dateexp);
     System.out.println(produit2.dateexp);
      System.out.println(produit3.dateexp);

    }

}
