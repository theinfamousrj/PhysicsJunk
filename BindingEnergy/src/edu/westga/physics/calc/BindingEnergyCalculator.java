/**
 * 
 */
package edu.westga.physics.calc;

/**
 * @author theinfamousrj
 *
 */
public class BindingEnergyCalculator {
	
	private double m10 = 1.008664904;
	private double m11 = 1.007276470;
	//private double m01 = 0.000548579903;
	//private double cSquared = 931.4942214;
	private double cSquared = 931.503;
	
	public BindingEnergyCalculator() {
		
	}
	
	public double calculateBindingEnergy(int A, int Z, double Mass) {
		double result;
		
		result = (((A-Z) * m10) + (Z * m11) - Mass) * cSquared;
		return result;
	}
	
	public double calculateBindingEnergyOverA(int A, int Z, double Mass) {
		double result;
		
		result = ((((A-Z) * m10) + (Z * m11) - Mass) * cSquared) / A;
		return result;
	}
}
