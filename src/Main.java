public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // Сумма кредита в рублях
        int credit = 1_000_000;

        // Годовая процентная ставка
        double creditRate = 9.99;

        // Срок кредита в годах
        int duration = 3;

        // Считаем ежемесячный аннуитентный платёж
        double creditPayment = service.calculate(credit, creditRate, duration);

        // округляем до целого числа
        String creditPaymentInteger = String.format("%.0f",creditPayment);
        System.out.println("Сумма кредита: " + credit + " руб.");
        System.out.println("Годовая процентная ставка: " + creditRate + " %.");
        System.out.println("Срок кредита: " + duration + " лет.");
        System.out.println("Сумма ежемесячного платежа: " + creditPaymentInteger + " руб.");
    }
}