import java.util.Scanner;

public class Devis {

	public static void main(String[] args) {
		
		// Déclaration des variables
		
		Scanner sc = new Scanner(System.in);
		
		float longueur , largeur , surface , prixMoq , montMoq , montPose , montaPayer;
		
		int prixPose = 7;
		
		// Saisie des valeurs
		
		System.out.println("Quelle est la longeur de votre pièce ? ");
		longueur = sc.nextFloat();
		
		System.out.println("Quelle est la largeur de votre pièce ? ");
		largeur = sc.nextFloat();
		
		// calcul 
		
		surface = longueur * largeur;
		
		System.out.println("la surface de moquette à acheter est de : " + surface + "m2");
		
		// Saisie des valeurs
		
		System.out.println("Quelle est le prix TTC au m2 de la moquette choisie ? ");
		prixMoq = sc.nextFloat();
		
		// calcul 
		
		montMoq = surface * prixMoq;
		
		// Affichage du montant et du prix de la pose
		
		System.out.println("Le montant correspondant à la surface calculée est de " + montMoq + "euros");
		
		// calcul
		
		montPose = surface * prixPose;
		
		montaPayer = montMoq + montPose;
		
		// affichage du montant de la pose et du montant total a payer 
		
		System.out.println("Le montant correspondant à la pose est de " + montPose + "euros");
		
		System.out.println("Le montant total à payer  est de " + montaPayer + "euros");
		
		sc.close();


	}

}
