public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        double payment = (int)service.calculate(1_000_000, 9.99, 12);
        System.out.println(payment);

        System.out.println();
        double payment2 = (int)service.calculate(1_000_000, 9.99, 24);
        System.out.println(payment2);

        System.out.println();
        double payment3 = (int)service.calculate(1_000_000, 9.99, 36);
        System.out.println(payment3);
    }
}