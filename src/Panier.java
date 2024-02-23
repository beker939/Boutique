import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Produit> produits = new ArrayList<>();

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void afficherPanier() {
        for (Produit produit : produits) {
            produit.afficher();
            System.out.println();
        }
    }

    public int calculerPrixTotalPanier() {
        int prixTotal = 0;
        for (Produit produit : produits) {
            prixTotal += produit.getPrix();
        }
        return prixTotal;
    }

    public void afficherPrixTotalPanier() {
        System.out.println("prix total du panier : " + calculerPrixTotalPanier() + " euros");
    }
}
