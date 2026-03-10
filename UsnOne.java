package Dz;

public class UsnOne extends TaxSystem {
    public int calcTaxFor(int debit, int credit) {
        return (debit * 6) / 100;
    }
}
