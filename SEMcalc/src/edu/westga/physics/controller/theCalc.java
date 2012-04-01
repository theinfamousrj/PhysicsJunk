/**
 * 
 */
package edu.westga.physics.controller;

/**
 * @author theinfamousrj
 *
 */
public class theCalc {
	
	private double av = 15.5;
	private double as = 16.8;
	private double ac = 0.72;
	private double ap;
	private double asym = 23.2;
	
	private double m10 = 1.008664904;
	private double m11 = 1.007276470;
	private double m01 = 0.000548579903;
	private double cSquared = 931.4942214;
	
	public theCalc() {
		
	}
	
	public double calculateSEM(int A, int Z, double M) {
		
		int N = A - Z;
		int modA = A % 2;
		int modN = N % 2;
		int modZ = Z % 2;
		
		if(modA > 0){
			ap = 0.0;
		}
		else if(modN > 0 && modZ > 0){
			ap = 34.0;
		}
		else if(modN == 0 && modZ == 0){
			ap = -34.0;
		}
		
		double b1 = ((A - Z) * m10);
		double b2 = (Z * (m01 + m11));
		double b3 = ((av * A) / cSquared);
		double b4 = ((as * Math.pow(A, (2 / 3))) / cSquared);
		double b5 = ((ac * Z * (Z - 1)) / Math.pow(A, (1 / 3)));
		double b6 = ((asym * Math.pow((A - (2 * Z)), 2)) / (A * cSquared));
		double b7 = (ap / (Math.pow(A, (3/4)) * cSquared));
		
		double result = b1 + b2 - b3 + b4 + b5 + b6 + b7;
		
		return result;
	}

}
