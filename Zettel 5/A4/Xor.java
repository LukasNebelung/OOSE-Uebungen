public class Xor {
    public static void main(String[] args) {
        // Benotigte Komponenten instanzieren
        Component in1 = new PassGate(); // A
        Component in2 = new PassGate(); // B
        Component n1 = new NotGate();
        Component a1 = new AndGate();
        Component n2 = new NotGate();
        Component a2 = new AndGate();
        Component o1 = new OrGate();
        // Bauteile vernetzen
        in1.connectTo(a1); // A direkt mit AND verbinden
        in2.connectTo(n1); // B zunachst mit NOT verbinden
        n1.connectTo(a1); // NOT mit AND verbinden
        in1.connectTo(n2);
        in2.connectTo(a2);
        n2.connectTo(a2);
        a1.connectTo(o1);
        a2.connectTo(o1);
        // Circuit-Klasse instanzieren und Ausgang von AND registrieren
        Circuit c1 = new Circuit();
        c1.exitgates.add(o1);
        in1.state = true; // Eingang A festlegen
        in2.state = false; // Eingang B festlegen
        // Schaltung simulieren und Wert des ersten und einzigen Ausgang ausgeben
        System.out.println(c1.simulate().get(0));
    }
}
