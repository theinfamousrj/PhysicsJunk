package edu.westga.physics.io;

import java.util.Scanner;
import edu.westga.physics.controller.theCalc;


/**
 * @author theinfamousrj
 *
 */
public class semInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int A, Z;
		double M;
		theCalc calcSEM = new theCalc();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("A: ");
		A = in.nextInt();
		
		System.out.print("Z: ");
		Z = in.nextInt();
		
		System.out.print("M: ");
		M = in.nextDouble();
		
		String results = "Binding energy: " + calcSEM.calculateSEM(A, Z, M);
		System.out.print(results);
		
	}

}
