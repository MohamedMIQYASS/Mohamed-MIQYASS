import java.util.Scanner;

public class Exo3TP4 {

	public static void main(String[] args) {
		
		// Déclarations des variables
		
		Scanner sc = new Scanner(System.in);
		int nbrNegatif = 0 , nbrPositif = 0 , n = 0 ;
		
		// boucle 
		
		for (int i = 1 ; i<=20 ; i++) {
			System.out.println("Entrez le nombre " + i + ":");
			n = sc.nextInt();
			
			if(n > 0){
				nbrPositif = nbrPositif + 1;
			}
			else {
				if (n < 0 ) {
					nbrNegatif = nbrNegatif +1;
				}
				else {
					System.out.println("Valeur incorrecte ");
				}
			}	
		}
		System.out.println("Nombre de valeur positives : " + nbrPositif);
		System.out.println("Nombre de valeur négatives : " + nbrNegatif);

	}

}
