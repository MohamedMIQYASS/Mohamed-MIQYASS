public class f3
{


	//EX I

	// methode test

	public static void test (int n40, int n50) {
		System.out.println("Debut de la methode test");
		System.out.println("nombre de calculatrices a 40 euros : "+n40);
		System.out.println("nombre de calculatrices a 50 euros : "+n50);
		double prix=50*n50+40*n40;
		System.out.println("Le prix en euros avant remise est : "+prix);
		if (prix>1000)
		{
			prix=prix*0.9;
		}
		else
		{
			if (prix>800)
			{
				prix=prix*0.95;
			}	

		}
		System.out.println("Le prix en euros apres remise est : "+prix);
		System.out.println("Fin de la methode test");
		System.out.println(" ");
	}



	//EX II

	// methode tarif

	public static void tarif(int age) {


		// A completer ou modifier

		System.out.println("Debut de la methode tarif avec comme parametre age=70");
		System.out.println("Le prix  est de 8 euros.");
		double prix;
		if (age < 3 ){
			prix = 0;	
		} else {
			if (age<18 || age>50) {
				prix = 
			}
		}
		System.out.println("Fin de la methode tarif");
		System.out.println(" ");
	}




	//EX III

	// methode tri2n

	public static void tri2n(int a,int b) {

		// A completer ou modifier

		System.out.println("Debut de la methode tri2n avec comme parametres a=4 et b=2");
		System.out.println("2<=4");
		System.out.println("Fin de la methode tri2n");
		System.out.println(" ");
	}


	// methode tri3n

	public static void tri3n(int a,int b,int c) {


		// A completer ou modifier

		System.out.println("Debut de la methode tri3n avec comme parametres a=4,b=1 et c=2");
		System.out.println("1<=2<=4");
		System.out.println("Fin de la methode tri3n");
		System.out.println(" ");
	}





	// Methode main : Test des differentes methodes de la feuille d'exercice.

	public static void main(String[] args) {


		// Tests pour EX I

		//Question 1
		//test(8,10);

		//Question 2
		//test(15,10);

		//Question 3
		test(5,10);


		// Tests pour EX II

		/*
		tarif(2);
		tarif(3);
		tarif(16);
		tarif(18);
		tarif(40);
		tarif(50);
		tarif(70);
		 */

		// Tests pour EX III

		//Question 1
		//tri2n(4,2);
		//tri2n(2,4);

		//Question 2
		//tri3n(4,1,2);
		//tri3n(2,4,1);
		//tri3n(2,4,3);
		//tri3n(2,2,3);

	}

}

