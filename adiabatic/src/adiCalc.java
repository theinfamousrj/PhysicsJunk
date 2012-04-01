/**
 * 
 */

/**
 * @author theinfamousrj
 *
 */
public class adiCalc {
	
	private double R = 8.3143;
	
	public adiCalc(){
		
	}
	
	public double calcTemp(double p, double v, int n){
		double T = (p * v) / (n * R);
		return T;
	}
	
	public double calcAdiWork(double p1, double p2, double v1, double v2){
		double W = 1.5 * ((p2 * v1) - (p1 * v2));
		return W;
	}
	
	public double calcWork(double p, double v1, double v2){
		double W = p * (v1 - v2);
		return W;
	}
	
	public double calcQp(double Tb, double Ta, int n){
		double Q = (n * 2.5 * R) * (Tb - Ta);
		return Q;
	}
	
	public double calcQv(double Tc, double Tb, int n){
		double Q = (n * 1.5 * R) * (Tc - Tb);
		return Q;
	}
	
	public double calcEfficiency(double Qin, double Wnet){
		double N = (Wnet / Qin) * 100;
		return N;
	}
}
