import java.util.*;

public class exo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nbrUser ; 
		int i = 0 ;
		int nbrMax = 0;
		int indiceMax = 0;
		int nbrMin = 1;
		int indiceMin = 0;

		
		System.out.println("Entrez une série de nombres postitifs (0 pour arreter ) : ");
		do {
			i++;
			System.out.println("Entrez le nombre n" + i + " : " );
			nbrUser = sc.nextInt();
			
			if(nbrUser >nbrMax) {
				nbrUser = nbrMax;
				indiceMax = i;
			}
			if (nbrUser < nbrMin) {
				nbrUser = nbrMin;
				indiceMin = i;
			}
		}while(nbrUser != 0);
		
		System.out.println("Le nbr max est : " + nbrMax + " " + "C'est le nbr numéro" + indiceMax);
		System.out.println("Le nbr min est : " + nbrMin + " " + "C'est le nbr numéro" + indiceMin);

		sc.close();
		
	
	}

}
