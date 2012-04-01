import java.util.Scanner;

/**
 * 
 */

/**
 * @author theinfamousrj
 *
 */
public class isoInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double Ta, Tb, Tc, Wac, Wba, Wbc, Qac, Qba, Qbc, N, Qin, Wnet, P1, P2, V1, V2;
		int n;
		
		isoCalc calc = new isoCalc();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number of moles: ");
		n = in.nextInt();
		
		System.out.print("Lower pressure: ");
		P1 = in.nextDouble();
		
		System.out.print("Higher pressure: ");
		P2 = in.nextDouble();
		
		System.out.print("Lower volume: ");
		V1 = in.nextDouble();
		
		System.out.print("Higher volume: ");
		V2 = in.nextDouble();
		
		Ta = calc.calcTemp(P1, V2, n);
		Tb = calc.calcTemp(P1, V1, n);
		Tc = calc.calcTemp(P2, V1, n);
		
		Wac = calc.calcIsoWork(Ta, V1, V2, n);
		Wba = calc.calcWork(P1, V1, V2);
		Wbc = calc.calcWork(P1, V1, V1);
		
		Qac = Wac;
		Qba = calc.calcQp(Tb, Ta, n);
		Qbc = calc.calcQv(Tc, Tb, n);
		
		Qin = Qac + Qbc;
		Wnet = Wac + Wba;
		
		N = calc.calcEfficiency(Qin, Wnet);
		
		System.out.println("Ta = " + Ta + "K");
		System.out.println("Tb = " + Tb + "K");
		System.out.println("Tc = " + Tc + "K");
		
		System.out.println("Wac = " + Wac + "J");
		System.out.println("Wba = " + Wba + "J");
		System.out.println("Wbc = " + Wbc + "J");
		
		System.out.println("Qac = " + Qac + "J");
		System.out.println("Qba = " + Qba + "J");
		System.out.println("Qbc = " + Qbc + "J");
		
		System.out.println("Qin = " + Qin + "J");
		System.out.println("Wnet = " + Wnet + "J");
		System.out.println("Efficiency = " + N + "%");
	}

}
