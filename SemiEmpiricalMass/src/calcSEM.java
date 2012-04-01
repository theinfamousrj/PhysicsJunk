import java.util.ArrayList;

/**
 * 
 * @author theinfamousrj
 *
 */
public class calcSEM {
	
	private ArrayList<String> listOfMasses = new ArrayList<String>();
	public StringBuilder listOfMassesAsString = new StringBuilder();
	
	private ArrayList<String> listOfBindingEnergies = new ArrayList<String>();
	public StringBuilder listOfBindingEnergiesAsString = new StringBuilder();
	
	private double a1 = 0.0169123;
	private double a2 = 0.0191140;
	private double a3 = 0.0007626;
	private double a4 = 0.1017500;
	private double a5 = 0.0360000;
	
	private double av = 15.5;
	private double as = 16.8;
	private double ac = 0.72;
	private double asym = 23.2;
	
	private double m10 = 1.008664904;
	private double m11 = 1.007276470;
	private double m01 = 0.000548579903;
	private double cSquared = 931.4942214;
	
	public calcSEM() {
		
	}
	
	public double getMassFromSemiEmpiricalFormula(int A, int Z) {
		double result = 0.0;
		int N = A - Z;
		int modA = A % 2;
		int modZ = Z % 2;
		
		double m1 = (N * m10);
		double m2 = (Z * m11);
		double m3 = (a1 * A);
		double m4 = (a2 * Math.pow(A, (2/3)));
		double m5 = (a3 * (Math.pow(Z, 2))/Math.pow(A, (1/3)));
		double m6 = (a4 * (Math.pow(((A/Z)-Z), 2)/A));
		double m7 = (a5 / (Math.pow(A, (3/4))));
		
		if(modA > 0){
			m7 = 0.0;
		}
		else if(modA == 0 && modZ > 0){
			m7 = 1 * m7;
		}
		else if(modA == 0 && modZ == 0){
			m7 = -1 * m7;
		}
		
		result = m1 + m2 - m3 + m4 + m5 + m6 + m7;
		
		return result;
	}
	
	public double getBindingEnergyFromSemiEmpiricalFormula(int A, int Z) {
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
	
	public double getBindingEnergy(int A, int Z) {
		double result = 0.0;
		
		double b1 = ((A - Z) * m10);
		double b2 = ((Z) * m11);
		double b3 = this.getMassFromSemiEmpiricalFormula(A, Z);
		
		result = (b1 + b2 - b3);
		result = result * cSquared;
		
		return result;
	}
	
	public void getMultipleMassesFromSemiEmpiricalFormula(int A, int initialZ, int finalZ) {
		listOfMasses.clear();
		
		int count = finalZ - initialZ;
		
		for(int i=0; i<=count; i++) {
			double massDouble = this.getMassFromSemiEmpiricalFormula(A, (initialZ+i));
			String massString = Double.toString(massDouble);
			listOfMasses.add(massString);
		}
		
	}
	
	public void getMultipleBindingEnergiesFromSemiEmpiricalFormula(int A, int initialZ, int finalZ) {
		listOfBindingEnergies.clear();
		
		int count = finalZ - initialZ;
		
		for(int i=0; i<=count; i++) {
			double bindingEnergyDouble = this.getMassFromSemiEmpiricalFormula(A, (initialZ+i));
			String bindingEnergyString = Double.toString(bindingEnergyDouble);
			listOfMasses.add(bindingEnergyString);
		}
	}
	
	public void compileMultipleMassesFromArrayList() {
		listOfMassesAsString.delete(0, listOfMassesAsString.length());
		
		for(int i=0; i<listOfMasses.size(); i++) {
			listOfMassesAsString.append(listOfMasses.get(i));
			listOfMassesAsString.append("\n");
		}
	}

	public void compileMultipleBindingEnergiesFromArrayList() {
		listOfBindingEnergiesAsString.delete(0, listOfBindingEnergiesAsString.length());
		
		for(int i=0; i<listOfBindingEnergies.size(); i++) {
			listOfBindingEnergiesAsString.append(listOfBindingEnergies.get(i));
			listOfBindingEnergiesAsString.append("\n");
		}
	}
}
