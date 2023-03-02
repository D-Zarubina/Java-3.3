public class CreditPaymentService {
    public int calculate(double credit, int months, double percent) {
        double i = percent / 100 / 12;
        double payment = (credit * (i + (i / (Math.pow((1 + i), months) - 1))));
        return (int) payment;
    }
}
