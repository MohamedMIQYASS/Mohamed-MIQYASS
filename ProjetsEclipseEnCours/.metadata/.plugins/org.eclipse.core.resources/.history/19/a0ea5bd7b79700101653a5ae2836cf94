import java.util.Scanner; // instruction pour importer la classe Scanner utilisée pour les saisies au clavier
public class Remise{ 
	public static void main (String[] args){ // programme principal
		
	    // déclaration des variables : le prix de l'article 
		
		float prix , montAchete , montRem , totAPayer;
		
		// déclaration de la variable pour la quantité
		
		int qte ;
		
		// initialisation de la variable pour la remise
		
		float tauxRem = (10/100f);
		
		Scanner sc = new Scanner(System.in); // création d'un objet sc de la classe Scanner pour réaliser une saisie
		
		// saisie du prix de l'article et de la quantité souhaitée
		
		System.out.print ("Entrez le prix de l'article en euros : ");
		
		prix =sc.nextFloat(); // sc.nextFloat() pour saisir un réel
		
		System.out.print ("Entrez la quantite souhaitee : ");
		
		qte =sc.nextInt(); // sc.nextInt() pour saisir un entier
		
		//calcul du montant acheté
		
		montAchete = prix * qte;
				
		// calcul du taux de remise
		
		if (montAchete < 500) {
			System.out.println("Aucune remise ne vous sera accordée ");
		}
		else {
			System.out.println("Un remise de 10% vous est accordée ");
			// calcul du montant de la remise et du total à payer 
			
			montRem = montAchete * tauxRem;
					
			totAPayer = montAchete - montRem;
					
			//affichage des résultats
			System.out.println("Le taux de la remise est de : " + tauxRem + " le montant de la remise est :" + montRem + "Le total à payer est de " + totAPayer);
			sc.close(); // fermeture de l'objet sc dès que les saisies sont terminées
		}
		
		
	}
}
