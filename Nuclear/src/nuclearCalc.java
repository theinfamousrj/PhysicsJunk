/**
 * 
 */

/**
 * @author theinfamousrj
 *
 */
public class nuclearCalc {
	
	/**
	 * Constants
	 */
	private double electronMass = 0.000548579903;
	private double neutronMass = 1.008664904;
	private double protonMass = 1.007276470;
	//private double h1Mass = 1.007825032;
	private double alphaMass = 4.00260325;
	private double cSquared = 931.4942214;
	/**
	private double av = 15.5;
	private double as = 16.8;
	private double ac = 0.72;
	private double asym = 23.2;
	*/
	
	/**
	 * Try to implement some sort of search function that returns a mass when given an A and a Z
	 * public double searchMasses(int A, int Z){
	 * 		return Mass;
	 * }
	 * 
	 * this should replace all the Mass and SeparatedMass variables
	 */
	public nuclearCalc(){
		
	}
	
	public double bindingEnergyMass(int A, int Z, double Mass){
		double result = (((A-Z) * neutronMass) + ((Z) * protonMass) - Mass) * cSquared / A;
		
		return result;
	}
	
	public double bindingEnergy(int A, int Z){
		double result = (((A-Z) * neutronMass) + ((Z) * protonMass) - this.getMass(A, Z)) * cSquared;
		
		return result;
	}
	
	public double neutronSeparation(int A, int Z){
		double result = (this.getMass((A - 1), Z) + neutronMass - this.getMass(A, Z)) * cSquared;
		
		return result;
	}
	
	public double protonSeparation(int A, int Z){
		double result = (this.getMass((A - 1), (Z - 1)) + protonMass - this.getMass(A, Z)) * cSquared;
		
		return result;
	}
	
	public double alphaSeparation(int A, int Z){
		double result = (this.getMass((A - 4), (Z - 2)) + alphaMass - this.getMass(A, Z)) * cSquared;
		
		return result;
	}
	
	public double betaPlusSeparation(int A, int Z){
		double result = (this.getMass(A, Z) - this.getMass(A, (Z + 1))) * cSquared;
		
		return result;
	}
	
	public double betaMinusSeparation(int A, int Z){
		double result = (this.getMass(A, Z) - this.getMass(A, (Z - 1)) - (2 * electronMass)) * cSquared;
		
		return result;
	}
	
	public double getMass(int A, int Z){
		double result = (((A - Z) * protonMass) + (Z * neutronMass));
		
		/**
		double ap = 0.0;
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
		
		double resultA = ((A - Z) * neutronMass);
		double resultB = (Z * (electronMass + protonMass));
		double resultC = ((av * A) / cSquared);
		double resultD = ((as * Math.pow(A, (2 / 3))) / cSquared);
		double resultE = ((ac * Z * (Z - 1)) / Math.pow(A, (1 / 3)));
		double resultF = ((asym * Math.pow((A - (2 * Z)), 2)) / (A * cSquared));
		double resultG = (ap / (Math.pow(A, (3/4)) * cSquared));
		
		double totalResult = resultA + resultB - resultC + resultD + resultE + resultF + resultG;
		
		return totalResult;
		*/
		
		return result;
	}
	
}
