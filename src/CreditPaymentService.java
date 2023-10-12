public class CreditPaymentService {
    public double calculate(double totalCredit, int m) {
        double mps = 9.99 / (100 * 12);
        double a = 1 - (1 / Math.pow(1 + mps, m));
        double b = mps / a;
        double pay = totalCredit * b;
        return pay;
    }
}