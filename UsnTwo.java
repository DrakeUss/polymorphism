package Dz;

public class UsnTwo extends TaxSystem {
    public int calcTaxFor(int debit, int credit) {
        return 15 * (debit - credit) / 100;
    }
}
