import java.util.Scanner;
public class TotalTTC{ 
	public static void main (String[] args){
		// déclaration des variables ...
		float prixHT , totalHT, totalTTC, montTVA, tauxR, montRem, tot;
		// déclaration de la variable pour la quantité
		int qte;
		final float TAUX_TVA = 0.196f;
		// saisie du prix de l'article et de la quantité souhaitée
		Scanner sc = new Scanner(System.in);
		System.out.print ("Entrez le prix HT de l'article en euros : ");
		prixHT = sc.nextFloat();
		System.out.print ("Entrez la quantité souhaitée : ");
		qte =sc.nextInt();
		//calcul du total HT
		totalHT = prixHT * qte;
		// on teste totalHT pour déterminer le taux de remise
		if (totalHT<500)
			tauxR=0;
		else //ici on sait que totalHT<500 est faux donc totalHT>=500
			if (totalHT<=1000)
				tauxR=0.05f;
			else tauxR=0.1f;
		// calcul et affichage du montant de la remise
		montRem = totalHT * tauxR;
		System.out.println("Montant de la remise : "+ montRem+"€.");
		// calcul et affichage du montant apres remise
		tot=totalHT-montRem;  
		System.out.printf("TotalHT après remise déduite: %.2f €. \n", tot);
		// calcul du montant de TVA
		montTVA = tot * TAUX_TVA;
		//affichage du résultat
		System.out.printf ("Montant de la TVA : %.2f €. \n", montTVA);
		// calcul du total TTC
		totalTTC= tot + montTVA;
		//affichage du résultat
		System.out.printf ("Total à payer : %5.2f €. \n",totalTTC);
		
		sc.close();
	}
}
