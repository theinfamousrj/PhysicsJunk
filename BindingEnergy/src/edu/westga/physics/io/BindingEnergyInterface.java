/**
 * 
 */
package edu.westga.physics.io;

import java.util.Scanner;
import edu.westga.physics.calc.BindingEnergyCalculator;

/**
 * @author theinfamousrj
 *
 */
public class BindingEnergyInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int A;
		int Z;
		double Mass;
		
		BindingEnergyCalculator calc = new BindingEnergyCalculator();
		Scanner in = new Scanner(System.in);
		
		System.out.print("A: ");
		A = in.nextInt();
		
		System.out.print("Z: ");
		Z = in.nextInt();

		System.out.print("Mass: ");
		Mass = in.nextDouble();
		
		//System.out.println(calc.calculateBindingEnergy(A, Z, Mass));
		System.out.println(calc.calculateBindingEnergyOverA(A, Z, Mass));
		
	}

}
