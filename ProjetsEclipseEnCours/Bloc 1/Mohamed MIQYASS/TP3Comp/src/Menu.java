import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choix;
		
		System.out.println("1- Calculer le périmètre d’un cercle\n2- Calculer l’aire d’un cercle\n3- Calculer le périmètre d’un rectangle\n4- Calculer l’aire d’un rectangle");
		choix = sc.nextInt();
		
		if (choix == 1) {
			float rayon , perimetre;
			System.out.println("Saisissez le rayon de votre cercle : ");
			rayon = sc.nextFloat();
			perimetre = 2 * rayon * (3.14f);
			System.out.println("Le perimetre de votre cercle est : " + perimetre);
		}
		if (choix == 2) {
			float rayon , aire;
			System.out.println("Saisissez le rayon de votre cercle : ");
			rayon = sc.nextFloat();
			aire = (3.14f) * rayon * rayon;
			System.out.println("Le perimetre de votre cercle est : " + aire);			
		}
		if (choix == 3) {
			float largeur , longueur , perimetre;
			System.out.println("Saissisez la largeur de votre rectangle : ");
			largeur = sc.nextFloat();
			System.out.println("Saissisez la longueur de votre rectangle : ");
			longueur = sc.nextFloat();
			perimetre = (largeur + longueur) * 2;
			System.out.println("Le perimetre de votre rectangle est : " + perimetre);
		}
		if (choix == 4) {
			float largeur , longueur , aire;
			System.out.println("Saissisez la largeur de votre rectangle : ");
			largeur = sc.nextFloat();
			System.out.println("Saissisez la longueur de votre rectangle : ");
			longueur = sc.nextFloat();
			aire = longueur * largeur;
			System.out.println("L'aire de votre rectangle est :" + aire);
		}
		

	}

}
