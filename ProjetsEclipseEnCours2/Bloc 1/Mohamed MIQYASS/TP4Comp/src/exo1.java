import java.util.*;

public class exo1 {

	public static void main(String[] args) {

		int i = 0;
		float formuleA = 0 , formuleB = 0;

		while(formuleB <= formuleA) {
			i++;
			formuleA = (float) (39 + 3.5*i);
			formuleB = (float) (4.75*i);
		}
		System.out.println("C'est au bout de " + i + " " + "locations que la formule A est plus rentable que la formule B ");
	}
}
