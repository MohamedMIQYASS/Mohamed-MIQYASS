import java.util.*;

public class exo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int nbrRandom = r.nextInt(1, 100);
		int nbrTentatives = 0;
		int coups_max = 10;
		int nbrUser;

		System.out.println(nbrRandom);
		System.out.println("Veuillez saisir un nombre entier compris entre 0 et 100 : ");
		nbrUser = sc.nextInt();

		while (nbrUser > 100 || nbrUser < 1) {
			System.out.println("Veuillez saisir un nombre entier VALIDE compris entre 0 et 100 : ");
			nbrUser = sc.nextInt();
		}

		do {
			if (nbrUser > nbrRandom) {
				nbrTentatives++;
				System.out.println("Nombre de tentatives : " + nbrTentatives);
				System.out.println("Le nombre saisi est trop grand , veuillez réessayer : ");
				nbrUser = sc.nextInt();
			} else {
				if (nbrUser < nbrRandom) {
					nbrTentatives++;
					System.out.println("Nombre de tentatives : " + nbrTentatives);
					System.out.println("Le nombre saisi est trop petit , veuillez réessayer : ");
					nbrUser = sc.nextInt();
				} else {
					if (nbrTentatives < coups_max) {
						System.out.println("Bien joué ! le nombre choisi était :  " + nbrRandom);
					}
				}
			}
		} while (nbrTentatives <= coups_max && nbrUser != nbrRandom);

		if (nbrTentatives > coups_max && nbrUser != nbrRandom) {
			System.out.println("Vous avez dépassé le nombre de tentatives autorisés ");
		}
		sc.close();
	}

}
