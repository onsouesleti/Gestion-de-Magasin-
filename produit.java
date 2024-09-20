import java.util.Date;
class Produit {
     int id;
     String libelle;
     String marque;
     double prix;
     Date dateexp;

     Produit(){}
    Produit(int id, String libelle, String marque, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;

    }

    Produit(Date dateexp) {
        this.dateexp = dateexp;

    }
  void afficher(){
    System.out.println("identifiant : "+this.id);
    System.out.println("libelle : "+this.libelle);
    System.out.println("marque : "+this.marque);
    System.out.println("prix : "+this.prix);
}
    @Override
    public String toString() {
        return "identifiant " + this.id  +
                " libelle " + this.libelle +
                " marque " + this.marque +
                " prix " + this.prix;
    }

}
