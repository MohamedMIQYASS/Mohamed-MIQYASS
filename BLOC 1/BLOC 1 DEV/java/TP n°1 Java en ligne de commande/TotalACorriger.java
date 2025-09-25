import java.util.Scanner;
public class TotalACorriger{ 
	public static void main (String[] args){
	    	// déclaration des variables
		float TAUX_TVA = 0.2f;
		float prixHT, totalHT, totalTTC, prix , montTVA;
		int qte;
		
		Scanner sc = new Scanner(System.in);

		// saisie du taux de tva
		System.out.print ("Entrez le taux de tva : ");
		TAUX_TVA = sc.nextFloat();
		// saisie du prix de l'article et de la quantité souhaitée
		System.out.print ("Entrez le prix de l'article en euros : ");
		prixHT = sc.nextFloat();
		System.out.print ("Entrez la quantite souhaitee : ");
		qte =sc.nextInt();
		System.out.print("entrez le prix : ");
		prix = sc.nextFloat();
		//calcul du total à payer
		totalHT= prix * qte;
		montTVA= totalHT * TAUX_TVA;
		totalTTC= totalHT + montTVA; // il manquait un point virgule 
		//affichage des résultats
		System.out.println("Total hors taxe : "+ totalHT+" euros");
		System.out.println("Montant de la TVA : "+ montTVA+" euros");
		System.out.println("Total TTC : "+ totalTTC+" euros");

		sc.close();
	}
}


