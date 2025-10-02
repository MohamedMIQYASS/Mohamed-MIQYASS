
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	 
	        char caract;
	 
	        // Fournir les données d'entrée
	        System.out.print("Saisir une lettre : ");
	        caract = sc.next().toLowerCase().charAt(0); /* saisit une String avec sc.next(), puis la convertit en minuscule avec toLowerCase et garde le 1er caractère avec charAt(0) */
	        
	        
	        if (caract < 'a' || caract > 'z') {
	        	System.out.println("La valeur saisie n'est pas une lettre ");
	        }
	        else {
	        	if (caract == 'a' || caract == 'e' || caract == 'i' || caract == 'o' || caract == 'u' || caract == 'y') {
		        	System.out.println("La lettre saisie est une voyelle");
		        }
	        	else {
		        	System.out.println("La lettre saisie est une consonne");
		        }	
	        }
	        sc.close();
}
	
}