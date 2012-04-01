import java.util.Scanner;

/**
 * @author theinfamousrj
 *
 */
public class iSEM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int A, initialZ;//, finalZ;
		
		calcSEM calc = new calcSEM();
		Scanner in = new Scanner(System.in);
		
		System.out.print("A: ");
		A = in.nextInt();
		
		System.out.print("Initial Z: ");
		initialZ = in.nextInt();
		
		//System.out.print("Final Z: ");
		//finalZ = in.nextInt();
		
		System.out.println(calc.getMassFromSemiEmpiricalFormula(A, initialZ));
		//System.out.println(calc.getBindingEnergy(A, initialZ));
		
		//calc.getMultipleMassesFromSemiEmpiricalFormula(A, initialZ, finalZ);
		//calc.compileMultipleMassesFromArrayList();
		
		//calc.getMultipleBindingEnergiesFromSemiEmpiricalFormula(A, initialZ, finalZ);
		//calc.compileMultipleBindingEnergiesFromArrayList();
		
		//System.out.println(calc.listOfMassesAsString);
		//System.out.println("\n");
		//System.out.println(calc.listOfBindingEnergiesAsString);
	}

}
