import java.util.Scanner; // instruction pour importer la classe Scanner nécessaire pour les saisies au clavier

public class PrixSolde{ 
	public static void main (String[] args){ // module principal
		Scanner sc = new Scanner(System.in); // création d'un objet sc de la classe Scanner pour réaliser les saisies
	    // déclaration des variables, respectivement le prix initial de l'article et poucentage de remise
		
		float prixInit;
		float pourcent;
		
		// déclaration de la variable pour le montant de la remise et le prix à payer
		
		float mtRemise, prixAPayer;
		
		// saisie du prix initial de l'article et du poucentage de remise
		
		System.out.print ("Entrez le prix de l'article en euros : ");
		prixInit =sc.nextFloat();
		System.out.print ("Entrez le pourcentage de la remise : ");
		pourcent =sc.nextFloat();
	
		//calcul de la remise
		
		mtRemise= prixInit * (pourcent/100f);

		//affichage des résultats
		
		System.out.println("Montant de la remise correspondant a "+pourcent+" % : "+ mtRemise+" euros .");
		prixAPayer = prixInit - mtRemise;
		System.out.println("Le prix a payer est de " + prixAPayer + " euros .");
		sc.close();

	}
}
