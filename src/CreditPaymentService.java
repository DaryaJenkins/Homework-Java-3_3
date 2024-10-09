public class CreditPaymentService {
    public double calculate(double amount, double percentYear, int months) {
        int monthly;
        double percentMonth;

        percentMonth = (percentYear / 100) / 12;

        monthly = (int) (amount * percentMonth / (1 - Math.pow((1 + percentMonth), -months)));
        return monthly;
    }
}