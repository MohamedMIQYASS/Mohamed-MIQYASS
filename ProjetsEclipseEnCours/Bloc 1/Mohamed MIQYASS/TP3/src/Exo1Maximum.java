import java.util.Scanner;
public class Exo1Maximum{ 
	public static void main (String[] args){
		// déclaration des  variables qui contiendront les 2 nombres entiers
		
		int nb1 , nb2;
		
		// saisie des nombres
		Scanner sc = new Scanner(System.in);
		System.out.print ("Entrez le premier nombre : ");
		nb1 = sc.nextInt();
	   
		System.out.print ("Entrez le second nombre (différent du premier) : ");
		nb2 = sc.nextInt();
	   
		System.out.print("Le nombre le plus grand est: ");
		// on compare les 2 nombres et on affiche le plus grand
		if (nb1 > nb2) {
			System.out.println( nb1 + " est le plus grand  ");
		}
		else {
			System.out.println( nb2 + " est le plus grand  ");
		}
	}
}
