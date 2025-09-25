
import java.util.Scanner;

public class Perimetre {

	public static void main(String[] args) {
		
		// déclaration des variables
		
		float rayon , perimetre;
		Scanner sc = new Scanner(System.in);
		
		// initialisation des variables
		
		final float pi = 3.141592f;
		
		// Saisie des valeurs
		
		System.out.println("Veuillez saisir le rayon de votre cercle : ");
		rayon = sc.nextFloat();
		
		// calcul
		
		perimetre = 2 * pi * rayon;
		
		// affichage du résultat
		
		System.out.println("Votre cercle a pour perimètre " + perimetre);
		
		sc.close();
		
	}

}
