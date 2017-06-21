package ose;

public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();
        Bank bank3 = new Bank();

        bank1.addKonto("Max Mustermann", 100000000L);
        bank2.addKonto("Max Mustermann", 700000000L);
        bank3.addKonto("Max Mustermann", 2000000000L);
        for (int i = 0; i < 100; i++) {
            bank1.invest();
            bank2.invest();
            bank3.invest();
        }
        System.out.println("Bank 1:");
        bank1.printJahresbericht();
        System.out.println("Bank 2:");
        bank2.printJahresbericht();
        System.out.println("Bank 3:");
        bank3.printJahresbericht();
    }
}
