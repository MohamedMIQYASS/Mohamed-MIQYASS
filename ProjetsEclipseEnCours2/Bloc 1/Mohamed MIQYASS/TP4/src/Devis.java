import java.util.Scanner;

public class Devis{ 
	
	public static void main (String[] args){
		
		// d�claration des variables
		
		 final int PRIX_POSE = 7;
		 float largeur, longueur, ttc, montantMoq, mainOeuvre, prixTotal, surface;
		 Boolean rep_user;
		 
		// Saisie de la r�ponse
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Souhaitez-vous faire un devis ? (true/false) : ");
		 rep_user = sc.nextBoolean();
		 
		 // boucle
		 
		 while(rep_user == true  ) {
			 
			// saisie des variables largeur, longueur et prix moquette
			 System.out.print("Entrez la largeur : ");
			 largeur = sc.nextFloat();
			 System.out.print("Entrez la longueur : ");
			 longueur = sc.nextFloat();
			 System.out.print("Entrez le prix TTC moquette : ");
			 ttc = sc.nextFloat();
			 // calculs de la surface, du montant de la moquette, de la main d'oeuvre et du total � payer
			 surface = largeur*longueur;
			 montantMoq = ttc * surface;
			 mainOeuvre = (surface* PRIX_POSE);
			 prixTotal = montantMoq + mainOeuvre;
			 // affichage des r�sultats
			 System.out.println("Surface � acheter : " + surface+" m�");
			 System.out.println("Montant de la moquette : " + montantMoq+" �");
			 System.out.println("Total � payer : " + prixTotal+" � dont " + mainOeuvre+" � de pose");
	 
			// Saisie de la seconde r�ponse
				 
			System.out.println("Souhaitez-vous refaire un devis ? (true/false) : ");
			rep_user = sc.nextBoolean();
		 }	 
	}
	
   }