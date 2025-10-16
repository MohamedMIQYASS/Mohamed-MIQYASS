import java.util.Scanner;
public class Exo2Tp4 {
	public static void main (String[] args){
		// déclarations
		int n, max=0; // max contiendra le nombre le plus grand.
		Scanner sc = new Scanner(System.in);
		// boucle qui permet la saisie des 5 nombres et la mise à jour du max
		for(int i = 1 ; i <= 5 ; i++){
			System.out.print ("Entrez le nombre n° "+i +" : ");
			n = sc.nextInt();
			// test pour voir s'il faut changer max
			if ( n > max ){
				max=n;
			}
		}
		System.out.println("Le plus grand des 5 nombres est : " + max);
	}
}
			
		
			
					
			// TO DO affichage du résultat



