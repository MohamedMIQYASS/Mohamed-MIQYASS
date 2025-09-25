import java.util.Scanner; // necessaire pour les saisies
public class Moy{ 
public static void main (String[] args){
	// déclaration des variables pour les 3 notes et de la variable pour le résultat
	float n1 , n2 , n3, moy;
	Scanner sc = new Scanner(System.in);// création de sc de la classe Scanner
	// saisie des 3 notes grace a sc de la classe Scanner
	System.out.print ("Entrez la premiere note : ") ;
	n1 = sc.nextFloat(); // nextFloat() permet la saisie de réel
	System.out.print ("Entrez la deuxieme note : ") ;
	n2 =sc.nextFloat();
	System.out.print ("Entrez la troisieme note : ") ;
	n3 =sc.nextFloat();
	//calcul de la moyenne
	moy=(n1+n2+n3)/3 ;
	//affichage du résultat
	System.out.println("La moyenne est "+ moy);
	
    sc.close();
	}
}

