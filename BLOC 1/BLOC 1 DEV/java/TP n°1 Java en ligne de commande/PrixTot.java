import java.util.Scanner; // instruction pour importer la classe Scanner nécessaire pour les saisies clavier
public class PrixTot{ 
	public static void main (String[] args){ // programme principal
	   // déclaration des variables, respectivement pour gérer le prix de l'article et le total
		float prix , total;
		// déclaration de la variable nécessaire pour gérer la quantité
		int qte;
		Scanner sc = new Scanner(System.in); // création d'un objet sc de la classe Scanner pour réaliser une saisie
		// saisie du prix de l'article et de la quantité souhaitée
		System.out.print ("Entrez le prix de l'article en euros : ");
		prix =sc.nextFloat(); // sc.nextInt() pour saisir un entier, sc.nextFloat() pour saisir un réel
		System.out.print ("Entrez la quantite souhaitee : ");
		qte =sc.nextInt();
		//calcul du total à payer
		total= prix * qte;
		//affichage du résultat
		System.out.println("Total a payer : "+ total +  "euros");
		sc.close(); // fermeture de l'objet sc avant la fin du programme
	}
}
