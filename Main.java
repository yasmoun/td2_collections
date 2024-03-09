
public class Main {

	public static void main(String[] args) {
        Article a1 = new Article("shampooing", 10);
        Article a2 = new Article("balsam", 25);
        Article a3 = new Article("papier", 1);
        Stock s = new Stock();
        s.addNouvArticle(a1, 2);
        s.addNouvArticle(a2, 3);
        s.addNouvArticle(a3, 2);
        Facture f = new Facture(s);
        f.addLigne(2, "shampooing");
        f.addLigne(1, "balsam");
        boolean isRemoved = f.removeLigne(1);
        if (isRemoved) {
            System.out.println("Ligne supprimée avec succès !");
        } else {
            System.out.println("Échec de la suppression de la ligne.");
        }

        System.out.println("Montant total de la facture : "+ f.getMontantTotal());
        System.out.println("affichage du stock: ");
        s.sortStock();
        String a="papier";
        s.removeArticle(a);
        System.out.println("affichage du stock après suppression de l'article: ");
        s.sortStock();
        
        
	}	
	}

