import java.util.Scanner;

/**
 * 
 */

/**
 * @author theinfamousrj
 *
 */
public class adiInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double Ta, Tb, Tc, Wca, Wab, Wbc, Qca, Qab, Qbc, N, Qin, Wnet, P1, P2, V1, V2;
		int n;
		
		adiCalc calc = new adiCalc();
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
		
		Wca = calc.calcAdiWork(P1, P2, V1, V2);
		Wab = calc.calcWork(P1, V1, V2);
		Wbc = calc.calcWork(P1, V1, V1);
		
		Qca = 0.0;
		Qab = calc.calcQp(Tb, Ta, n);
		Qbc = calc.calcQv(Tc, Tb, n);
		
		Qin = Qca + Qbc;
		Wnet = Wca + Wab;
		
		N = calc.calcEfficiency(Qin, Wnet);
		
		System.out.println("Ta = " + Ta + "K");
		System.out.println("Tb = " + Tb + "K");
		System.out.println("Tc = " + Tc + "K");
		
		System.out.println("Wac = " + Wca + "J");
		System.out.println("Wba = " + Wab + "J");
		System.out.println("Wbc = " + Wbc + "J");
		
		System.out.println("Qac = " + Qca + "J");
		System.out.println("Qba = " + Qab + "J");
		System.out.println("Qbc = " + Qbc + "J");
		
		System.out.println("Qin = " + Qin + "J");
		System.out.println("Wnet = " + Wnet + "J");
		System.out.println("Efficiency = " + N + "%");

	}

}
