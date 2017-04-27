
public class drei {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Eingabe: ");
		int k = sc.nextInt(); // liest eine Ganzzahl (int) ein
		System.out.println(++k); // Ausgabe a)
		System.out.println(k); // Ausgabe b)
		System.out.println(k++); // Ausgabe c)
		int k2 = 5;
		double result = k2 / 2.; // Stelle 1
		System.out.println("5 / 2 = " + result); // Ausgabe d)
		boolean b = false;
		System.out.println( (  b ) ? "bist falsch" : "b ist wahr" );
		}

	}

