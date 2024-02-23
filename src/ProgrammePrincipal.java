import java.time.LocalDate;

public class ProgrammePrincipal {
    public static void main(String[] args) {
        Boutique boutique = new Boutique();
        Produit ELectronique1 = new ProduitElectronique("laptop", " ordinateur puissant", 1000, 24);
        Produit ELectronique2 = new ProduitElectronique("souris", " souris sans fil", 15, 12);
        Produit Alimentaire1 = new ProduitAlimentaire("farine", "farine de ble pour gateau", 5, LocalDate.of(2026,9, 1));
        Produit Alimentaire2 = new ProduitAlimentaire("riz", " riz des agriculteurs du sud", 15, LocalDate.of(2027,5, 5));
        Produit Boisson1 = new ProduitBoisson("oasis", "boisson gazeuse fraiche", 1, 33);
        boutique.addProduit(ELectronique1);
        boutique.addProduit(ELectronique2);
        boutique.addProduit(Alimentaire1);
        boutique.addProduit(Alimentaire2);
        boutique.addProduit(Boisson1);

        System.out.println(" les produits disponibles dans la boutique :");
        boutique.afficherStock();

        Panier panier = new Panier();
        panier.ajouterProduit(ELectronique1);
        panier.ajouterProduit(Alimentaire2);
        panier.ajouterProduit(Boisson1);

        System.out.println(" les produits dans votre panier :");
        panier.afficherPanier();
        panier.afficherPrixTotalPanier();




    }
}
