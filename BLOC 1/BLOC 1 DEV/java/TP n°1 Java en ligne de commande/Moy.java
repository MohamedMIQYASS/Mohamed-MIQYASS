import java.util.Scanner; // necessaire pour les saisies
public class Moy{ 
public static void main (String[] args){
	// d�claration des variables pour les 3 notes et de la variable pour le r�sultat
	float n1 , n2 , n3, moy;
	Scanner sc = new Scanner(System.in);// cr�ation de sc de la classe Scanner
	// saisie des 3 notes grace a sc de la classe Scanner
	System.out.print ("Entrez la premiere note : ") ;
	n1 = sc.nextFloat(); // nextFloat() permet la saisie de r�el
	System.out.print ("Entrez la deuxieme note : ") ;
	n2 =sc.nextFloat();
	System.out.print ("Entrez la troisieme note : ") ;
	n3 =sc.nextFloat();
	//calcul de la moyenne
	moy=(n1+n2+n3)/3 ;
	//affichage du r�sultat
	System.out.println("La moyenne est "+ moy);
	
    sc.close();
	}
}

