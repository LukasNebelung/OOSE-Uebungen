
public class Aufgabe3 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Eingabe: ");
		int k = sc.nextInt(); // liest eine Ganzzahl (int) ein
		System.out.println(++k); // Ausgabe a): k wird inkrementiert und danach ausgegeben
		System.out.println(k); // Ausgabe b): k wird ausgegeben
		System.out.println(k++); // Ausgabe c) k wird ausgegeben und dannach inkrementiert
		/* 1.k+1
		 * 2.print k
		 * 3.print k
		 * 4.print k
		 * 5.k+1
		 */
		int k2 = 5;
		double result = k2 / 2.0; // Stelle 1 // Man muss aus der 2 eine 2.0 machen.
		System.out.println("5 / 2 = " + result); // Ausgabe d)
		boolean b = false;
		/*
		if(b == false) {  // es wurde eine zuweisungsoperator benutzt. zum Vergleichen müss "==" benutzt werden.
		System.out.println("b ist falsch."); // Ausgabe e)
		} else {
		System.out.println("b ist wahr."); // Ausgabe f)
		}
		*/
		System.out.println( ( b == false ) ? "b ist falsch" : "b ist wahr" );
		//System.out.println( ( b = false) ? "b ist falsch" : "b ist wahr" );//

	}

}
