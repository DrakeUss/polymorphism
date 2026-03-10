package Dz;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Boss", new UsnOne());
        company.shiftMoney(300);
        company.shiftMoney(-50);
        company.shiftMoney(250);
        company.payTaxes();

        company.setTaxSystem(new UsnTwo());
        company.shiftMoney(300);
        company.shiftMoney(-50);
        company.shiftMoney(250);
        company.payTaxes();
    }
}
