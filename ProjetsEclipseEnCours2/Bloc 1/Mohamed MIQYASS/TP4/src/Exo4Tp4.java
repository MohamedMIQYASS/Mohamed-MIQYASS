import java.util.Scanner;
public class Exo4Tp4 {
	public static void main (String[] args){
		// d�claration des variables note et som et sc
		
		float note ;
		float som = 0;
	
		Scanner sc = new Scanner(System.in);
		/* Boucle qui permet la saisie d'une note � la fois 
		 * et la mise � jour de som. Traitemments � compl�ter.
		 */
		for ( int i = 1 ; i<=3 ; i++){
			System.out.print ("saisir la note n� "+i+": ");
			note=sc.nextFloat();
			// r�pter la saisie tant que la note n'est pas bonne 
			while(note<0 || note>20) {
				System.out.println("saisir une valeur valide pour la note n� "+i+": ");
				note=sc.nextFloat();
			}
			// une fois que la note est bonne 
				som = som + note;
		}
		System.out.printf("La moyenne des notes est : "+ "%.2f",som/3);
		// %.2f avec printf permet de limiter le nombre de d�cimales affich�es � 2
		sc.close();
	}
}


