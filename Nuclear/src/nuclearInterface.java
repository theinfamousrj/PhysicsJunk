import java.util.Scanner;

/**
 * 
 */

/**
 * @author theinfamousrj
 *
 */
public class nuclearInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int A, Z;
		double Mass;
		
		nuclearCalc calc = new nuclearCalc();
		Scanner in = new Scanner(System.in);
		
		System.out.print("A: ");
		A = in.nextInt();
		
		System.out.print("Z: ");
		Z = in.nextInt();
		
		System.out.print("Mass: ");
		Mass = in.nextDouble();
		
		System.out.println("Binding Energy: " + calc.bindingEnergyMass(A, Z, Mass));
		
		/**
		System.out.println("Mass: " + calc.getMass(A, Z));
		
		System.out.println("Binding Energy: " + calc.bindingEnergy(A, Z));
		System.out.println("Neutron Separation Energy: " + calc.neutronSeparation(A, Z));
		System.out.println("Proton Separation Energy: " + calc.protonSeparation(A, Z));
		System.out.println("Alpha Separation Energy: " + calc.alphaSeparation(A, Z));
		System.out.println("Beta Plus Separation Energy: " + calc.betaPlusSeparation(A, Z));
		System.out.println("Beta Minus Separation Energy: " + calc.betaMinusSeparation(A, Z));
		*/

	}

}
