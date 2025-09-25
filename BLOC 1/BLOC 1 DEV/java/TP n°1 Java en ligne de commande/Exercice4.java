import java.util.Scanner;

public class Exercice4 {

	public static void main(String [] args){

		// déclaration des variables

		float prixChambre , tauxTVA , taxeSejour;

		float montantVAT , montantTaxeSejour , total;

		Scanner sc = new Scanner(System.in);

		// Saisie des valeurs 

		System.out.print("Entrez le prix de la chambre :");
		prixChambre = sc.nextFloat();

		System.out.print("Entrez le taux de VAT (10,5 pour 10,5%) : ");
		tauxTVA = sc.nextFloat();

		System.out.print("Entrez le taux de la taxe de séjour (2 pour 2%) : ");
		taxeSejour = sc.nextFloat();


		// Calcul

		montantVAT = prixChambre * (tauxTVA/100f);

		montantTaxeSejour = prixChambre * (taxeSejour/100f);

		total = prixChambre + montantVAT + montantTaxeSejour;

		// Affichage 

		System.out.println("Montant de la VAT ($) :" + montantVAT + "" +  "Montant de la VAT (euros) :" + montantVAT*0.85);
		System.out.println("Montant de la taxe sejour ($) :" + montantTaxeSejour + "" + "Montant de la taxe sejour (euros) :" + montantTaxeSejour*0.85);
		System.out.println("Total ($) : " + total + "" +"Total (euros) : " + total*0.85);


		sc.close();


	}
}