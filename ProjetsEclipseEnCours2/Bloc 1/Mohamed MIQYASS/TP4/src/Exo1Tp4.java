import java.util.Scanner;
public class Exo1Tp4 {
	public static void main (String[] args){
		// déclaration des variables note et som et sc
		
		float note ;
		float som = 0;
	
		Scanner sc = new Scanner(System.in);
		/* Boucle qui permet la saisie d'une note à la fois 
		 * et la mise à jour de som. Traitemments à compléter.
		 */
		for ( int i = 1 ; i<=3 ; i++){
			System.out.print ("saisir la note n° "+i+": ");
			note=sc.nextFloat();
			som = som + note;
		}
		System.out.printf("La moyenne des notes est : "+ "%.2f",som/3);
		// %.2f avec printf permet de limiter le nombre de décimales affichées à 2
		sc.close();
	}
}


