import java.util.Scanner;
public class Location {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dureeLocation , kilometragePrevu;
		double dureeEssence , kilometrageEssence , totalPrixEssence , dureeDiesel , kilometrageDiesel , totalPrixDiesel;
		
		System.out.print("Quel va etre la durée de votre location ? : ");
		dureeLocation = sc.nextInt();
		
		System.out.print("Quel va etre votre kilometrage previsionnel ? :");
		kilometragePrevu = sc.nextInt();
		
		dureeEssence = 22 * dureeLocation;
		kilometrageEssence = 0.13 * kilometragePrevu;
		totalPrixEssence = dureeEssence + kilometrageEssence;
		
		dureeDiesel = 24 * dureeLocation;
		kilometrageDiesel = 0.10 * kilometragePrevu;
		totalPrixDiesel = dureeDiesel + kilometrageDiesel;
		
		if (totalPrixEssence < totalPrixDiesel ) {
			System.out.println("Le tarif essence est plus avantageux : " + totalPrixEssence + "$");
		}
		if (totalPrixEssence == totalPrixDiesel) {
			System.out.println("Diesel : " + totalPrixDiesel + "Essence : " + totalPrixEssence );
		}
		if (totalPrixEssence > totalPrixDiesel ) {
			System.out.println("Le tarif diesel est plus avantageux : " + totalPrixDiesel + "$");
		}
		
		sc.close();
		
	}

}
